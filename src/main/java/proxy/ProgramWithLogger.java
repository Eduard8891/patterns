package proxy;

public class ProgramWithLogger implements Program {
    private final Program program = new ConcreteProgram();

    @Override
    public String businessLogicMethod() {
        System.out.println("Start method!");
        String text = program.businessLogicMethod();
        System.out.println(text);
        System.out.println("End method!");
        return "text";
    }
}