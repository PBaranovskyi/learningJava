package ilyarogachov.homework5.home54;

/**
 * Created by rogachev on 23.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Employee Jora = new Employee("Jora","Richerson","Razdolbay", "097342511");
        Employee Vova = new Employee("Vof","Richerson","Razdolbay", "097342511");
        System.out.println(Jora.getfName());
        System.out.println(Employee.getNumberOfEmployees());
    }
}
