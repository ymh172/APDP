package week1;

public class FahrenheitToCentigrade {

    public void calculate(float num){
        float cen = 5/9.0f*(num-32f);
        System.out.println("Centigrade is "+ cen);
    }

    public static void main(String[] args) {
        FahrenheitToCentigrade obj = new FahrenheitToCentigrade();
        obj.calculate(98.6f);
    }
}
