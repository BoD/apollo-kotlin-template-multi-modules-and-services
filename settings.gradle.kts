pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
    }
}

include(":graphqlSchema", ":feature1", ":feature2", ":app")
