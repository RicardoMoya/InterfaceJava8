package Main;

import java.util.ArrayList;

import InterfaceHerenciaMultiple.DeportistaInterface;
import InterfaceHerenciaMultiple.EntrenadorHM;
import InterfaceHerenciaMultiple.FutbolistaHM;
import InterfaceHerenciaMultiple.IntegranteInterface;
import InterfaceHerenciaMultiple.MasajistaHM;
import InterfaceHerenciaMultiple.SeleccionFutbolHM;


public class MainHerenciaMultiple {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija
	// a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbolHM> integrantes = new ArrayList<SeleccionFutbolHM>();

	public static void main(String[] args) {

		SeleccionFutbolHM delBosque = new EntrenadorHM(1, "Vicente", "Del Bosque", 60, 28489);
		SeleccionFutbolHM iniesta = new FutbolistaHM(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbolHM raulMartinez = new MasajistaHM(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		// VIAJE
		System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbolHM integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			((IntegranteInterface) integrante).viajar();
		}
		
		
		// ENTRENAR
		System.out.println("\nSolo Del Bosque e Iniesta entrenan ya que el masajista no tienen el método entrenar");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
		((DeportistaInterface) delBosque).entrenar();
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
		((DeportistaInterface) iniesta).entrenar();
		
		
	}
}
