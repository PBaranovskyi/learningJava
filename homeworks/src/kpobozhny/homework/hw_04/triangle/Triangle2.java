package kpobozhny.homework.hw_04.triangle;

/**
 * Created by kostya on 4/29/17.
 */
public class Triangle2 {

    private Point[] verticies;

    public Triangle2(Point a, Point b, Point c) {

        verticies = new Point[3];
        this.verticies[0] = a;
        this.verticies[1] = b;
        this.verticies[2] = c;
    }

    public Point getVertexA() {
        return verticies[0];
    }

    //possible index values are: 1,2,3.
    public void setVertex(int index, Point point) {

        //shift index value to the 'java array' format
        index--;

        //check condition
        if (((verticies[(index+1)%3].getX() == point.getX()) && (verticies[(index+2)%3].getX() == point.getX())) ||
                ((verticies[(index+1)%3].getY() == point.getY()) && (verticies[(index+2)%3].getY() == point.getY()))) {
            System.out.println("Sorry, your coordinates are invalid (All triangle's vertices can not belong to the same line)!");
        } else {
            this.verticies[index] = point;
        }
    }



    public Point getVertexB() {
        return verticies[1];
    }



    public Point getVertexC() {
        return verticies[2];
    }



    public void print() {
        System.out.println("Triangle ABC:");
        System.out.println("A(" + getVertexA().getX() + "; " + getVertexA().getY() + ")");
        System.out.println("B(" + getVertexB().getX() + "; " + getVertexB().getY() + ")");
        System.out.println("C(" + getVertexC().getX() + "; " + getVertexC().getY() + ")");
        System.out.println("******************************");
        //System.out.println("ABC Perimeter: " + getPerimeter());
        //System.out.println("ABC Square: " + getSquare());
        System.out.println("ABC Perimeter: " + String.format("%.2f", getPerimeter()));
        System.out.println("ABC Square: " + String.format("%.2f", getSquare()));
    }

    private double getSideLength(Point point1, Point point2) {

        return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2));
    }

    public double getPerimeter() {
        return getSideLength(verticies[0], verticies[1]) +
                getSideLength(verticies[1], verticies[2]) +
                getSideLength(verticies[2], verticies[0]);
    }

    // Heron's formula
    public double getSquare() {
        double semiPerimeter = getPerimeter() / 2;

        return Math.sqrt(semiPerimeter *
                (semiPerimeter - getSideLength(verticies[0], verticies[1])) *
                (semiPerimeter - getSideLength(verticies[1], verticies[2])) *
                (semiPerimeter - getSideLength(verticies[2], verticies[0])));
    }

    public static void main(String[] args) {
        Triangle2 triangle = new Triangle2(new Point(0, 0), new Point(0, 10), new Point(10, 0));
        triangle.print();

        //try to update a vertex with incorrect coordinates
        System.out.println();
        System.out.println("******************************");
        //trying to set invalid coordinates to the vertex C
        triangle.setVertex(3, new Point(0, 5));
    }


}
