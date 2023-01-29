plugins {
    java
    id("org.springframework.boot") version "3.0.2"
    id("io.spring.dependency-management") version "1.1.0" // move to platform, see https://docs.spring.io/dependency-management-plugin/docs/current/reference/html/#managing-dependencies
}

group = "dev.stillya"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server:3.0.2")
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
