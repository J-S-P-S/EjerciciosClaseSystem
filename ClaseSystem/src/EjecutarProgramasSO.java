import java.io.IOException;

public class EjecutarProgramasSO {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime(); //Obtener la instancia en tiempo de ejecución del objeto.
        Process proceso;

        if (System.getProperty("os.name").toLowerCase().startsWith("windows")){
            try {
                proceso = rt.exec("explorer");
                proceso.waitFor();
            } catch (Exception e) {
                System.err.println("Error, el comando es desconocido: " + e.getMessage());
                System.exit(1);
            }
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);

    }
}