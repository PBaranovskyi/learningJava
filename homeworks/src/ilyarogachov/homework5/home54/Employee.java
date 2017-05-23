package ilyarogachov.homework5.home54;

/**
 * Created by rogachev on 23.05.17.
 */
public class Employee {
    String fName, lName, occ, tel;
    private static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String telephone) {

        fName = firstName;
        lName = lastName;
        occ=occupation;
        tel=telephone;
        numberOfEmployees++;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getOcc() {
        return occ;
    }

    public String getTel() {
        return tel;
    }
}
