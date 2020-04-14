package test.Commands;

public class Condition{

    Expression left,right;
    String operator;

    public Condition(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        if(checkOperator(operator)){
          this.operator = operator;
        }
    }

    public boolean checkOperator(String operator){
        if( operator.equals(">")  ||
            operator.equals("<")  ||
            operator.equals(">=") ||
            operator.equals(">=") ||
            operator.equals("==") ||
            operator.equals("!=") ){
           return  true;
        }
        else{
           return false;
        }
    }
    public boolean ConditionIsTrue(){
        switch (this.operator){
            case ">":
                if(left.getValue() > right.getValue())
                    return true;
            case "<":
                if(left.getValue() < right.getValue())
                    return true;
            case ">=":
                if(left.getValue() > right.getValue() || left.getValue() == right.getValue() )
                    return true;
            case "<=":
                if(left.getValue() < right.getValue() || left.getValue() == right.getValue() )
                    return true;
            case "==":
                if(left.getValue() == right.getValue())
                    return true;
            case "!=":
                if(left.getValue() != right.getValue())
                    return true;
        }
        return false;
    }


}
