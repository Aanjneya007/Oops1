public class Myemp {
    static{
        System.out.println("Myemp static");
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Aanjneya", 50000);
        emp1.display();
        Employee.emp_info();
    }
}
