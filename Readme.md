
#Deploy

##One Time Configure
mvn com.microsoft.azure:azure-webapp-maven-plugin:1.14.0:config

##Build and Push
export APP_CONFIGURATION_CONNECTION_STRING='<connection string>'

mvn clean package azure-webapp:deploy

##Local Deploy
mvn clean package
mvn spring-boot:run

curl http://localhost:8080/config 

#References
https://docs.microsoft.com/en-us/azure/azure-app-configuration/quickstart-java-spring-app?WT.mc_id=Portal-Microsoft_Azure_AzConfig

https://spring.io/guides/gs/spring-boot-for-azure/

https://stackoverflow.com/questions/50104172/could-not-find-or-load-main-class-org-apache-maven-wrapper-mavenwrappermain


