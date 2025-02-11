public class TestMyLine {
    public static void main(String[] args) {

        MyLine line1 = new MyLine(0, 0, 3, 4);
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line2 = new MyLine(p1, p2);

        System.out.println("Begin Point: " + line1.getBegin());
        System.out.println("End Point: " + line1.getEnd());

        line1.setBegin(new MyPoint(2, 3));
        line1.setEnd(new MyPoint(5, 7));
        System.out.println("Updated Begin Point: " + line1.getBegin());
        System.out.println("Updated End Point: " + line1.getEnd());

        System.out.println("Begin X: " + line2.getBeginX());
        line2.setBeginX(10);
        System.out.println("Updated Begin X: " + line2.getBeginX());

        System.out.println("Begin Y: " + line2.getBeginY());
        line2.setBeginY(20);
        System.out.println("Updated Begin Y: " + line2.getBeginY());

        System.out.println("End X: " + line2.getEndX());
        line2.setEndX(40);
        System.out.println("Updated End X: " + line2.getEndX());

        System.out.println("End Y: " + line2.getEndY());
        line2.setEndY(60);
        System.out.println("Updated End Y: " + line2.getEndY());

        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();
        System.out.println("Begin XY: (" + beginXY[0] + "," + beginXY[1] + ")");
        System.out.println("End XY: (" + endXY[0] + "," + endXY[1] + ")");

        line1.setBeginXY(7, 8);
        line1.setEndXY(10, 12);
        System.out.println("Updated Begin XY: (" + line1.getBeginX() + "," + line1.getBeginY() + ")");
        System.out.println("Updated End XY: (" + line1.getEndX() + "," + line1.getEndY() + ")");

        System.out.println("Line Length: " + line1.getLength());

        System.out.println("Gradient (in radians): " + line1.getGradient());

        System.out.println("Line Info: " + line1);
    }
}
