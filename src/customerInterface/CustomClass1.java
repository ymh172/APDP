package customerInterface;

public class CustomClass1 implements CustomInterface1{
    @Override
    public void method1() {
        System.out.println("It is interface abstract method");
    }

    public static void main(String[] args) {
        CustomInterface1 instance = new CustomClass1();
        instance.method1();
        instance.method2();
        CustomInterface1.method3();
    }
}
