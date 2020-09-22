![](logo.png)
# Overview
This is a getting started sample application for showcasing "Spring Data Azure Cosmos DB" 

# Getting started

## First:
 * Java 8
 * maven
 * Create a Cosmos SQL collection named "ReadingList". use /reader as the partition key

## Then:
* Update the following properties in application.properties 
  - azure.cosmosdb.uri=
  - azure.cosmosdb.key=
  - azure.cosmosdb.database=

* mvn spring-boot:run 
* Access the WebApp at http://localhost:8080/readingList

# About "Spring Data Azure Cosmos DB" 
 https://github.com/microsoft/spring-data-cosmosdb
