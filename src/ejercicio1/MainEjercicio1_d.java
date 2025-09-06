package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {
	public static void main(String[] args) {
		
	        HashSet<Persona> personas = new HashSet<>();

	        personas.add(new Persona("12345678", "Juan", "Pérez",LocalDate.of(1990, 5, 12), "Masculino", "Calle Falsa 123","1112345678", "juan.perez@mail.com"));
	        personas.add(new Persona("23456789", "María", "Gómez",LocalDate.of(1985, 3, 8), "Femenino", "Av. Siempreviva 742","1122334455", "maria.gomez@mail.com"));
	        personas.add(new Persona("34567890", "Pedro", "López",LocalDate.of(2000, 7, 21), "Masculino", "San Martín 500","1198765432", "pedro.lopez@mail.com"));
	        personas.add(new Persona("45678901", "Lucía", "Fernández",LocalDate.of(1998, 11, 30), "Femenino", "Mitre 250","1133445566", "lucia.fernandez@mail.com"));
	        personas.add(new Persona("56789012", "Ana", "Martínez",LocalDate.of(1995, 9, 15), "Femenino", "Belgrano 800","1144556677", "ana.martinez@mail.com"));
	        
	        Iterator<Persona> it = personas.iterator();
	        while (it.hasNext()) {
	            Persona p = it.next();
	            System.out.println(p);
	        }
	}

}
