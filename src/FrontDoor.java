public class FrontDoor {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle);
        circle.setRadius(9.2);
        System.out.println(circle);
    }
}
