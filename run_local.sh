#!/bin/bash
set -e


if [[ -z "${CATALINA_HOME}" ]]; then
  echo "CATALINA_HOME environment value is mandatory.."
  exit;
else
  echo "CATALINA_HOME environment value is set $CATALINA_HOME"
fi

# create artifact
cd ./shoppingcart-rest-service
mvn install
cp target/shoppingcartservice-SNAPSHOT.war $CATALINA_HOME/webapps/shoppingcartservice.war

cd ../

cd ./reactjs-shopping-cart
npm install
npm start -Y
