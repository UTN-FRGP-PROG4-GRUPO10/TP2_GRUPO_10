package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		Polideportivo P1 = new Polideportivo ("Poli1",111.0, 1);
		Polideportivo P2 = new Polideportivo ("Poli2", 222.0, 2);
		Polideportivo P3 = new Polideportivo("Poli3", 333.0, 3);
		
		EdificiodeOficinas EO1 = new EdificiodeOficinas(10, 555.0);
        EdificiodeOficinas EO2 = new EdificiodeOficinas(25, 12055.0);
		
		
		ArrayList<IEdificio> ListaEdificios = new ArrayList<>();
		
		
		ListaEdificios.add(P1);
		ListaEdificios.add(P2);
		ListaEdificios.add(P3);
		ListaEdificios.add(EO1);
		ListaEdificios.add(EO2);
		
		Iterator<IEdificio> it = ListaEdificios.iterator();
		
		while (it.hasNext()) {
            Object IEdificio = it.next();
            System.out.println(IEdificio.toString());
		
		}
	}
}
