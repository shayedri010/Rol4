package test.Commands;

import java.util.List;

public class If implements Command{
    Condition condition;
    List<Command> commands;

    public If(){

    }

    @Override
    public void doCommand(String[] variables) {

    }
}
