import java.util.Scanner;

public class catalogoDiscos {
	
	Disco disco;
	Disco [] vectorDiscos;
	int contadorDisco;

	public catalogoDiscos() {
		disco = new Disco();
		this.vectorDiscos = new Disco[5];
	}

	public static void main(String[] args) {
		catalogoDiscos catalogo = new catalogoDiscos();
		catalogo.pedirDatos();
		catalogo.mostrarDatos();

	}
	
	public void pedirDatos() {
		boolean volver = false;
		do {
			if (contadorDisco < vectorDiscos.length) {
				int huecoVector = espacioVector();
				Disco nuevoDisco = new Disco();
				
				System.out.println("Deme el nombre del disco: ");
				Scanner nom = new Scanner(System.in);
				nuevoDisco.setNombre(nom.next());
				System.out.println("Deme el año del disco: ");
				Scanner año = new Scanner(System.in);
				nuevoDisco.setAño(año.nextInt());
				System.out.println("Deme el precio del disco: ");
				Scanner precio = new Scanner(System.in);
				nuevoDisco.setPrecio(precio.nextInt());
				System.out.println("Deme el genero del disco: 1:ROCK; 2:POP; 3:JAZZ");
				Scanner gen = new Scanner(System.in);
				int genero = gen.nextInt();
				switch(genero) {
				case 1:
					nuevoDisco.setGenero(Genero.ROCK);
					break;
				case 2:
					nuevoDisco.setGenero(Genero.POP);
					break;
				case 3:
					nuevoDisco.setGenero(Genero.JAZZ);
					break;
				}
				this.vectorDiscos[huecoVector] = nuevoDisco;
				contadorDisco++;
				
				System.out.println("Quiere ingresar otro disco?: 1: si/ 2: no");
				Scanner op = new Scanner(System.in);
				int opcion = op.nextInt();
				switch (opcion) {
				case 1:
					volver = false;
					break;
				case 2:
					volver = true;
					break;
				default:
					System.out.println("Ingrese un numero válido.");
				}
			}
			else {
				System.out.println("No puedes ingresar mas discos.");
				volver = true;
			}
		}while(!volver);
		
	}
	
	public void mostrarDatos() {
		for (int i = 0; vectorDiscos.length > i; i++) {
			if(vectorDiscos[i] != null) {
				System.out.println("--------------------------------------------");
				System.out.println("Nombre del disco: " + vectorDiscos[i].getNombre());
				System.out.println("Año de lanzamiento: " + vectorDiscos[i].getAño());
				System.out.println("Precio del disco: " + vectorDiscos[i].getPrecio());
				System.out.println("Género del disco: " + vectorDiscos[i].getGenero());
			}
		}
		System.out.println("--------------------------------------------");
	}
	
	private int espacioVector() {
		int huecoVector = 0;
		for (int i = 0;i<vectorDiscos.length;i++) {
			if(vectorDiscos[i]== null) {
				huecoVector = i;
				break;
			}
		}
		return huecoVector;
	}

}
