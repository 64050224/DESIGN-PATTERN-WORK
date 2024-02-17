public class VisitVectorSave implements Visitor{

    @Override
    public void visit(Circle c) {
        System.out.printf("Saving the circle... with radius = %f at position %d, %d as vector%n",c.getRadius(), c.getxPos(), c.getyPos());
    }

    @Override
    public void visit(Rectangle r) {
        System.out.printf("Saving the rectangle...with width = %d height = %d at position %d, %d as vector%n",r.getWidth(), r.getHeight(), r.getxPos(), r.getyPos());
    }

    @Override
    public void visit(Triangle t) {
        System.out.printf("Saving the triangle...with base = %d height = %d at position %d, %d as vector%n",t.getBase(), t.getHeight(), t.getxPos(), t.getyPos());
    }
}
