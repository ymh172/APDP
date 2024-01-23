package week1;

public class InterfaceSegregationTest {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        double circleArea = c.area();

        Cube cube = new Cube(5);
        double cubeArea = cube.area();
        double cubeVolume = cube.volume();

        System.out.println("Area of circle is "+ circleArea);
        System.out.println("Area of cube is "+ cubeArea);
        System.out.println("Volume of cube is "+ cubeVolume);
    }
}
