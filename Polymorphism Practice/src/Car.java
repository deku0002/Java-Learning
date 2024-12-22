public class Car {
    String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> start Engine");
    }

    protected void runEngine(){
        System.out.println("Car -> run Engine:)");
    }

    public void drive(){
        System.out.println("Car -> driving, type is "+getClass().getSimpleName());
        runEngine();
    }
}

class gasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders = 6;

    public gasPoweredCar(String description){
        super(description);
    }

    public gasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n",avgKmPerLitre);
    }
}

class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description){
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage exceeds the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{

    private double avgKmPerLitre;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String description){
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int cylinders,int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        class gasPoweredCar extends Car{

            private double avgKmPerLitre;
            private int cylinders = 6;

            public gasPoweredCar(String description){
                super(description);
            }

            public gasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
                super(description);
                this.avgKmPerLitre = avgKmPerLitre;
                this.cylinders = cylinders;
            }

            @Override
            public void startEngine() {
                System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n",cylinders);
            }

            @Override
            protected void runEngine() {
                System.out.printf("Gas -> usage exceeds the average: %.2f %n",avgKmPerLitre);
            }
        }
        System.out.printf("Hybrid -> All %d cylinders are fired up, Ready!%n",cylinders);
        System.out.printf("Hybrid -> Switch %d kWh battery on, Ready!%n",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n",avgKmPerLitre);
    }
}

