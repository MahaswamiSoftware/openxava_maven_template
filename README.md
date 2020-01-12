# Maven support for OpenXava

## Highlights

- It uses embdded version of Tomcat (contact us if you prefer WAR support)
- It currently supports OpenXava version 6.2.2.
- It supports HSQL database by default

## Steps to Run
- The following is for Linux based command line
```
mvn clean package
sh target/bin/webapp (Runs using port number 8080)
sh target/bin/webapp <port_number> (Override the port)
```

## For Use with Postgresql DB

- Switch to openxava_maven_template_postgres branch

## For Use with MySQL DB

- Switch to openxava_maven_template_mysql branch.

## Other Databases

- Need to have JDBC driver for it
- Update the web/META-INF/context.xml with the respective resource entries
- Add the jdbc driver library Maven dependency

## Building a standalone WAR file for deploying to existing Tomcat installs

- We will try to support this in the future.
- Contact us for support in this regard for the moment.

## Other Application Servers

- We will try to document this in the future.
- We are happy to provide case by case support in this regard for the moment.

## Need any help for more advanced use cases / support?

- Contact us via sales@mahaswami.com
