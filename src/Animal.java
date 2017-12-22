
abstract class Animal {
	static int counter = 0;
	int id;
	protected String animal;
	public abstract String getDescription();
	public Animal() {
		animal =  "----";
		counter++;
		id = counter;
	}
	
	public Animal(String animal) {
		this.animal = animal;
	}
	
	public abstract Animal newAnimal();
}
