import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//opciones
		final int CREAR_PERRO_MANSO = 1;
		final int SALIR = 0;
		
		Loro miLoro = new Loro();
		PerroManso miPerro = new PerroManso();
		PerroFiero miPerroFiero=new PerroFiero();
		
		Scanner scan=new Scanner(System.in);
		int opcion;
		int contador = 0;
		
		Perro[] perrera=new Perro[10];
		
		perrera[0] = new PerroManso();

		do {
		System.out.println("Elige una opción");
		System.out.println("/t"+CREAR_PERRO_MANSO+"1. Perro manso");
		System.out.println("/t2.Perro fiero");
		System.out.println("/t3.Imprimir perrera");
		System.out.println("/t"+SALIR+"0.Salir");
		opcion=Integer.parseInt(scan.nextLine());
		switch(opcion) {
		
		case CREAR_PERRO_MANSO:
			
			PerroManso perroManso = new PerroManso();
			perrera[contador]=perroManso;
					contador++;
		break;
		
		case 2://PerroManso 
			PerroFiero perroFiero = new PerroFiero();
			perrera[contador]=perroFiero;
			contador++;
			
		break;
		case 3://imprimir Perrera 
			imprirmirPerrera(perrera);
			
		break;
		
		default:
			}

		}while (opcion!=0);
	}

	private static void imprirmirPerrera(Perro[] perrera) {
		// TODO Auto-generated method stub
		
	}

}
