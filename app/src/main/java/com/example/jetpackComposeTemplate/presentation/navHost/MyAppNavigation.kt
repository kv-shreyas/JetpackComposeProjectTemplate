package com.example.jetpackComposeTemplate.presentation.navHost

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackComposeTemplate.app.constants.Constants
import com.example.jetpackComposeTemplate.presentation.home.HomePage
import com.example.jetpackComposeTemplate.provider.resource.ResourceProvider
import com.example.shreychat.screen.LoginPage
import com.example.shreychat.screen.RegisterPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, resourceProvider: ResourceProvider) {
    val navController = rememberNavController()
    val currentUser = null
    val start = Constants.NavDestinations.LOGIN_SCREEN; // if(currentUser != null) "home" else "login"
    NavHost(navController = navController, startDestination = start, builder = {
        composable(Constants.NavDestinations.LOGIN_SCREEN) {
            LoginPage(modifier = modifier, resourceProvider, navController)
        }
        composable(Constants.NavDestinations.HOME_SCREEN) {
            HomePage(modifier = modifier, resourceProvider, navController)
        }

        composable(Constants.NavDestinations.REGISTER_SCREEN) {
            RegisterPage(modifier = modifier, resourceProvider, navController)
        }
    })

}