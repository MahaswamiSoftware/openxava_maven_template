package launch;

import org.apache.catalina.startup.Tomcat;
import java.io.File;

public class Main {

    private static final int PORT_NUMBER = 8080;

    public static void main(String[] args) throws Exception {
        int port  = PORT_NUMBER;
        if(args.length > 0 && args[0].length() == 4) {
            try {
                port = Integer.parseInt(args[0]);
            }catch (NumberFormatException nm){
                port = PORT_NUMBER;
            }
        }
        run("MavenTemplate", port);
    }

    public static void run(String app, int port) throws Exception {
        System.out.println("starting_application");
        String webappDir = (new File("web")).getAbsolutePath();
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir("temp");
        tomcat.setPort(port);
        tomcat.getConnector();
        tomcat.enableNaming();
        tomcat.addWebapp("/" + app, webappDir);
        tomcat.start();
        System.out.println("application_started_go http://localhost:" + port + "/" + app);
        tomcat.getServer().await();
    }
}
