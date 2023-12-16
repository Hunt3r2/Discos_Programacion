
public class Disco {
	
	String nombre;
	int año;
	int precio;
	Genero genero;

	public static void main(String[] args) {
		Disco disco = new Disco();
		disco.mostrarDatos();
	}

	public Disco() {
		
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Año: " + getAño());
		System.out.println("Precio: " + getPrecio());
		System.out.println("Género: " + getGenero());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
