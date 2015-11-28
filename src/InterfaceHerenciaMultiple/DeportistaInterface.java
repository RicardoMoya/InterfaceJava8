package InterfaceHerenciaMultiple;

public interface DeportistaInterface {

	default void entrenar() {
		System.out.println("Entrenar (Interface DeportistaInterface)");
	}

	default void jugarPartido() {
		System.out.println("Jugar Partido (Interface DeportistaInterface)");
	}
}
