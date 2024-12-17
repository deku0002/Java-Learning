public class salariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;
    public salariedEmployee(String name,String birthDate,String hireDate,double annualSalary){
        super(name,birthDate,hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double adjustedPay = annualSalary/26;
        return (int)(isRetired?adjustedPay*0.9:adjustedPay);
    }

    public void retired() {
        terminate("12/12/2025");
        isRetired=true;
    }

    @Override
    public String toString() {
        return "salariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
