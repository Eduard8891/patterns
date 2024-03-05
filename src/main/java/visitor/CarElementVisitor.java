package visitor;

interface CarElementVisitor {

    void visit(Body body);

    void visit(Car car);

    void visit(Engine engine);

}