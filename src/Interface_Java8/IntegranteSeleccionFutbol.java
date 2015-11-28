package Interface_Java8;

public interface IntegranteSeleccionFutbol {

	void concentrarse();

	void viajar();

	void entrenar();

	void jugarPartido();
	
	default void ruedaPrensa(){
		System.out.println(" da una rueda de prensa (desde la Interface)");
	}
	
	default void videoPublicitario (){
		System.out.println(" hacer un video publicitario (desde la Interface)");
	}

}
