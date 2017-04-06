package generic.method;

public class NotUsingGenerics {
	
	public static void main(String[] args) {
		Person john = new Person();
		Person anotherJohn = (Person) someMethod(john);	//possible ClassCastException
	}
	
	
	public static Object someMethod(Object o) {
		return o;
	}
	
}
