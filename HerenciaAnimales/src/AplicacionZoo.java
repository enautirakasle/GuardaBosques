
public class AplicacionZoo {
	
	public static void main(String[]args) {
		Zoo zoo = new Zoo("Zoopolis");
		
		
		
		
		Animal animal = new Animal();
		animal.setNombre("Copito de nieve");
		zoo.addAnimal(animal);
		
		Ornitorrinco ornitorrinco = new Ornitorrinco();
		Loro loro = new Loro();
		zoo.addAnimal(ornitorrinco);
		zoo.addAnimal(loro);
	 System.out.println(zoo);
	}

}
