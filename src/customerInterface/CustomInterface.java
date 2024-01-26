package customerInterface;

public interface CustomInterface {
    public void method1();
    public default void method2(){
        System.out.println("Default method");
    }
    public static void method3(){
        System.out.println("Static method");
    }
}
