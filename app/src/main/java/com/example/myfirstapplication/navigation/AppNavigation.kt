package com.example.myfirstapplication.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myfirstapplication.data1.DetailKemeja
import com.example.myfirstapplication.data1.DetailSepatu
import com.example.myfirstapplication.data1.DetailTas
import com.example.myfirstapplication.screens.screen1

import com.example.myfirstapplication.screens.screen2
import com.example.myfirstapplication.screens.screen3

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
               val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach{ navItem ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any{ it.route == navItem.route} == true,
                        onClick = {
                              navController.navigate(navItem.route){
                                  popUpTo(navController.graph.findStartDestination().id){
                                     saveState = true
                                  }
                                  launchSingleTop = true
                                  restoreState = true
                              }
                        },
                        icon = {
                               Icon(
                                   imageVector = navItem.icon,
                                   contentDescription = null)
                        },
                        label = {
                            Text(text = navItem.label)

                        }

                    )
                }

}
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            composable(route = Screens.HomeScreen.name) {
                screen1(navController)
            }
            composable(route = Screens.ProfileScreen.name) {
                screen2(navController)
            }
            composable(route = Screens.AboutScreen.name) {
               screen3()
            }
            composable(route = Screens.DetailKemeja.name + "/{KemejaId}", arguments = listOf(
                navArgument("KemejaId"){
                    type = NavType.IntType
                }) ){
                    navBackStackEntry ->
                DetailKemeja(navController = navController, KemejaId = navBackStackEntry.arguments?.getInt("KemejaId"))

            }
            composable(route = Screens.DetailSepatu.name + "/{SepatuId}", arguments = listOf(
                navArgument("SepatuId"){
                    type = NavType.IntType
                }) ){
                    navBackStackEntry ->
                DetailSepatu(navController = navController, SepatuId = navBackStackEntry.arguments?.getInt("SepatuId"))

            }
            composable(route = Screens.DetailTas.name + "/{TasId}", arguments = listOf(
                navArgument("TasId"){
                    type = NavType.IntType
                }) ){
                    navBackStackEntry ->
                DetailTas(navController = navController, TasId = navBackStackEntry.arguments?.getInt("TasId"))


            }
    }
}
    }



