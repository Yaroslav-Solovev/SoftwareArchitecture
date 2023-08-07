package HW_Les_4;

/** 
 * Главный класс приложения
 * @autor GB, Yaroslav
 * @version 1.0
*/
public class GeometryApp {
    public static void main(String[] args) {
        //* Пример использования конкретных классов геометрических фигур */ 
        Circle circle = new Circle(5.0);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());

        Cube cube = new Cube(2.0);
        System.out.println("Площадь куба: " + cube.getArea());
        System.out.println("Периметр куба: " + cube.getPerimeter());
        System.out.println("Объем куба: " + cube.getVolume());
    }
}