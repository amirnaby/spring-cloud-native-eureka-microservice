# An example of using Netflix Eureka in Spring Cloud Native in MicroService Architecture:

Service 01: PERSON-SERVICE; http://localhost:9901/person/save?name=NAME&family=FAMILY

Service 02: CAR-SERVICE;    http://localhost:9902/car/save?carModel=XXX&personId=1

Service 03: FIND-SERVICE;   http://localhost:9903/person/find?personId=1

Eureka:                     http://localhost:9000

----

First correct datasource of 3 services with your db user & pass in application.yml and then run all 5 microservices (Built with Maven).

Then call these addresses for test:

Register new person:                  http://localhost:9900/savePerson?name=NAME&family=FAMILY

Register new car for existing person: http://localhost:9900/saveCar?carModel=XXX&personId=1

Find Cars of a person:                http://localhost:9900/findPerson?personId=1

----

Good Luck.
