package launch;

import org.apache.catalina.startup.Tomcat;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hsqldb.server.*;

public class Main {

    public static void main(String[] args) throws Exception {
        start("RestaurantDB");
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

    public static void start(String dbName) throws Exception {
        (new Thread(() -> {
            Server hsqlServer = new Server();
            hsqlServer.setSilent(true);
            hsqlServer.setDatabaseName(0, "");
            hsqlServer.setDatabasePath(0, "file:data/" + dbName);
            hsqlServer.setPort(1666);
            hsqlServer.start();
            Logger.getLogger("").setLevel(Level.INFO);
        })).start();
    }
}
