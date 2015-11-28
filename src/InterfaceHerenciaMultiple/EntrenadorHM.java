package InterfaceHerenciaMultiple;

public class EntrenadorHM extends SeleccionFutbolHM implements
		DeportistaInterface, IntegranteInterface {

	private int idFederacion;

	public EntrenadorHM() {
		super();
	}

	public EntrenadorHM(int id, String nombre, String apellidos, int edad,
			int idFederacion) {
		super(id, nombre, apellidos, edad);
		this.setIdFederacion(idFederacion);
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

}
