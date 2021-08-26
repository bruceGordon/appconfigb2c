
#Deploy

##One Time Configure
mvn com.microsoft.azure:azure-webapp-maven-plugin:1.14.0:config
##Build and Push
export APP_CONFIGURATION_CONNECTION_STRING='Endpoint=https://b2c-partner.azconfig.io;Id=mdh3-l2-s0:Svn6yh1AnRAjuGE7lxLo;Secret=B6NjfmLMZqnyMT4Ha0TEHKNJwkNcVV+Bu4BolnvTa4s='

mvn clean package azure-webapp:deploy


#References
https://docs.microsoft.com/en-us/azure/azure-app-configuration/quickstart-java-spring-app?WT.mc_id=Portal-Microsoft_Azure_AzConfig

https://spring.io/guides/gs/spring-boot-for-azure/

https://stackoverflow.com/questions/50104172/could-not-find-or-load-main-class-org-apache-maven-wrapper-mavenwrappermain

https://spring.io/guides/gs/spring-boot-for-azure/
