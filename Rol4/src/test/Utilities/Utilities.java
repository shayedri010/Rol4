package test.Utilities;

import test.Expression.RegularVar;
import test.Expression.Var;

public class Utilities {
	public static boolean isDouble(String str) {
		try {
			double d = Double.parseDouble(str);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	public static Var getVar(String name) {
		if(name.equals("x")) //just for check
			return new RegularVar("x",5);
		return null;
	}
}
