package ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {

		TreeSet<Empleado>  empleados = new TreeSet<>();
		
		Empleado e1 = new Empleado("33012012", "Lucas", "Morales", LocalDate.of(1988, 5, 12), "M", "Calle 1234", "1112233445", "lucas.morales@gmail.com", "Contabilidad");
		Empleado e2 = new Empleado("77034021", "Sofia", "Perez", LocalDate.of(1992, 11, 3), "F", "Avenida Central 456", "1198765432", "sofia.perez@gmail.com", "Marketing");
		Empleado e3 = new Empleado("55056078", "Diego", "Ramirez", LocalDate.of(1997, 7, 21), "M", "Calle Luna 789", "1187654321", "diego.ramirez@gmail.com", "Soporte");
		Empleado e4 = new Empleado("66078012", "Valentina", "Gomez", LocalDate.of(2000, 2, 14), "F", "Boulevard Sol 321", "1176543210", "valentina.gomez@gmail.com", "RRHH");
		Empleado e5 = new Empleado("88099034", "Matias", "Vega", LocalDate.of(1995, 12, 30), "M", "Calle Estrella 987", "1165432109", "matias.vega@gmail.com", "Desarrollo");
		Empleado e6 = new Empleado("88099034", "Matias", "Vega", LocalDate.of(1995, 12, 30), "M", "Calle Estrella 987", "1165432109", "matias.vega@gmail.com", "Desarrollo");

		
		
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		empleados.add(e5);
		empleados.add(e6);
		
		Iterator<Empleado> it = empleados.iterator();
		while (it.hasNext())
		{
			Empleado emps = it.next();
			System.out.println(emps.toString());
		}
	}

}
