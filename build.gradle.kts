buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

plugins {
    kotlin("jvm") version "1.8.0"
    id("com.apollographql.apollo3") version "4.0.0-SNAPSHOT" apply false
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}
