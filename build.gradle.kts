plugins {
    kotlin("jvm") version "1.7.10"

    id("org.hidetake.swagger.generator") version "2.19.2"
}

repositories {
    mavenLocal()
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.10.0"))

    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")

    implementation("com.squareup.moshi:moshi:1.13.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.13.0")

    testImplementation(kotlin("test"))
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("io.mockk:mockk:1.12.7")

    swaggerCodegen("io.swagger:swagger-codegen-cli:2.4.28")             // Swagger Codegen V2
    swaggerCodegen("io.swagger.codegen.v3:swagger-codegen-cli:3.0.35")  // or Swagger Codegen V3
    swaggerCodegen("org.openapitools:openapi-generator-cli:6.0.1")           // or OpenAPI Generator
}

swaggerSources {
    create("klarnaPayments") {
        setInputFile(file("$rootDir/openapi/klarna-payments.json"))
        code.outputDir = file("$rootDir/generated")
        code.language = "kotlin"
        code.additionalProperties = mapOf(
            "dateLibrary" to "java8",
            "java8" to "true",
            "modelPackage" to "org.oasis.klarnasdk.kotlin.model.klarnapayments"
        )
        code.components = listOf("models")
    }
}

sourceSets {
    named("main") {
        java.srcDir("$rootDir/generated/src/main/kotlin")
    }
}