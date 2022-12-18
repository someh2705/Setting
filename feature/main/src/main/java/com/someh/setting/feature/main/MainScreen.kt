package com.someh.setting.feature.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.someh.setting.core.design.theme.SettingTheme


@Composable
public fun MainRoute() {

    MainScreen()
}

@Composable
internal fun MainScreen() {
    Greeting(name = "Setting")
}

@Composable
internal fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Preview
@Composable
internal fun MainScreenPreview() {
    SettingTheme {
        MainScreen()
    }
}
