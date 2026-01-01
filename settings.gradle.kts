pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        // Use Cloudflare Mirror for Maven Central to bypass the 403 Forbidden error
        maven { url = uri("https://repo.maven.apache.org/maven2/") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        // Primary mirror
        maven { url = uri("https://repo.maven.apache.org/maven2/") }
        // Fallback mirror
        maven { url = uri("https://maven-central.storage-download.googleapis.com/maven2/") }
    }
}
rootProject.name = "web-to-apk-engine"
include(":app")
