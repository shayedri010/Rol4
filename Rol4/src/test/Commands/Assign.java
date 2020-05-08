package test.Commands;

import test.Expression.Calculator;
import test.OurInterpreter;

public class Assign implements Command{


    public void doCommand(String[] variables)
    {
        OurInterpreter.getSimTable().put(variables[0], Calculator.calc(variables[1]));
    }

    }

