package pruebatreeset;

import java.util.Comparator;

public class OrdenarNombre implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		if(p1.getNombre().compareTo(p2.getNombre()) == 0){
			return p1.getId().compareTo(p2.getId());
		}
		return p1.getNombre().compareTo(p2.getNombre());
	}

}
