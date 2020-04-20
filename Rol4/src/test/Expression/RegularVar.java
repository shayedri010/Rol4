package test.Expression;

public class RegularVar extends Var {
	double val;
	
	public RegularVar(String name, double val) {
		super(name);
		this.val = val;
	}

	@Override
	public double calculate() {
		return val;
	}

	@Override
	public void set(double val) {
		this.val = val;
	}

}
