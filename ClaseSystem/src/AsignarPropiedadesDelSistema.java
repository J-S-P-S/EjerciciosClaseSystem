import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {

    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

            p = System.getProperties();
            //System.out.println("ps.getProperty(...)" + p.getProperty("mi.propiedad.personalizada")); como ya se actualizo con el set se puede utilizar la misma clase system
            System.out.println(System.getProperty("config.texto.ambiente"));
            p.list(System.out);
        } catch (Exception e) {
            System.out.println("No existe el archivo = " + e);
        }


    }

}