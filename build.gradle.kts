plugins {
    kotlin("jvm") version "1.9.20"
    application
    id("org.jlleitschuh.gradle.ktlint") version "11.6.1"
}

group = "com.github.delphyne"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ajalt.clikt:clikt:4.2.1")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.github.delphyne.clikt.MainKt")
}
