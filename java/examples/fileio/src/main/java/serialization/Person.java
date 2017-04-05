package serialization;

import java.io.Serializable;

/*
 * This is a Person class to show the serialization example
 * 
 * You have to 'white list' the objects that you want to be serializable
 * 		If not, NotSerializableException will be thrown during serialization
 * 
 * NOTE: Any class that inherits a Serializable class is also serializable.
 * NOTE: Make sure all instance variables are also serializable.
 * NOTE: Transient instance variables do not have to be Serializable.
 * 
 * 
 * private static final long serialVersionUID
 * 
 * serialVerionUID is important during deserialization
 * 		During deserialization, the JVM will check to make sure the
 * 		serialVersionUID of the serialized object matches that of the class.
 * 		If they don't match, an InvalidClassException is thrown.
 * 
 * 		However, the serialVersionUID is NOT required.  If it's not defined,
 * 		then the JVM will generate one based on things defined in the class.
 * 		It is strongly recommended to define the serialVersionUID because 
 * 		different JVMs (or even the same JVM) may generate different numbers.
 */
public class Person {
	
	
	private static final long serialVersionUID = -3216962222413787646L;

	private String name;
	private int age;
	private transient String ssn;
	
	public Person(){}

	public Person(String name, int age, String ssn) {
		super();
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", ssn=" + ssn + "]";
	}
	
}
