package test.Commands;

public class Var implements Command{
    String name;
    Double value;

    public Var(String Name, Double Value){
        name = Name;
        value = Value;
    }

    public void doCommand(String[] variables){

    }
}
