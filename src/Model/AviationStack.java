package Model;

import Exceptions.EmptyAirlineException;
import Exceptions.NotFoundException;
import org.json.JSONException;
import org.json.JSONObject;

public class AviationStack {
    private static String getAirlineURL(String airlineName) throws EmptyAirlineException {
        if (airlineName.isEmpty()) {
            throw new EmptyAirlineException("Error: Title cannot be empty.");
        }
        String[] titleArray = airlineName.split(" ");
        StringBuilder url = new StringBuilder("api.aviationstack.com/v1/airlines?access_key=97f15b8be6f3166740924a17f0e670da");
        for (int i = 0; i < titleArray.length; i++) {
            url.append(titleArray[i]);
            if (i < (titleArray.length - 1)) {
                url.append("+");
            }
        }
        return url.toString();
    }

    private static String fetchJsonFromUrl(String airlineName) throws NotFoundException, JSONException, EmptyAirlineException {
        String url = getAirlineURL(airlineName);
        String json = API.getInfo(url);
        JSONObject jsonObject = new JSONObject(json);
        boolean response = jsonObject.getBoolean("Response");
        if (!response) {
            throw new NotFoundException("Error: Airline not found - " + airlineName);
        }
        return json;
    }

    public static Airline searchAirline(String airlineName) throws NotFoundException, EmptyAirlineException{
        Airline airline = new Airline();
        try {
            String json = fetchJsonFromUrl(airlineName);
            JSONObject jsonObject = new JSONObject(json);
            airline.setAirlineName(jsonObject.getString("airline_name"));
            airline.setIATAcode(jsonObject.getString("iata_code"));
            airline.setStatus(jsonObject.getString("status"));
            airline.setType(jsonObject.getString("type"));
            return airline;
        } catch (JSONException exception){
            System.out.println("No internet connection, please try again later.");
            return null;
        }
    }

}
