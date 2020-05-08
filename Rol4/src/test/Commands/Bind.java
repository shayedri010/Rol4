package test.Commands;

import test.Expression.Calculator;
import test.OurInterpreter;

public class Bind implements Command{


    public void doCommand(String[] variables)
    {
        OurInterpreter.getBindTable().put(variables[0],variables[1]);
    }
}
