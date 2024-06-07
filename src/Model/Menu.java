package Model;
import Exceptions.AlreadyExistsException;
import Exceptions.EmptyAirlineException;
import Exceptions.NotFoundException;

import java.util.Scanner;
public class Menu {
    private final Airport airport;
    private final Scanner scanner;
    private final String passwordAdmin;

    public Menu (){
        airport = new Airport();
        scanner = new Scanner(System.in);
        passwordAdmin = "admin123";
    }

    private String admin;
        public void employerMenu(){
            int opcion;

            do {
                System.out.println("Employer Menu");
                System.out.println("1. Add Airline");
                System.out.println("2. ");
                System.out.println("3. Salir");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 ->addAirline();

                    // Agrega aquí la lógica para la opción 1
                    case 2 -> System.out.println("Has seleccionado la opción 2.");

                    // Agrega aquí la lógica para la opción 2
                    case 3 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                    default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcion != 3);
            scanner.close();
        }

        public void addAirline(){
            System.out.println("Enter airline names: ");
            String airlineName = scanner.nextLine();
            try {
                airport.addAirline(airlineName);
                System.out.println("Airline successfully added");
            }catch (AlreadyExistsException | NotFoundException | EmptyAirlineException e){
                System.out.println(e.getMessage());
            }
        }
}





