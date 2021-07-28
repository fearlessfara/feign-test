# feign-test
feign load balancing testing


`SpringBoot version 2.5.3`

`Java version 11`

`Spring Cloud version 2020.0.3`



first compile the project using:
`mvn clean install -Dmaven.test.skip=true`

the to run the entire scenario using Docker:
`docker compose up -d --build`

once the stack is running make some empty `GET` requests to `localhost:8080/get` to verify that the system is load-balancing between the two instances

Then shut-down one of the two `service` instances and quickly continue to make `GET` calls, you'll notice that some requests will fail even when the Discovery service has correctly unregistered the now dead instance. 
