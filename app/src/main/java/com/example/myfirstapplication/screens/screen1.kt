package com.example.myfirstapplication.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import com.example.myfirstapplication.data1.DataProvider
import com.example.myfirstapplication.data1.DataProvider3
import com.example.myfirstapplication.kemejaListItem
import com.example.myfirstapplication.navigation.Screens
import sepatuListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun screen1(
    navController: NavController
) {
    val sepatu = remember {
        DataProvider.sepatuList
    }
    val kemeja = remember {
        DataProvider3.kemejaList
    }

    Column {
        TopAppBar(
            title = { Text("Screen 1") },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Gray)
        )
        LazyRow (
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ){
            items(
                items = sepatu, key = {it.id},
                itemContent = {
                    sepatuListItem(sepatu = it) { SepatuId ->
                        navController.navigate(Screens.DetailSepatu.name+"/${SepatuId}")
                    }
                }
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn (
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ){
            items(
                items = kemeja, key = {it.id},
                itemContent = {
                    kemejaListItem(kemeja = it){ KemejaId ->
                        navController.navigate(Screens.DetailKemeja.name+"/${KemejaId}")
                    }
                }
            )
        }
    }
}
