package reflection;

public abstract class Persona {

	public String nombre;
	public String apellido;
	public byte edad;

	public String getApellido() {
		return apellido;
	}

	public byte getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract String getProfesión();

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
