
public class Fish extends Animal{
	
	public String getDescription() {
		return "Fish";
	}
	
	public Animal newAnimal() {
		return new Fish();
	}
}
