
# Mavenized version of openxava

    * It uses embdded version of Tomcat

    * It supports version 6.2.2

    * It supports hsql database by default

    * For postgres database, can switch to postgres branch.
    
            * git checkout openxava_maven_template_postgres
            
    * For musql database, can switch to mysql branch.
        
        * git checkout openxava_maven_template_mysql

    # Steps to Run including custom port number through terminal
        
	    * mvn clean package
        
	    * sh target/bin/webapp port(To override the default port 8080)
	
	    *(For example) sh target/bin/webapp 9090
	    
	* Easy add you database
	
	    * To define the access to your database 
	    
	    * Add your own Resource entry, JDBC URL and driver class for your database in the web/META-INF/context.xml

## For Support contact sales@mahaswami.com
