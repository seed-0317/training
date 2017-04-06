package generic.clazz;

interface Engine {}
class FastEngine implements Engine {}
class SlowEngine implements Engine {}









class Car {
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}

















public class NotUsingGenerics {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setEngine(new SlowEngine());
		
		SlowEngine slowEngine = (SlowEngine) car.getEngine(); //possible ClassCastException... BAD!
		
	}
}
