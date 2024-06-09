import Model.Employer;
import Model.Menu;
import Model.Passanger;

public class Main {
    public static void main(String[] args) {

        Employer e = new Employer("AAA","BBB",34, 242543454,
                "E1","Piloto","disponible");

        Passanger p = new Passanger("CCC","DDD",23,34564566,"ASD123");

        System.out.println("e = " + e);
        System.out.println("p = " + p);

        /*Menu menu = new Menu();
        menu.employerMenu();*/
    }
}