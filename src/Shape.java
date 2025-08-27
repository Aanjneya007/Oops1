public class Shape {
    public void draw(double l, double b) {
        double area = l*b;
        System.out.println("Area of Rectangle is: " + area);
    }
    public void draw(double s) {
        double area = s*s;
        System.out.println("Area of Square is: " + area);
    }
//    public void draw(double r) {
//        double area = r*r;
//        System.out.println("Area of Circle is: " + area);
//    }
}
