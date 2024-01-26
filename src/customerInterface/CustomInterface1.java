package customerInterface;

public interface CustomInterface1 {
    void method1(); // public abstract
    default void method2(){
        System.out.println("Inside default method 2");
        method4(); //called private
        method5(); // called private static interface

    } // non static

    public static void method3(){
        method5();
    }

    private void method4(){
        System.out.println("Private interface method 4");
    }

    private static void method5(){
        System.out.println("Static private interface method 5");
    }
}
