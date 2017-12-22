
public class Bear extends Animal {
	
	public String getDescription() {
		return "Bear";
	}
	
	public Animal newAnimal(){
		return new Bear();
	}
}
