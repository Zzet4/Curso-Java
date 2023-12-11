package curso_java.A1_Teoria.A92_Teoría_lambdas;

@FunctionalInterface
public interface Operacion {
	// UNA INTERFAZ FUNCIONAL ES AQUELLA QUE SOLO TIENE UN MÉTODO ABSTRACTO,
	// EN ESTE CASO " OPERAR "
	int operar (int num1, int num2);

	//int operar4();
	
	static String operacionEstatica(int numero) {
		
		return String.valueOf(numero);
	}
	
	default String operar2(int numero) {
		String result = operacionEstatica(numero);
		return result;
	}
	
	default int operar3() {
		
		return 2;
	}
}
