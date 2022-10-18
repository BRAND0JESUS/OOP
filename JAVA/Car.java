public class Car {

    // ATRIBUTES AS GLOBAL VARIABLES
    Integer id;
    String license;
    // String driver;
    Account driver;        /*this is an account inheritance*/
    Integer passenger;


    // CONSTRUCTOR METOD
    public Car(String license, Account driver){     /* public Class(mandatory parameters)*/
        this.license = license;     /*this.atribute = parameter*/
        this.driver = driver;
    }


    // METOD to bring the data of this class
    void printDataCar() {
        System.out.println("Car Licence " + license + " Name Driver: " + driver.name);
    }
}
