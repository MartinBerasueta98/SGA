package Model;

import Exceptions.EmptyAirlineException;

public class AviationStack {
    private static String getAirlineInfo(String title) throws EmptyAirlineException {
        if (title.isEmpty()) {
            throw new EmptyAirlineException("Error: Title cannot be empty.");
        }
        String[] titleArray = title.split(" ");
        StringBuilder url = new StringBuilder("https://api.aviationstack.com/v1/airlines");
        for (int i = 0; i < titleArray.length; i++) {
            url.append(titleArray[i]);
            if (i < (titleArray.length - 1)) {
                url.append("+");
            }
        }
        url.append("97f15b8be6f3166740924a17f0e670da");
        return url.toString();
    }
}
