/* 1)
function Car() {
    this.id;
    this.license;
    this.driver;
    this.passenger;
}
*/

/* 2)
function Car(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}

Car.prototype.printDataCar = function() {
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}
*/



// USING  EcmaScript 6 STANDAR 
class Car {

    constructor(license, driver) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar() {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
    
}