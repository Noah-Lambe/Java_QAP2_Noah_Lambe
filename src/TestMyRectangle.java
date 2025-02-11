public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle(new MyPoint(1, 2), new MyPoint(4, 6));

        System.out.println("Rectangle: " + rectangle);

        System.out.println();

        System.out.println("Top Left Point: " + rectangle.getTopLeft());
        System.out.println("Top Right Point: " + rectangle.getTopRight());
        System.out.println("Bottom Right Point: " + rectangle.getBottomRight());
        System.out.println("Bottom Left Point: " + rectangle.getBottomLeft());

        System.out.println();

        rectangle.setTopLeft(new MyPoint(3, 5));

        System.out.println();

        System.out.println("New Top Left Point: " + rectangle.getTopLeft());

        System.out.println();

        System.out.println("final Rectangle after changes: " + rectangle);
    }
}
