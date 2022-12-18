plugins {
    id("setting.android.library")
    id("setting.android.library.compose")
}

android {
    namespace = "com.someh.setting.core.design"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    api(libs.androidx.compose.material3)
    debugApi(libs.androidx.compose.ui.tooling)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.runtime)
}