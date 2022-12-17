plugins {
    id("setting.android.library")
    id("setting.android.library.compose")
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    namespace = "com.someh.setting.core.ui"
}

dependencies {

    api(libs.androidx.core.ktx)
    api(libs.androidx.lifecycle.runtime.ktx)
    api(libs.androidx.activity.compose)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.ui.ui)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.runtime)

    debugApi(libs.androidx.compose.ui.tooling)
}