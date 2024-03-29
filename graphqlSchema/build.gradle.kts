plugins {
    kotlin("jvm")
    id("com.apollographql.apollo3")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime")
    testImplementation(kotlin("test"))
}

apollo {
    service("service-a") {
        generateApolloMetadata.set(true)
        sourceFolder.set("servicea")
        packageName.set("com.example.servicea")

        // The 'Date' scalar is used in feature1 and feature2, which would normally generate it once in each
        // module, which would clash. So we force generating in this module instead. 
        // See https://www.apollographql.com/docs/kotlin/advanced/multi-modules/#type-clashes
        alwaysGenerateTypesMatching.set(listOf("Date"))
    }

    service("service-b") {
        generateApolloMetadata.set(true)
        sourceFolder.set("serviceb")

        packageName.set("com.example.serviceb")

        // The 'Date' scalar is used in feature1 and feature2, which would normally generate it once in each
        // module, which would clash. So we force generating in this module instead. 
        // See https://www.apollographql.com/docs/kotlin/advanced/multi-modules/#type-clashes
        alwaysGenerateTypesMatching.set(listOf("Date"))
    }
}
