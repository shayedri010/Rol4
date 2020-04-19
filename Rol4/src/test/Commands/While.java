package test.Commands;
import java.util.List;

public class While implements Command{
    private List<Command> commandList;

    @Override
    public void doCommand(List<String> str)
    {

    }

    public void doCommand(String[] variables)
    {

    }
    public void addCommand(Command c) {
        commandList.add(c);
    }
    private boolean checkCondition() {
        boolean CondBol;

        String[] splited = Condition.split("((?<=<|>|==|!=|<=|>=)|(?=<|>|==|!=|<=|>=))");
       // Double ex1 = Calculator.calc(split[0]); use the func that calculate the expression
      //  Double ex2 = Calculator.calc(split[2]); use the func that calculate the expression

        switch (splited[1]) {
            case "<":
                CondBol = ex1 < ex2;
                break;
            case ">":
                CondBol = ex1 > ex2;
                break;
            case "!=":
                CondBol = ex1 != ex2;
                break;
            case "<=":
                CondBol = ex1 <= ex2;
                break;
            case ">=":
                CondBol = ex1 >= ex2;
                break;
            case "==":
                CondBol = ex1 == ex2;
                break;
            default:
                CondBol = false;
        }
        return CondBol;
    }
}

