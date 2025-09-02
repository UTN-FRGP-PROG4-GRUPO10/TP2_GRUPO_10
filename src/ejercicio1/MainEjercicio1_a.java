package ejercicio1;

public class MainEjercicio1_a {

	public static void main(String[] args) {


		try {
			Persona persona = new Persona();
			persona.setDni("AA202020");
			System.out.println("Persona agregada correctamente");
		} catch (Exception e) {
			System.out.println("Persona no agregada por no verificar el DNI. " + e.getMessage());
		}
			
		try	{Persona persona2 = new Persona();
			persona2.setDni("20202020");
			System.out.println("Persona agregada correctamente");

		} catch (Exception e) {
			System.out.println("Persona no agregada por no verificar el DNI. " + e.getMessage());
		}
		

	}

}
