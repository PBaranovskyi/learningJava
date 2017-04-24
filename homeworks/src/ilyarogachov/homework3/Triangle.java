package ilyarogachov.homework3;

/**
 * Created by Tom on 24.04.2017.
 */
public class Triangle {
    public static void main(String[] args) {
        double ploshad;
        Points one = new Points(1,1);
        Points two = new Points(-2,4);
        Points three = new Points(-2,-2);
        Count firs = new Count();
        ploshad = firs.getArea(one,two,three);
        System.out.print(ploshad);

    }
}
