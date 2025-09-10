package ejercicio2;

public class EdificiodeOficinas implements IEdificio {

	private int CantidadOficinas;
	private double Superficie;
	
	public EdificiodeOficinas() {}
	
	public EdificiodeOficinas(int CantidadOficinas) {
		this.CantidadOficinas = CantidadOficinas;
	}
	
	public EdificiodeOficinas(int CantidadOficinas, Double Superficie) {
		this.CantidadOficinas = CantidadOficinas;
		this.Superficie = Superficie;
	}

	public int getCantidadOficinas() {
		return CantidadOficinas;
	}


	public void setCantidadOficinas(int CantidadOficinas) {
		this.CantidadOficinas = CantidadOficinas;
	}

	@Override
	public String toString() {
		return "Oficinas [Superficie=" + getSuperficieEdificio() + ", CantidadOficinas=" + CantidadOficinas + "]";
	}

	@Override
	public double getSuperficieEdificio() {
		return Superficie;
	}


}
