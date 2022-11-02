package pruebatreeset;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Prueba {

	public static void main(String[] args) {
		Persona persona1 = new Persona("ludmi",1234);
		Persona persona2 = new Persona("angel",3546576);
		Persona persona3 = new Persona("javier",0001);
		
//		Set<Persona> listaTreeSet=new TreeSet<Persona>(new OrdenarNombre());
//		listaTreeSet.add(persona1);
//		listaTreeSet.add(persona2);
//		listaTreeSet.add(persona3);
//		for(Persona l :listaTreeSet){
//			System.out.println(l.toString());
//		}
		
		Map <Persona,Integer> mapa = new TreeMap<Persona,Integer>(new OrdenarNombre());
		mapa.put(persona1, persona1.getId());
		mapa.put(persona2, persona2.getId());
		mapa.put(persona3, persona3.getId());
		
		for (Entry<Persona, Integer> entry : mapa.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		}
		
		/*
		Map <Integer,Persona> mapa2 = new HashMap<Integer, Persona>();
		mapa2.put(persona1.getId(), persona1);
		mapa2.put(persona2.getId(), persona2);
		mapa2.put(persona3.getId(), persona3);
		
		for (Entry<Integer, Persona> entry : mapa2.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		}
		*/
	}

}
