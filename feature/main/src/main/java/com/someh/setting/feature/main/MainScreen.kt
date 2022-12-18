package com.someh.setting.feature.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.someh.setting.core.design.theme.SettingTheme


@Composable
fun MainRoute() {

    MainScreen()
}

@Composable
fun MainScreen() {
    Greeting(name = "Setting")
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Preview
@Composable
fun MainScreenPreview() {
    SettingTheme {
        MainScreen()
    }
}
