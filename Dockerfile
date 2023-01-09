FROM tomcat

COPY /target/spm2022.war /usr/local/tomcat/webapps/

CMD ["catalina.sh", "run"]