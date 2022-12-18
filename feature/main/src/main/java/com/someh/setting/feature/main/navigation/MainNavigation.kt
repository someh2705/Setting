package com.someh.setting.feature.main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.someh.setting.feature.main.MainRoute

const val mainNavigationRoute = "main_route"

fun NavController.navigateToMain(navOptions: NavOptions? = null) {
    this.navigate(mainNavigationRoute, navOptions)
}

fun NavGraphBuilder.mainScreen() {
    composable(route = mainNavigationRoute) {
        MainRoute()
    }
}