public class Main{
    public static void main(String[] args) {

        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial Health is: "+tim.healthRemaining());

        EnhancedPlayer timmy = new EnhancedPlayer("Timmy",200,"Sword");
        System.out.println("Initial Health is: "+timmy.healthRemaining());
    }
}