package com.someh.setting.feature.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel


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
