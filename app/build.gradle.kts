plugins {
    kotlin("jvm")
    id("com.apollographql.apollo3")
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime")
    implementation(project(":graphqlSchema"))
    implementation(project(":feature1"))
    implementation(project(":feature2"))
}

apollo {
    service("service-a") {
        packageName.set("com.example.servicea")
        dependsOn(project(":graphqlSchema"))
        dependsOn(project(":feature1"))
        dependsOn(project(":feature2"))
    }
    service("service-b") {
        packageName.set("com.example.serviceb")
        dependsOn(project(":graphqlSchema"))
        dependsOn(project(":feature1"))
        dependsOn(project(":feature2"))
    }
}
