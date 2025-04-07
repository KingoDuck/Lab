public class Person{
	//Attributes

	private String name;
	private int age;
	private double height;
	private boolean ifRighty;

	//Constructor (how are going to build this "object")
	//Default Constructor(Generic)
	public Person(){

	}

	public Person(String nameIn){
		this.name = nameIn;
	}


	//THERES A DIFFERENCE. String Int vs Int String
	public Person(String nameIn, int ageIn){
		this.name = nameIn;
		this.age = ageIn
	}

	public Person(int ageIn, String nameIn){
		this.name = nameIn;
		this.age = ageIn;
	}




	public Person(String nameIn, int ageIn, double heightIn, boolean isRightyIn){
		this.name = nameIn;
		this.age = ageIn;
		this.height = heightIn;
		this.isRighty = isRightyIn;
	}


	//Methods
	//Setters & Getters

	//Setters
	public void setName(String nameIn){
		this.name = nameIn;
	}
	public void setAge(int ageIn){
		this.age = ageIn;
	}

	//Getters
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}



}