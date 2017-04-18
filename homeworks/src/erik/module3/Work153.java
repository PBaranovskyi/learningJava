package erik.module3;

/**
 * Created by Erik Pavliuk on 14/04/2017.
 */
public class Work153 {
    public static void main(String[] args) {
        System.out.println("*|  1  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------");
        for (int i=1; i<10; i++){
            String out = i +"|";
            for (int k=1; k<10; k++) {
                if (k*i>=10)
                    out += " " + k*i;
                else
                    out += "  " + k*i;
            }
            System.out.println(out);
        }
    }
}
