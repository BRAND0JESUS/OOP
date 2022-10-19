class UberX extends Car {       /* extends means inheritance */
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);     /*super means super class constructor metod*/
        this.brand = brand;     /* this -> refere the subclass' atributes */
        this.model = model;
    }
}