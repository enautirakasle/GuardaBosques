import java.util.ArrayList;

public class Zoo {
	private String nombre;
	private String direcionWeb;
	private ArrayList <Animal> animales;
	
	Zoo(String nombre){
		this.nombre=nombre;
		this.animales=new ArrayList<Animal>();
	}

	
	@Override
	public String toString() {
		return "Zoo [nombre=" + nombre + ", direcionWeb=" + direcionWeb + ", animales=" + animales + "]";
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecionWeb() {
		return direcionWeb;
	}

	public void setDirecionWeb(String direcionWeb) {
		this.direcionWeb = direcionWeb;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	

	

}
