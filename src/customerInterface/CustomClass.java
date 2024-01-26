package customerInterface;

public class CustomClass implements CustomInterface{

    @Override
    public void method1() {
        System.out.println("Abstract method 1 define in class");
    }

    public static void main(String[] args) {
        CustomInterface instance = new CustomClass();
        instance.method1();
        instance.method2();
        CustomInterface.method3();
    }
}
