package curso_java.A1_Teoria.A91_Teoria_Ficheros.Ejemplos;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
    	//Ruta relativa a la carpeta del proyecto
    	//Creamos un String con la ruta relativa al archivo que deseamos manipular
        String nombreArchivo = "./recursos/java2.txt";

        
        //Creamos un nuevo objeto de la clase de ejemplo ArchivoServicio
        ArchivoServicio service = new ArchivoServicio();
        //Con este objeto llamamos al método de ejemplo mostrarContenidoDirectorio de la clase ArchivoServicio
        //pasándole como parametro la ruta que que queremos observar
        service.mostrarContenidoDirectorio("C:\\Users\\Tardes\\");
        //service.crearArchivo2(nombreArchivo);
    } 
}
