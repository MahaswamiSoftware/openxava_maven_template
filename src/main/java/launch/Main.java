package launch;

import org.apache.catalina.startup.Tomcat;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hsqldb.server.*;

public class Main {
    private static final int PORT_NUMBER = 8080;

    public static void main(String[] args) throws Exception {
        int port = PORT_NUMBER;
        if(args.length > 0 && args[0].length() == 4){
            try {
                port = Integer.parseInt(args[0]);
            }catch (NumberFormatException nEx){
                //System.out.println(nEx.getCause());
                port = PORT_NUMBER;
            }
        }
        start("RestaurantDB");
        run("Restaurant", port);
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
