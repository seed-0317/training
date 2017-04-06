package generic.method;

public class UsingGenerics {
	
	public static void main(String[] args) {
		Person john = new Person();
		Person anotherJohn = someMethod(john); //Awesome! compile time safety!!
	}
	
	
	public static <T> T someMethod(T dog) {
		return dog;
	}
	
}
