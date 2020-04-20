package test.Expression;

public class Number implements Expression {
	private double val;
	
	public Number(double val) {
		super();
		this.val = val;
	}

	@Override
	public double calculate() {
		return val;
	}

}
