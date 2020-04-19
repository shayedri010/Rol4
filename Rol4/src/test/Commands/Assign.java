package test.Commands;

import test.DataBase;

import java.util.List;

public class Assign implements Command{
    @Override
    public void doCommand(List<String> str)
    {
        DataBase db = DataBase.getDbInstance();
        //Check for maximum 3 parameters
        if (str. != 2) {
            //Var left = new Var(variables[0]);
        }
    }
}
