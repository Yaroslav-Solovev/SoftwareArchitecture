package HW_Les_4;

/** 
 * Класс для объемных геометрических фигур
 * @autor Yaroslav
 * @version 1.0
*/
abstract class VolumetricFigure extends Shape{
    abstract double getVolume();
    @Override
    abstract double getArea();
    abstract double getPerimeter();
}
