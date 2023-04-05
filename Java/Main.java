class Main  {
    
    public static void main(String[] args) {
        UberX uberX = new UberX("AMD456", new Account("Andres Cepeda", "AND524"), "Chevrolet", "Sail");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("AMD445", new Account("Miguel Dussan", "SDF2222"));
        uberVan.setPassenger(6);
    }
}