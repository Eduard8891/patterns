package proxy;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConcreteProgram implements Program {

    @Override
    public String businessLogicMethod() {
        return "Program business logic";
    }
}