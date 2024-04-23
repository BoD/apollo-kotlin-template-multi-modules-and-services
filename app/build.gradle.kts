plugins {
    kotlin("jvm")
    id("com.apollographql.apollo3")
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
        introspection {
            endpointUrl.set("https://app-servicea.com")
            schemaFile.set(file("src/main/graphql/servicea/schema.graphqls"))
        }
    }
    service("service-b") {
        packageName.set("com.example.serviceb")
        introspection {
            endpointUrl.set("https://app-serviceb.com")
            schemaFile.set(file("src/main/graphql/serviceb/schema.graphqls"))
        }
    }
}
