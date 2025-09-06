package ejercicio2;

public class Oficinas implements IEdificio {

	private int CantidadOficinas;
	private double Superficie;
	
	public Oficinas() {}
	
	public Oficinas(int CantidadOficinas) {
		this.CantidadOficinas = CantidadOficinas;
	}
	

	public int getCantidadOficinas() {
		return CantidadOficinas;
	}


	public void setCantidadOficinas(int CantidadOficinas) {
		this.CantidadOficinas = CantidadOficinas;
	}

	@Override
	public String toString() {
		return "Oficinas [CantidadOficinas=" + CantidadOficinas + "]";
	}

	@Override
	public double getSuperficieEdificio() {
		return Superficie;
	}


}
