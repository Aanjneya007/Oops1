public abstract class Oops1 {
    int roll_no;
    public String name;
    Oops1(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    abstract void attend_class();
    abstract void give_exam();

    void register(){
        System.out.println("Name is "+name+". registered Successfully with Roll No "+roll_no);
    }
}
