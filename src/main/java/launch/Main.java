package launch;

import org.apache.catalina.startup.Tomcat;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        run("Restaurant");
    }

    public static void run(String app) throws Exception {
        System.out.println("starting_application");
        String webappDir = (new File("web")).getAbsolutePath();
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir("temp");
        tomcat.setPort(8080);
        tomcat.getConnector();
        tomcat.enableNaming();
        tomcat.addWebapp("/" + app, webappDir);
        tomcat.start();
        System.out.println("application_started_go http://localhost:8080/" + app);
        tomcat.getServer().await();
    }
}
