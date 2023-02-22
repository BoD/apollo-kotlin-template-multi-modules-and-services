plugins {
    kotlin("jvm")
    id("com.apollographql.apollo3")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime")
}

apollo {
    service("service-a") {
        generateApolloMetadata.set(true)
        sourceFolder.set("servicea")
        packageName.set("com.example.servicea")
    }

    service("service-b") {
        generateApolloMetadata.set(true)
        sourceFolder.set("serviceb")
        packageName.set("com.example.serviceb")
    }
}
