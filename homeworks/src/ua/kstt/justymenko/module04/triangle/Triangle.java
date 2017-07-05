package ua.kstt.justymenko.module04.triangle;

/**
 * Created by n1kropol on 4/22/17.
 *
 * Вторая:Создайте класс треугольников на координатной плоскости,
 * используя в качестве полей объекты-точки.
 * Реализуйте в классе:
 * а) конструктор, позволяющий задавать вершины;
 * b) метод print(), выводящий описание треугольника на экран;
 * c) методы для вычисления периметра и площади треугольника.
 * • Инкапсулируйте поля таким образом, чтобы нельзя было изменить значение любого из них так,
 * чтобы вершины оказались на одной прямой.
 *
 * Для второй задачи вам нужно пользоваться методами класса Math
 * там есть разные математические функции косинус,
 * синус, вознести в степень, взять корень
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    double ab = 0.00;
    double ac = 0.00;
    double bc = 0.00;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a.getX() == b.getX() && a.getX() == c.getX() && b.getX() == c.getX())
            System.out.println("points are on one line");
        else if (a.getY() == b.getY() && a.getY() == c.getY() || b.getY() == c.getY())
            System.out.println("points are on one line");

        calculateLines();
    }

    public void print(){
        System.out.println("Point A.x = " + a.getX());
        System.out.println("Point A.y = " + a.getY());
        System.out.println("Point B.x = " + b.getX());
        System.out.println("Point B.y = " + b.getY());
        System.out.println("Point C.x = " + c.getX());
        System.out.println("Point C.y = " + c.getY());

        System.out.println("Line AB = " + ab);
        System.out.println("Line AC = " + ac);
        System.out.println("Line BC = " + bc);
    }

    public double calculatePerimeter(){
        return ab + ac + bc;
    }

    private void calculateLines(){
        ab = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) +
                Math.pow(b.getY() - a.getY(), 2));
        ab = Math.abs(ab);

        ac = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) +
                Math.pow(c.getY() - a.getY(), 2));
        ac = Math.abs(ac);

        bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) +
                Math.pow(c.getY() - b.getY(), 2));
        bc = Math.abs(bc);

    }

    public double calculateSquare(){
        double p = (ab + ac + bc) / 2;
        double s = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        return s;
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(2, 4);
        Point c = new Point(3, 1);
        Triangle triangle1 = new Triangle(a, b, c);
        triangle1.print();

        System.out.println("Perimeter = " + triangle1.calculatePerimeter());
        System.out.println("Square = " + triangle1.calculateSquare());
    }
}
