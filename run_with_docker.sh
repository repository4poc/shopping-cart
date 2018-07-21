#!/bin/bash
set -e

# create artifact
cd ./shoppingcart-rest-service
mvn install

pwd

# Create docker image
sudo docker build -t shoppingcartservice .

# tag and publish image to registry
sudo docker login --username=varindergupta --password=valentine --email=varinder_gupta82@yahoo.com
sudo docker tag shoppingcartservice varindergupta/shoppingcartservice
sudo docker push varindergupta/shoppingcartservice

cd ..

# start containers
sudo docker-compose pull && docker-compose up --build
