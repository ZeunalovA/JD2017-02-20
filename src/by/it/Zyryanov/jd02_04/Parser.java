package by.it.Zyryanov.jd02_04;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static final List<String> prority = new ArrayList<>(Arrays.asList("=,+,-,*,/"));


    static Var createVar(String part){
        Var res;
        if (part.matches(Patterns.exMat)){
            res=new VarM(part);
        }
        else if (part.matches(Patterns.exVec)){
            res=new VarV(part);
        }
        else if (part.matches(Patterns.exVal)){
            res=new VarF(part);
        }
        else
            res=null;
        return res;
    }

    static Var calc(String expression) {
        Var res=null;
        String[] part = expression.split(Patterns.exOper);
       // operand = new ArrayList<>(Arrays.asList(part));
        Pattern p = Pattern.compile(Patterns.exOper);
        Matcher m = p.matcher(expression);
        String op="";
        if (m.find()){
           // operation.add=(m.group());
        }
        //
        Var one=createVar(part[0]);
        Var two=createVar(part[1]);
        //выполним одну операцию
        if (op.equals("=")){
            two.save(part[0]);
            res=two;
        }
        else if (op.equals("+")){
            res=one.add(two);
        }
        else if (op.equals("-")){
            res=one.sub(two);
        }
        else if (op.equals("*")){
            res=one.mul(two);
        }
        else if (op.equals("/")){
            res=one.div(two);
        }
        return res;
    }
}
