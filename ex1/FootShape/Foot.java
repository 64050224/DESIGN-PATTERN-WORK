import java.util.Scanner;

public class Foot {
    FootShape footShape;

    public static void main(String[] args) {
        Foot foot = new Foot();
        foot.footShape = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.println("What to draw? 1.Ellipse, 2.Rectangle");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                foot.footShape.drawAsEllipse();
                break;
            case 2:
                foot.footShape.drawAsRectangle();
                break;
        }
        inp.close();
    }
}
