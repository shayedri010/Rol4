package test;

import test.Commands.*;

import java.util.*;


public class Parser {
    private static HashMap<String,Command> CommandsHash = new HashMap<String, Command>();

    private static void initializeCommandsHASHmap() {
        CommandsHash.put("=", new Assign());
        CommandsHash.put("return", new Return());
        CommandsHash.put("openDataServer", new openDataServer());
        CommandsHash.put("connect", new Connect());
        CommandsHash.put("var", new Command());
        CommandsHash.put("disconnect", new Disconnect());
        CommandsHash.put("while", new While());
        CommandsHash.put("bind", new Bind());

    }
}
