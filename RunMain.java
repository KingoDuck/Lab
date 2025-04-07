public class RunMain{
	public static void main(String[] args){
		//Person.java needs to be in same folder as RunMain.java(this file), so RunMain.java can see/read Person.java.


		//Creating a person from Person.java using the constructor in the Person.java
		Person myPerson = new Person();

		myPerson.setName("Bob");
	}
}