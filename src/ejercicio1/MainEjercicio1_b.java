package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;


public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("46020028","Alex","Farias", LocalDate.of(1995,9,9), "M", "Avenida Siempreviva 742", "1100900248", "AlexFarias@gmail.com", "Administrativo");
		Empleado e2 = new Empleado("22222222","Salas","Flaco", LocalDate.of(1990, 8, 20), "M", "Calle 2 456", "1168790432", "bruno@gmail.com", "Soporte");
		Empleado e3 = new Empleado("48484848","Salas","Flaco", LocalDate.of(1999,3,2), "M", "Calle 234", "1167436623", "SalasBeats@gmail.com", "Desarrollador");
		Empleado e4 = new Empleado("50505004","Zell","Sosa", LocalDate.of(2004,9,9), "M", "Calle 1360", "1122334455", "ZellTypeBeats@gmail.com", "Programador Jr");
		Empleado e5 = new Empleado("44018043","Mia","Kayne", LocalDate.of(2005,6,9), "F", "Calle Huntr", "1124356778", "KayneLoveR@gmail.com", "RRHH");
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		listaEmpleados.add(e5);
		
        System.out.println("Listado de emplados: ");
        
        Iterator<Empleado> it = listaEmpleados.iterator();
		while (it.hasNext()) {
			Empleado empleado = it.next();
			it.remove();
			System.out.println(empleado.toString());
		}

	}

}
