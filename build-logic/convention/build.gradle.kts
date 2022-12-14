plugins {
    `kotlin-dsl`
}

group = "com.someh.setting.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.detekt.gradle.plugin)
    compileOnly(libs.dokka.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "setting.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "setting.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "setting.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "setting.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidFeature") {
            id = "setting.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
        register("androidHilt") {
            id = "setting.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
        register("androidDetekt") {
            id = "setting.android.detekt"
            implementationClass = "AndroidDetektConventionPlugin"
        }
        register("androidComposeDetekt") {
            id = "setting.android.detekt.compose"
            implementationClass = "AndroidDetektComposeConventionPlugin"
        }
        register("androidDokka") {
            id = "setting.android.dokka"
            implementationClass = "AndroidDokkaConventionPlugin"
        }
    }
}