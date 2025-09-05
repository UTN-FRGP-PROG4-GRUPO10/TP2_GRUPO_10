package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona implements Comparable<Empleado> {
	
	private final int legajo;
	private String puesto;
	private static int contadorLegajo = 1000;
	
	public Empleado() {
		super();
		this.legajo = contadorLegajo;
		contadorLegajo++;
		this.puesto = "sin puesto";
	}

	public Empleado(
				String dni, 
				String nombre, 
				String apellido, 
				LocalDate fechaNacimiento,
            	String genero, String direccion, String telefono, String email,
            	String puesto)
	{
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.legajo = contadorLegajo++;
		this.puesto = puesto;
	}

	public static int devuelveProximoLegajo() {
	    return contadorLegajo;
	}

	
	@Override
	public int compareTo(Empleado o) {
		int empleado=this.getDni().compareTo(o.getDni());
		if (empleado==0) return 0;
			return Integer.compare(getLegajo(), o.getLegajo()); 
		
	}

	@Override
	public String toString() {
	    return "Empleado{" +
	           "legajo= " + legajo +
	           ", puesto='" + puesto + '\'' +
	           ", " + super.toString() +
	           '}';
	}


	public int getLegajo() {
		return legajo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
	 
}
