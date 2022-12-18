package com.someh.setting.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope


@Composable
fun rememberSettingAppState(
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
): SettingAppState {
    return remember(navController, coroutineScope) {
        SettingAppState(navController, coroutineScope)
    }
}

@Stable
class SettingAppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope
) {

    fun onBackClick() {
        navController.popBackStack()
    }
}