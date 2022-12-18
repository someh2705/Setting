package com.someh.setting.feature.main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.someh.setting.feature.main.MainRoute

const val MainNavigationRoute = "main_route"

fun NavController.navigateToMain(navOptions: NavOptions? = null) {
    this.navigate(MainNavigationRoute, navOptions)
}

fun NavGraphBuilder.mainScreen() {
    composable(route = MainNavigationRoute) {
        MainRoute()
    }
}
