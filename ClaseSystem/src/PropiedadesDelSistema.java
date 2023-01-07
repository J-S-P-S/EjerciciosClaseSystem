import java.util.Properties;

public class PropiedadesDelSistema {

    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator(); // el uso es igual que la línea 17
        System.out.println("lineSeparator = " + lineSeparator + " una nueva linea");

        Properties p = System.getProperties();
        p.list(System.out);

    }

}