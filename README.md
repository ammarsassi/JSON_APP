# JSON_APP
In this project we will proceed with JSON data extraction and use for statical representations by analytics graphics within a web site.
This project is carried out as part of a preselection phase for the Career Accelerator Program of the Hatchways platform https://hatchways.io. 


# Summary of the project
Extraction of JSON data from html requests, Json data injection in java objects for storage in a relational database to be used in summary dashboards on an online website. 

# Tools and technologies used  
* Spring Boot 2.6.2
* Spring RESTful web service (Rest API)
* Spring JPA
* Spring lombook
* Spring thymeleaf
* Spring Security
* IntelliJ IDEA Community Edition
* JDK 11
* Maven
* HyperSQL Database (in memory database)
* Apache Tomcat

#Note
* JSON API : https://data.sfgov.org/resource/nxjg-bhem.json
* spring.security.user.name=admin
* spring.security.user.password=admin
* To activate JSON data extraction use drop menu : Hospitalisation Data --> Hospitalizations Data Extraction --> Hospitalizations_Extraction
* Exemple of JSON Data used by this application :
* [
   {
      "reportdate":"2020-03-23T00:00:00.000",
      "hospital":"All SF Hospitals",
      "dphcategory":"Med/Surg",
      "covidstatus":"COVID+",
      "patientcount":"12",
      "data_loaded_at":"2022-01-07T09:00:04.349"
   },
   {
      "reportdate":"2020-03-23T00:00:00.000",
      "hospital":"All SF Hospitals",
      "dphcategory":"Med/Surg",
      "covidstatus":"PUI",
      "patientcount":"101",
      "data_loaded_at":"2022-01-07T09:00:05.413"
   },
   
   .
   .
   .
   ]
   
   
# Contact
* @Author: Ammar Sassi
* E-mail: sassi.ammar@hotmail.com
