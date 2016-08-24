#Spring Boot Cargo
Basic java application written in spring boot with a range of container hosting options

**Building the containers**
gradle buildAllDocker

**Running the containers**
Spring Boot: docker run -it --rm -p 8888:8080 cargo-spring-boot
Liberty: docker run -it --rm -p 8888:9080 cargo-liberty
Tomee: docker run -it --rm -p 8888:8080 cargo-tomee
WildFly: docker run -it --rm -p 8888:8080 cargo-spring-boot

