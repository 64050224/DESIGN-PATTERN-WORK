public interface Visitor {
    //who to visit
    public void visit(Circle element);
    public void visit(Rectangle element);
    public void visit(Triangle element);
}
