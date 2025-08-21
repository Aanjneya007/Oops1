public class Main_Oops2 {
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation(01, "Aanjneya", "A");
        System.out.println(e1.roll_no);
        System.out.println(e1.name);
        e1.setGrade("A+");
        System.out.println(e1.getGrade());
    }
}
