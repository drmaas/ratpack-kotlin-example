plugins {
  id("me.drmaas.ratpack-kotlin") version "1.8.0-dev.3+edbf51d"
  id("com.github.johnrengelman.shadow") version "4.0.2"
}

repositories {
  mavenLocal()
  jcenter()
}

dependencies {
  runtime("ch.qos.logback:logback-classic:1.2.3")
}

group = "com.example"
version = "0.0.1"
