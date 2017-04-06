package generic.clazz;















class GenericCar <T extends Engine> {
	private T engine;

	public T getEngine() {
		return engine;
	}
	
	public void setEngine(T engine) {
		this.engine = engine;
	}
}





















public class UsingGenerics {
	public static void main(String[] args) {
		
		GenericCar<SlowEngine> car = new GenericCar<>();
		car.setEngine(new SlowEngine());
		
		SlowEngine slowEngine = car.getEngine(); //generic with compile time safety!!!
		
	}
}
