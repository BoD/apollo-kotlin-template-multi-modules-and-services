plugins {
    kotlin("jvm")
    id("com.apollographql.apollo3")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime")

    implementation(project(":graphqlSchema"))
    apolloMetadata(project(":graphqlSchema"))

    implementation(project(":feature1"))
    apolloMetadata(project(":feature1"))

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
