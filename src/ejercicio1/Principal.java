package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Empleado e1 = new Empleado();

		e1.setDni("46020028");

		e1.setNombre("Alex");

		e1.setApellido("Farias");

		e1.setFechaNacimiento(LocalDate.of(1995,9,9));

		e1.setGenero("M");

		e1.setDireccion("Avenida Siempreviva 742");

		e1.setTelefono("1100900248");

		e1.setEmail("AlexFarias@gmail.com");

		e1.setPuesto("Administrativo");
		
		Empleado e2 = new Empleado();

		e2.setDni("22222222");

		e2.setNombre("Bruno");

		e2.setApellido("Lopez");

		e2.setFechaNacimiento(LocalDate.of(1990, 8, 20));

		e2.setGenero("M");

		e2.setDireccion("Calle 2 456");

		e2.setTelefono("1168790432");

		e2.setEmail("bruno@gmail.com");

		e2.setPuesto("Soporte");

		Empleado e3 = new Empleado("484848484","Salas","Flaco", LocalDate.of(1999,3,2), "M", "Calle 234", "1167436623", "SalasBeats@gmail.com", "Desarrollador");
		Empleado e4 = new Empleado("50505004","Zell","Sosa", LocalDate.of(2004,9,9), "M", "Calle 1360", "1122334455", "ZellTypeBeats@gmail.com", "Programador Jr");
		Empleado e5 = new Empleado("44018043","Mia","Kayne", LocalDate.of(2005,6,9), "F", "Calle Huntr", "1124356778", "KayneLoveR@gmail.com", "RRHH");
			
		Empleado[] empleados = {e1,e2,e3,e4,e5};
		
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}
		System.out.println("... El proximo legajo sera: " + Empleado.devuelveProximoLegajo());
	}

}
