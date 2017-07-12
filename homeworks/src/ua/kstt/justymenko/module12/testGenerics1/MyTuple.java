package ua.kstt.justymenko.module12.testGenerics1;

/**
 * Created by n1kropol on 7/4/17.
 */

public class MyTuple<A,B,C> {
    private A a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }

    public static void main(String[] args) {
        MyTuple tuple1 = new MyTuple("str", new Integer(123), new Long(321));
        MyTuple tuple2 = new MyTuple(new Double(1.01), "str2", "str3");
    }
}
