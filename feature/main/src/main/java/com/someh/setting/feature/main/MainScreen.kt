package com.someh.setting.feature.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.someh.setting.core.design.theme.SettingTheme


@Composable
fun MainRoute(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel()
) {

    MainScreen(modifier)
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
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