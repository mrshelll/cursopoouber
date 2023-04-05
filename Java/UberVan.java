class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    Map<String> seatsMaterial;
    private Integer passenger;

    public UberBlack(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, Map<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberBlack(String license, Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6)
            this.passenger = passenger;
        else
            System.out.println("Necesitas asignar 6 pasajeros");
    }
}