package com.example.myfirstapplication.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItems = listOf(
    NavItem(
        label = "Screen 1",
        icon = Icons.Default.Home,
        route = Screens.HomeScreen.name
    ),
    NavItem(label = "Screen 2",
        icon = Icons.Default.Home,
        route = Screens.ProfileScreen.name
    ),
    NavItem(label = "About",
        icon = Icons.Default.Person,
        route = Screens.AboutScreen.name
    )
)