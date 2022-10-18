from account import Account

class Car:
    id          = int
    license     = str
    # driver      = str
    driver      = Account("", "")       # ("", "") -> obiged dato to instance the object
    passenger   = int

    def __init__(self, license, driver) -> None:
        self.license        = license
        self.driver         = driver