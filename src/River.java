import java.util.Random;

public class River {
	static int LENGTH = 10;

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		Animal[] r = new Animal[LENGTH];
		for (int i = 0; i < LENGTH; i++) {
			int k;
			Random rand = new Random();
			k = rand.nextInt(3);
			if (k == 0) {
				r[i] = new Fish();
			} else if (k == 1) {
				r[i] = new Bear();
			} else {
				r[i] = null;
			}
			
			if (r[i] == null) {
				System.out.print("~ water ");
			} else {
				System.out.print("~ " + r[i].getDescription() + r[i].id + " ");
			}
		}
		System.out.println("~");
		System.out.println("Move 1:");
		Random move = new Random();
		for (int pos = 0; pos < LENGTH; pos++) {

			if (r[pos] != null) {
				int m = move.nextInt(3);
				
				switch(m){
					case 0:{
						//if the object is in the fist position, can't move back
						if (pos !=0) {
							//move to the previous position if its empty
							if(r[pos-1] == null){
								r[pos-1] = r[pos];
								r[pos] = null;
							}
							//check the object in the previous position to determine what to do
							else{
								//Adding an animal
								if (r[pos-1].getDescription().equals(r[pos].getDescription())){
									Animal newAnimal = r[pos].newAnimal();
									for (int n = 0; n < LENGTH; n++) {
										if (r[n] == null) {
											r[n] = newAnimal;
											break;
										}
									}
								}
								else{
									if (r[pos].getDescription().equals("Bear")) {
										r[pos-1] = r[pos];
										r[pos] = null;
									}
									else {
										r[pos] = null;
									}
								}
							}
							
						}
						break;
					}
					
					case 2: {
						if (pos != LENGTH - 1) {
							//move to the previous position if its empty
							if(r[pos+1] == null){
								r[pos+1] = r[pos];
								r[pos] = null;
							}
							//check the object in the previous position to determine what to do
							else{
								//Adding an animal
								if (r[pos+1].getDescription().equals(r[pos].getDescription())){
									Animal newAnimal = r[pos].newAnimal();
									for (int n = 0; n < LENGTH; n++) {
										if (r[n] == null) {
											r[n] = newAnimal;
											break;
										}
									}
								}
								else{
									if (r[pos].getDescription().equals("Bear")) {
										r[pos+1] = r[pos];
										r[pos] = null;
									}
									else {
										r[pos] = null;
									}
								}
							}
							
						}
						break;
					}
					
					default:{
						break;
					}
				}
			}
		
		}
		
		for(Animal a: r){
			if(a == null){
				System.out.print("~ water ");
			}
			else{
				System.out.print("~ " +a.getDescription()+ a.id+ " ");
			}
		}
		System.out.print("~");
	}
	
}
