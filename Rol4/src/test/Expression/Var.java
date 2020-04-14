package test.Expression;

public abstract class Var implements Expression {
	protected String name;

	public Var(String name) {
		super();
		this.name = name;
	}
	public abstract void set(double val);
}
