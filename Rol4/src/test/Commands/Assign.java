package test.Commands;

import test.DataBase;

public class Assign implements Command{
    //Var left,right;
//
    //public Assign(Var Left, Var Right){
    //    left = Left;
    //    right = Right;
    //}

    public void doCommand(String[] variables){
       DataBase db = DataBase.getDbInstance();
       //Check for maximum 3 parameters
       if (variables.length != 2 ) {
           //Var left = new Var(variables[0]);
       }

    }
}
