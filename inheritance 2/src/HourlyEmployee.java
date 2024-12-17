public class HourlyEmployee extends Employee{
    double hourlyPayRate;
    public HourlyEmployee(String name,String birthDate,String hiringDate,double hourlyPayRate){
        super(name,birthDate,hiringDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return hourlyPayRate*2;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
