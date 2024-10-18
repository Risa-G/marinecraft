pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            name = "NeoForge"
            url = uri("https://maven.neoforged.net/releases/")
        }
        maven {
            name = "ParchmentMC"
            url = uri("https://maven.parchmentmc.org")
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.8.0")
}

rootProject.name = "SLP-example-neoforge-1.20.6"
