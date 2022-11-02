package pruebatreeset;

public class Persona {
	private String nombre;
	private Integer id;
	
	public Persona(String nombre, Integer id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", id=" + id + "]";
	}
	
	

}
