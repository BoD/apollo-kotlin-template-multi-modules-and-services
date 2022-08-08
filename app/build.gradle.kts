plugins {
    kotlin("jvm")
    id("com.apollographql.apollo3")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime", "3.2.1")

    implementation(project(":graphqlSchema"))
    apolloMetadata(project(":graphqlSchema"))

    implementation(project(":feature2"))
    apolloMetadata(project(":feature2"))
}

apollo {
    service("service-a") {
        packageName.set("com.example.servicea")
    }
    service("service-b") {
        packageName.set("com.example.serviceb")
    }
}
