import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.2.6.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
//	id("com.expediagroup.graphql") version "3.0.0"
	kotlin("jvm") version "1.3.71"
	kotlin("plugin.spring") version "1.3.71"
}

group = "br.com.paiter"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11


configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-amqp")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("com.expediagroup:graphql-kotlin-client:3.0.0")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

//	implementation("com.expediagroup:graphql-kotlin-client:3.0.0")

	implementation("org.slf4j:slf4j-api:1.7.30")

	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")

	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
	testImplementation("org.mockito:mockito-core:2.21.0")
	testImplementation("org.springframework.amqp:spring-rabbit-test")
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.2")
	testImplementation("org.mockito:mockito-junit-jupiter:2.27.0")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.2")
}

//graphql {
//	endpoint = "http://localhost:8080/graphql"
//	packageName = "br.com.paiter.valorizei"
//}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
