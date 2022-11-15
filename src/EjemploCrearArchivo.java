import servicio.ArchivoServicio;

public class EjemploCrearArchivo {

    public static void main(String[] args) {
            String nombreArchivo = "C:\\Users\\jctriventi\\Desktop\\programacion\\java.txt";

            ArchivoServicio service = new ArchivoServicio();
            service.crearArchivo(nombreArchivo);
    }
}
