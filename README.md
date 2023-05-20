# Application-for-brain-exercises
this Application is built with Microservices architecture  in which I used Java 8 ,Maven , spring ecosystem(spring framework , spring data, spring batch, spring security, ,spring cloud , spring integration), and also lambok, JUnit5 for testing and it's framework Mockito and AssertJ, and for Event-Driven System I used RabbitMQ.
The goal of this web application is to encourage users to exercise their brains by presenting to the users two-digit multiplication , and for the user he will type an alias or short name and it's guess for the result of the operation, but the idea is that they should use only mental calculations.
After they send the data , the web page will indicate the user if the guess was correct or not.
Also to keep users motivated I will use some gamification for each correct guess so we give points to the user and they will see their score in a ranking.

Steps:
Create a basic service with business logic.
Create a basic API to access this service (REST API).
Create a basec web page to ask the users to solve that calculation.

Designing:
The structue of the application is the three-tier design in which :
Client tier : responsible for the user interface (front-end)
Application tier : contains all the business logic together with the interfaces to interact with it and the data interfaces for persistance.
Data store tier : the database , file system ... that persists the application's data Back end).

Design of the Application tier :
Business layer : this will includes the classes that model our domain and business specifics,divided into 2 parts -> Domains(entities) and Applications(services)providing business logic .
Presentation layer : represented by the Cntroller classes , which will provide the functionality to the web client (REST API implementation).
Data layer : responsible for persisting our entities in a data storage,include data access object(DAO) classes,which work with objects that map directly to rows in a database, or repository classes.

the main advantages of using this software architecture are all related to achieving loose coupling.

Domain definition :
Challenge : contains the 2 factors of a multiplication challenge.
User : identifies the person who will try  to solve a Challenge.
ChallengeAttempt : represents the attempt from a User to solve the operation from a Challenge.




