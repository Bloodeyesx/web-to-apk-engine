pluginManagement {
    repositories {
        google()
        // Use the explicit URL to bypass the 403 mirror error
        maven { url = uri("https://repo1.maven.org/maven2/") }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        // Use the explicit URL here as well
        maven { url = uri("https://repo1.maven.org/maven2/") }
        // Fallback mirror if the primary one fails
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
}
rootProject.name = "web-to-apk-engine"
include(":app")
