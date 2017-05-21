package ua.kstt.justymenko.module07;

/**
 * Created by n1kropol on 5/21/17.
 */
public class Employee {
    String firstName;
    String lastName;
    String occupation;
    String telephone;
    static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
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

    public static void main(String[] args) {
        Employee dev = new Employee("Ivanov", "Ivan", "dev", "099-123-45-67");
        Employee qa = new Employee("Petrov", "Petr", "qa", "050-123-45-67");
        Employee ba = new Employee("Sidorov", "Semen", "ba", "063-123-45-67");
        System.out.println("Amount of employees: " + numberOfEmployees);
    }
}
