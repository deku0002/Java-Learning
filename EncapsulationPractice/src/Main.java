public class Main{
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Intial Pages count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(81);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",pagesPrinted,printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",pagesPrinted,printer.getPagesPrinted());
    }
}