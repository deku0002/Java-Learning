public class Main{
    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("2208","Dell","240");
        Monitor monitor = new Monitor("27inch Beast","Acer",27,"2540 x 1440");
        Motherboard motherboard = new Motherboard("BJ-200","ASUS",4,6,"v.2.44");

        PersonalComputer personalComputer = new PersonalComputer("2208","Dell",computerCase,monitor,motherboard);

//        personalComputer.getMonitor().drawPixelAt(10,10,"red");
//        personalComputer.getMotherboard().loadPragram("Windows OS");
//        personalComputer.getComputerCase().pressPowerButton();

        personalComputer.powerUp();
    }
}