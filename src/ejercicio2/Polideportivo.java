package ejercicio2;

public class Polideportivo implements IEdificio, IInstalacionDeportiva  {
	
	double Superficie;
	String NombreEdificio;
	int TipodeInstalacion;
	
	public Polideportivo() {}
	
	public Polideportivo(String NombreEdificio, Double Superficie) {
		this.NombreEdificio = NombreEdificio;
		this.Superficie = Superficie;
		}
	
	public Polideportivo(String NombreEdificio, Double Superficie, int TipodeInstalacion) {
		this.NombreEdificio = NombreEdificio;
		this.Superficie = Superficie;
		this.TipodeInstalacion = TipodeInstalacion;
		
	}
	
	public double getSuperficie() {
		return Superficie;
	}

	public void setSuperficie(double superficie) {
		Superficie = superficie;
	}

	public String getNombreEdificio() {
		return NombreEdificio;
	}

	public void setNombreEdificio(String nombreEdificio) {
		NombreEdificio = nombreEdificio;
	}

	
	public int getTipodeInstalacion() {
		return TipodeInstalacion;
	}

	public void setTipodeInstalacion(int tipodeInstalacion) {
		TipodeInstalacion = tipodeInstalacion;
	}

	@Override
	public String toString() {
		return "Polideportivo [Superficie=" + getSuperficieEdificio() + ", NombreEdificio=" + NombreEdificio + ", TipoInstalacion=" + TipodeInstalacion + "]";
	}

	@Override
	public double getSuperficieEdificio() {
		return Superficie;
	}

	@Override
	public int getTipoDeInstalacion() {
		return TipodeInstalacion;
	}
	
	
	
}
