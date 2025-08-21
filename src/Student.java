public class Student {
    int roll_no;
    String name;
    Student (int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Roll no is "+roll_no);
    }
}
