class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        if(passenger != null)
            System.out.println("License: " + license + " Driver: " + driver.name + " Passengers: " + passenger);
    }

    public Integer getPassenger() {
        return this.passenger;
    }

    public void setPassenger(Integer passenger) {
        if(passenger == 4)
            this.passenger = passenger;
        else
            System.out.println("Necesitas asignar 4 pasajeros");
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return this.license;
    }

    public void setLicense() {
        this.license = license;
    }

    public Account getDriver() {
        return this.driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
}