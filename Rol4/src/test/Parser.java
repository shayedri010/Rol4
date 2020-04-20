package test;

import test.Commands.*;

import java.util.HashMap;

public class Parser {
    HashMap<String, Command> commandList;

    public Parser(){
        commandList = new HashMap<>();
        initialCommandList();

    }
    public void initialCommandList(){
        commandList.put("assign",new Assign());
        commandList.put("bind",new Bind());
        commandList.put("if",new If());
        commandList.put("connect", new Connect());
        commandList.put("disconnect",new Disconnect());
        commandList.put("openDataServer", new OpenDataServer());
        commandList.put("print", new Print());
        commandList.put("return", new Return());
        commandList.put("sleep", new Sleep());
        commandList.put("var", new Var());
        commandList.put("while",new While());
    }

}
