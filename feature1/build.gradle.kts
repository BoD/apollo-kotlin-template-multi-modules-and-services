plugins {
    kotlin("jvm")
    id("com.apollographql.apollo3")
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime")
    implementation(project(":graphqlSchema"))
}

apollo {
    service("service-a") {
        generateApolloMetadata.set(true)
        sourceFolder.set("servicea")
        packageName.set("com.example.servicea")
        dependsOn(project(":graphqlSchema"))

        introspection {
            endpointUrl.set("https://feature2-servicea.com")
            schemaFile.set(file("src/main/graphql/servicea/schema.graphqls"))
        }
    }

    service("service-b") {
        generateApolloMetadata.set(true)
        sourceFolder.set("serviceb")
        packageName.set("com.example.serviceb")
        dependsOn(project(":graphqlSchema"))

        introspection {
            endpointUrl.set("https://feature2-serviceb.com")
            schemaFile.set(file("src/main/graphql/serviceb/schema.graphqls"))
        }
    }
}
