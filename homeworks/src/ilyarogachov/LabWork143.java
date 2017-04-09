package ilyarogachov;

/**
 * Created by rogachev on 09.04.17.
 */
public class LabWork143 {
    public static void main(String[] args) {
        boolean one=true;
        boolean two=false;
        if (one==true && two==false){
            System.out.println("AND");
        } else {
            System.out.println("no AND");
        }

        if (one==false || two==false) {
            System.out.println("OR");
        } else {
            System.out.println("not OR");
        }

        if (one!=false && two!=true) {

            System.out.println("NOT equal");
        } else {

            System.out.println("not correct");
        }

        boolean f = one ^ two;
        System.out.println(f);

        if (one^two==true || two^one==true) {
            System.out.println("conditions is True");
        } else {

            System.out.println("System False");
        }

    }
}
