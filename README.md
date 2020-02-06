# Maven support for OpenXava

## Highlights

- It uses embdded version of Tomcat (contact us if you prefer WAR support)
- It currently supports OpenXava version 6.2.2.
- It supports HSQL database by default
- Works on both Windows and Linux

## Steps to Run
- The following is for Linux based command line
```
mvn clean package
sh target/bin/webapp (Runs using port number 8080)
sh target/bin/webapp <port_number> (Override the port)
```
- The following is for Windows based command line
```
mvn clean package
target\bin\webapp.bat (Runs using port number 8080)
target\bin\webapp.bat <port_number> (Override the port)
```


## For Use with Postgresql DB

- Switch to openxava_maven_template_postgres branch

## For Use with MySQL DB

- Switch to openxava_maven_template_mysql branch.

## Other Databases

- Support all Relational databases supported by Hibernate
- Update the web/META-INF/context.xml with the respective resource entries
- Add the jdbc driver library Maven dependency
- Also edit persistance.xml to change the appropriate DB dialect.

## Building a standalone WAR file for deploying to existing Tomcat installs

- We will try to support this in the future.
- Contact us for support in this regard for the moment.

## Other Application Servers

- We will try to document this in the future.
- We are happy to provide case by case support in this regard for the moment.

## Need any help with OpenXava? Have needs with advanced use cases / support?

- Contact us via sales@mahaswami.com
