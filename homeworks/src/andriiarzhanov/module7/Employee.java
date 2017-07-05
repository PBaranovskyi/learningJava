package andriiarzhanov.module7;

/**
 * Created by arzhanov on 23.05.17.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;

    private static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        setFirstName(firstName);
        setLastName(lastName);
        setOccupation(occupation);
        setTelephone(telephone);
        numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("firstName1", "LastName1", "occupation1", "telephone1");
        Employee employee2 = new Employee("firstName2", "LastName2", "occupation2", "telephone2");
        Employee employee3 = new Employee("firstName3", "LastName3", "occupation3", "telephone3");
        System.out.println("Total employees: " + Employee.getNumberOfEmployees());
    }

}
