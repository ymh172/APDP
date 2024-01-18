package week1;

public class Payroll {

        float pay_rate;
        float workHours;

        public Payroll(float pay_rate, float workHors){
            this.pay_rate = pay_rate;
            this.workHours = workHors;
        }

        public void calculate(){
            float grossPay = pay_rate * workHours;
            float tax = grossPay*0.15f;
            float netPay =grossPay-tax;
            System.out.println("Net pay is "+netPay);
        }

    public static void main(String[] args) {
        Payroll obj = new Payroll(12.0f, 8.5f);
        obj.calculate();
    }

}
