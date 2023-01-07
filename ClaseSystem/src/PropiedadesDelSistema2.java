import java.io.FileInputStream;
import java.util.Properties;

public class PropiedadesDelSistema2 {

    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties"); //config2 no existe
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

            p = System.getProperties();
            //System.out.println("ps.getProperty(...)" + p.getProperty("mi.propiedad.personalizada")); como ya se actualizó con el set se puede utilizar la misma clase system
            System.out.println(System.getProperty("config.texto.ambiente"));
            p.list(System.out);
        } catch (Exception e) {
            System.err.println("No existe el archivo = " + e); // System.err muestra la salida por consola de color rojo, como error.
            System.exit(1); // 0 esta ok, -1 un error básico, 1 falla de sistema, cuando se lanza una excepción.
        }


    }

}