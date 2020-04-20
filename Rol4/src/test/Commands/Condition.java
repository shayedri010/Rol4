package test.Commands;

import test.Expression.BinaryExpression;
import test.Expression.Expression;

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
                if(left.calculate() > right.calculate())
                    return true;
            case "<":
                if(left.calculate() < right.calculate())
                    return true;
            case ">=":
                if(left.calculate() > right.calculate() || left.calculate() == right.calculate() )
                    return true;
            case "<=":
                if(left.calculate() < right.calculate() || left.calculate() == right.calculate() )
                    return true;
            case "==":
                if(left.calculate() == right.calculate())
                    return true;
            case "!=":
                if(left.calculate() != right.calculate())
                    return true;
        }
        return false;
    }


}
