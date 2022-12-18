package com.someh.setting.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.someh.setting.navigation.SettingNavHost

@Composable
fun SettingApp(
    appState: SettingAppState = rememberSettingAppState()
) {

    SettingNavHost(
        navController = appState.navController,
    )
}
