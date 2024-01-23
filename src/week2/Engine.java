package week2;

public interface Engine {

}

class PetrolEngine implements Engine{

    public String toString(){
        return "Petrol engine";
    }
}
class DieselEngine implements Engine{
    public String toString() {
        return "Diesel Engine";
    }
}
class GasolineEngine implements Engine{

    public String toString() {
        return "Gasoline Engine";
    }
}
