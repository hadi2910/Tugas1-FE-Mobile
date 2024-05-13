package com.example.myfirstapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myfirstapplication.data1.DataProvider2
import com.example.myfirstapplication.navigation.Screens
import com.example.myfirstapplication.tasListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun screen2(
    navController: NavController
) {
    val tas = remember {
        DataProvider2.tasList
    }

    Column {
        TopAppBar(
            title = { Text("Screen 2") },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Gray)
        )

        LazyVerticalGrid(
            contentPadding = PaddingValues(40.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize()
        ) {
            items(
                items = tas, key = {it.id},
                itemContent = {
                    tasListItem(tas = it) { TasId ->
                        navController.navigate(Screens.DetailTas.name+"/${TasId}")
                    }
                }
            )
        }
    }
}
