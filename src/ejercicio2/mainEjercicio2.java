package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		Polideportivo P1 = new Polideportivo ("Poli1",111.0);
		Polideportivo P2 = new Polideportivo ("Poli2", 222.0);
		Polideportivo P3 = new Polideportivo("Poli3", 333.0);
		
		
		ArrayList<Polideportivo> ListaPoli = new ArrayList<>();
		
		
		ListaPoli.add(P1);
		ListaPoli.add(P2);
		ListaPoli.add(P3);
		
		Iterator<Polideportivo> it = ListaPoli.iterator();
		
		while (it.hasNext()) {
            Object Polideportivo = it.next();
            System.out.println(Polideportivo.toString());
		
		}
	}
}
