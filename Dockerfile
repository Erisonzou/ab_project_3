From openjdk:8
Expose 8084
Add target/ab_springlogin-0.0.1-SNAPSHOT.war ab_springlogin-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/ab_springlogin-0.0.1-SNAPSHOT.war"]