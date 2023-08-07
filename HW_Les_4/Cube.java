package HW_Les_4;

/** 
 * Класс для куба
 * @autor Yaroslav
 * @version 1.0
*/
class Cube extends VolumetricFigure {
    private double side;


    public Cube(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return 6 * side * side;
    }

    @Override
    double getPerimeter() {
        return 12 * side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }
}
