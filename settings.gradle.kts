pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "VmeCompose"
include(":app")
//include(":screens:home")
//include(":screens:account")
//include(":core:network")
include(":core:network")
include(":features:home")
include(":core:data")
include(":core:common")
include(":features:main")
include(":shared:navigation")
