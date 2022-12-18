package com.someh.setting.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.someh.setting.feature.main.navigation.MainNavigationRoute
import com.someh.setting.feature.main.navigation.mainScreen

@Composable
fun SettingNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = MainNavigationRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        mainScreen()
    }
}
