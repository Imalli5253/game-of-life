FROM tomcat:latest
WORKDIR /var/lib/tomcat/webapps
COPY /var/lib/jenkins/workspace/gameoflife/gameoflife-web/target/gameoflife.war .
CMD ["catalina.sh", "run"]
