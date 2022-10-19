class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model) {
        super(license, driver);     /*super means super class constructor metod*/
        this.brand = brand;     /* this -> refere the subclass' atributes */
        this.model = model;
    }
}