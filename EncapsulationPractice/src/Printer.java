public class Printer {

    private int tonerLevel,pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel>=0 && tonerLevel<=100)?tonerLevel:-1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {

        int tempAmt = tonerAmount + tonerLevel;
        if(tempAmt<0 || tempAmt>100){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? (pages/2) + (pages%2) : pages;
        pagesPrinted += jobPages;
        if(duplex){
            System.out.println("It is a Duplex Printer");
        }
        return jobPages;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
