import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.*

plugins {
    kotlin("jvm") version "1.7.10"
    application
    id("org.openjfx.javafxplugin") version "0.0.10"
}

javafx {
    version = "17.0.1"
    modules("javafx.controls", "javafx.graphics")
}

group = "io.github.robaertschi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("no.tornado:tornadofx:1.7.20")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

application {
    mainClass.set("Main")
}