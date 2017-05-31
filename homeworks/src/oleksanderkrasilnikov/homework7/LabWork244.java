package oleksanderkrasilnikov.homework7;


public class LabWork244 {

    public static void main(String[] args) {
        Employee ted = new Employee("Ted", "Ivankov", "accoubntant", "123-123-123-123");
        Employee brad = new Employee("Brad", "Ivankov", "accoubntant", "123-123-123-123");
        System.out.println(Employee.getNumberOfEmployees());
    }
}
