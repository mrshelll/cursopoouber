from car import Car
from account import Account

if __name__ == '__main__':
    car = Car("AMZ879", Account("Andres Cepeda", "SAJS23383"))
    car.passenger = 2
    print(vars(car))
    print(vars(car.driver))