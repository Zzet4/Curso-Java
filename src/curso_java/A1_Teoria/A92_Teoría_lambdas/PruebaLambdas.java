package curso_java.A1_Teoria.A92_Teoría_lambdas;

public class PruebaLambdas {

	public static void main(String[] args) {
		
		//HASTA AHORA HUBIÉRAMOS CREADO UNA CLASE SUMA QUE IMPLEMENTARA LA INTERFAZ OPERACION
		// QUE SOBREESCRIBIERA EL METODO OPERAR Y QUE DENTRO LO MODIFICARA PARA SUMAR
		// CREARÍAMOS UN OBJETO DE TIPO SUMA PERO LO VAMOS A HACER MAS FACIL CON LAMBDAS
//		Operacion suma = new Suma();
//		suma.operar(2, 3);
		
		
		// EN ESTA LINEA DE ABJAO CREAMOS UNA VARIABLE DEL TIPO DE LA INTERFAZ Y LA LLAMAMOS OPE
		// DESPUÉS LA IGUALAMOS A LOS PARÁMETROS DEL METODO ABSTRACTO DE LA INTERFAZ, EN ESTE CASO DOS VALORES
		// A CONTINUACIÓN CON EL SÍMBOLO DE LA FUNCIÓN LAMBDA -> LE INDICAMOS LA FUNCIÓN QUE QUEREMOS QUE EJECUTE
		// LA FUNCIÓN LAMBDA. A PARTIR DE AQUÍ, CADA VEZ QUE USEMOS OPE, ESTAREMOS "INVOCANDO" A LA SUMA
		// SOLO CON ESTA LINEA ES COMO CREAR UNA CLASE DE TIPO SUMA, SOBREESCRIBIR EL MÉTODO OPERAR Y DESARROLLAR 
		// LA SUMA DENTRO DEL METODO SOBRECARGADO.
		Operacion opeSum = (a,b) -> a+b;
		Operacion opeRes = (a,b) -> a+b;
		Operacion opeMul = (a,b) -> a+b;
		Operacion opeDiv = (a,b) -> a+b;
		
		
		miOperacion(6,8,opeSum);
		
		//AQUÍ INVOCAMOS AL MÉTODO MIOPERACIÓN DE ABAJO PASÁNDOLE DOS ENTEROS Y UNA VARIABLE DE TIPO OPERACIÓN
		// QUE NO TENEMOS GUARDADA EN NINGUNA VARIABLE POR LO QUE DIRECTAMENTE LA ESCRIBIMOS COMO (C,D) -> C-D
		miOperacion(9,18, (c,d)-> c-d );
		miOperacion(9,18, (c,d) -> { 
						if (c>5) {
							c= c*4;
						}
						d=d+3;
						return c*d;
					});
		
//		System.out.println(ope.operar(2, 3));
//		ope = (a,b) -> a+b;
//		System.out.println(ope.operar(2, 3));

	}
	
	static void miOperacion (int valor1, int valor2, Operacion op) {
		int resultado = op.operar(valor1, valor2);
		System.out.println(resultado);
	}
	
	

}
