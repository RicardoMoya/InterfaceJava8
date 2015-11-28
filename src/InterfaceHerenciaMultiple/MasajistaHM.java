package InterfaceHerenciaMultiple;

public class MasajistaHM extends SeleccionFutbolHM implements
		IntegranteInterface {

	private String titulacion;
	private int aniosExperiencia;

	public MasajistaHM() {
		super();
	}

	public MasajistaHM(int id, String nombre, String apellidos, int edad,
			String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

}
