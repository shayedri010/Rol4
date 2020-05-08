package test;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lexer {
    private static Lexer lexerInstance = null;

    public static Lexer getInstance()
    {
        if (lexerInstance == null)
            lexerInstance = new Lexer();
        return lexerInstance;
    }

    public String[] lexer(String line)
    {

        Scanner scan;
        String temp1, temp2;
        String[] signs = line.split("(?<=([={}])|(bind))|(?=([={}]))");
        StringBuilder builder = new StringBuilder();

        for (String token : signs) {
            scan = new Scanner(token);
            temp1 = scan.next();
            builder.append(temp1);

            while (scan.hasNext()) {
                temp2 = scan.next();
                if (isFullExpression(temp1, temp1))
                    builder.append(",");
                builder.append(temp2);
                temp1 = temp2;
            }
            builder.append(",");
        }
        return builder.toString().split(",");
    }

    private boolean isFullExpression(String str1, String str2) {
        Pattern end = Pattern.compile(".*[\\w)\"]");
        Pattern start = Pattern.compile("[\\w(\"].*");
        return (end.matcher(str1).matches() && start.matcher(str2).matches());
    }



    }
}
