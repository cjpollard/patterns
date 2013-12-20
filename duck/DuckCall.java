package duck;

public class DuckCall {
	
	QuackBehaviour qb = new Quack();
	
	public DuckCall() {
		
	}
	
	public void performQuack() {
		qb.quack();
	}
}
