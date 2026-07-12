\# Discovery Server

\## Purpose

The Discovery Server is responsible for service registration and service discovery.

Instead of microservices communicating using IP addresses and ports, they communicate using service names.

Example:

AUTH-SERVICE → SCHOOL-SERVICE

The Discovery Server resolves the service name to the current running instance.





\---

\## Current Status

\- Spring Boot project created

\- Application starts successfully

\- Eureka not configured yet

We'll keep updating this document as we build the service.







=============================



\# Discovery Server



\## Purpose



The Discovery Server enables service registration and service discovery.



Instead of communicating using IP addresses and ports, microservices communicate using service names.



\## Technology



\- Spring Boot 3.x

\- Spring Cloud Netflix Eureka Server

\- Java 17



\## Port



8761



\## URL



http://localhost:8761



\## Current Status



\- \[x] Spring Boot project created

\- \[x] Eureka Server configured

\- \[x] Dashboard verified

\- \[x] Manual testing completed



\## Notes



Currently, no client services are registered.

This is expected because the remaining microservices have not been created yet.





