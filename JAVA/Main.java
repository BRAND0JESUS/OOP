import java.security.Principal;

class Main {
    public static void main(String[] arg){
        System.out.println("Hola Mundo");

        /*
        // Object 1
        Car car = new Car();        //Class_type name_object = word_reserved Constructor_default
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        // System.out.println("Car LIcense: " + car.license);
        car.printDataCar();     // metod to remplace the before line
        */

        // Object 1
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));        //Class_type name_object = word_reserved Constructor_default
        car.passenger = 4;
        car.printDataCar();


        
        /*
        // Object 2
        Car car2 = new Car();
        car2.license = "QWE567";
        car2.driver = "Andrea Herrera";
        car.passenger = 3;
        car2.printDataCar();
        */

        // Object 2
        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}