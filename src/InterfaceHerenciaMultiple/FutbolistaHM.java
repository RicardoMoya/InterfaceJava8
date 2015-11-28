package InterfaceHerenciaMultiple;

public class FutbolistaHM extends SeleccionFutbolHM implements DeportistaInterface, IntegranteInterface {

	private int dorsal;
	private String demarcacion;

	public FutbolistaHM() {
		super();
	}

	public FutbolistaHM(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
}
