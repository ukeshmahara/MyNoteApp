package com.ukesh.mynoteapp.navigation

import android.os.Build
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ukesh.mynoteapp.presentation.screens.login.LoginScreen
import com.ukesh.mynoteapp.presentation.screens.login.SignUpScreen
import com.ukesh.mynoteapp.presentation.screens.splash.Splash


sealed class AuthNavRoutes(val route: String) {
    object Splash : AuthNavRoutes("Splash")
    object Login : AuthNavRoutes("Login")
    object SignUp : AuthNavRoutes("SignUp")
}


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {

    navigation(
        route = Graph.AUTH_GRAPH,
        startDestination = AuthNavRoutes.Splash.route
    ) {
        composable(
            route = AuthNavRoutes.Splash.route
        ) {
            Splash(
                navController = navController
            )
        }

        composable(route = AuthNavRoutes.SignUp.route) {
            SignUpScreen(
                navController = navController
            )
        }

        composable(route = AuthNavRoutes.Login.route) {
            LoginScreen(
                navController = navController
            )
        }


    }

}