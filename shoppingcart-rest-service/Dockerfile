FROM tomcat:8-jre8-alpine

# set up wait-for-it for synchronization
RUN apk add --update bash \
    coreutils && \
    rm -rf /var/cache/apk/*

COPY target/shoppingcartservice.war /usr/local/tomcat/webapps/shoppingcartservice.war
ENV JAVA_OPTS -Djava.security.egd=file:/dev/./urandom
