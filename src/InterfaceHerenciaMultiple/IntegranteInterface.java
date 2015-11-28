package InterfaceHerenciaMultiple;

public interface IntegranteInterface {

	default void concentrarse() {
		System.out.println("Concentrarse (Interface IntegranteInterface)");
	}

	default void viajar() {
		System.out.println("Viajar (Interface IntegranteInterface)");
	}

}
