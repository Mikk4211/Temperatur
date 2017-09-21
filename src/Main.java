public class Main {

    public static void main(String[] args) {

       // Definerer fahrenheit som en double - fahrenheit kan derfor være et kommatal.
        double fahrenheit = 52.6;

        // Omregningen fra fahrenheit til celcius
        System.out.println(fahrenheit + "°Fahrenheit svarer til " + ((5.0 / 9) * (fahrenheit - 32)) + "°Celcius");

        // Det var vigtigt at divisionen var 5.0 og ikke 5, da den ellers ikke udregner korrekt.
    }
}
