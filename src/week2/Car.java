package week2;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    @Override
    public String toString() {
        return "engine is "+engine;
    }
}
