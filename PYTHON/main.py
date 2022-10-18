from car import Car
from account import Account


if __name__ == "__main__":
    print("Hola Mundo")
    
    """
    # INSTANCE CREATION
    car = Car()

    # OBJECT ASIGNATION WITH DATA
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))


    car2 = Car()

    car2.license = "QWE567"
    car2.driver = "Martha"
    print(vars(car2))
    """

    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))