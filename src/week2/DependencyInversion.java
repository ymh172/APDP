package week2;

public class DependencyInversion {
    public static void main(String[] args) {
        Car car1=new Car(new DieselEngine());
        Car car2=new Car(new DieselEngine());
        Car car3=new Car(new GasolineEngine());

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
