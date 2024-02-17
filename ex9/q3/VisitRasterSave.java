public class VisitRasterSave implements Visitor{

    @Override
    public void visit(Circle c) {
        System.out.printf("Saving the circle... with radius = %f at position %d, %d as raster%n",c.getRadius(), c.getxPos(), c.getyPos());
    }

    @Override
    public void visit(Rectangle r) {
        System.out.printf("Saving the rectangle...with width = %d height = %d at position %d, %d as raster%n",r.getWidth(), r.getHeight(), r.getxPos(), r.getyPos());
    }

    @Override
    public void visit(Triangle t) {
        System.out.printf("Saving the triangle...with base = %d height = %d at position %d, %d as raster%n",t.getBase(), t.getHeight(), t.getxPos(), t.getyPos());
    }
}
