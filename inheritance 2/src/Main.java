public class Main{
    public static void main(String[]args){

        Employee sanjay = new Employee("Sanjay","12/02/2005","22/01/2012");
        System.out.println(sanjay);
        System.out.println("Age = "+sanjay.getAge());
        System.out.println("Pay = "+sanjay.collectPay());

        salariedEmployee ayush = new salariedEmployee("Ayush","12/02/1970","22/01/2023",10000.0);
        System.out.println(ayush);
        System.out.println("Ayush's Paycheck = $"+ayush.collectPay());
        ayush.retired();

        System.out.println();
        System.out.println(ayush);
        System.out.println("Ayush's Pension Check = $"+ayush.collectPay());

        HourlyEmployee Mary = new HourlyEmployee("Mary","12/02/2005","22/01/2012",15);
        System.out.println();
        System.out.println(Mary);
        System.out.println("Mary's Pension Check = $"+Mary.collectPay());
        System.out.println("Mary's Holiday Pay = $"+Mary.getDoublePay());
    }
}