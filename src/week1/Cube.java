package week1;

public class Cube implements Shape, ThreeDShape{

    double edge;

    public Cube(double edge){
        this.edge=edge;
    }


    @Override
    public double area() {
        return 6* Math.pow(edge,2);
    }

    @Override
    public double volume() {
        return Math.pow(edge,3);
    }
}
