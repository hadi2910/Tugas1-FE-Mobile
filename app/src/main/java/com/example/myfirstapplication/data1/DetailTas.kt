package com.example.myfirstapplication.data1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myfirstapplication.navigation.topAppback

@Composable
fun DetailTas(
    modifier : Modifier = Modifier,
    navController: NavController,
    TasId : Int?
)
{
    val newTasList = DataProvider2.tasList.filter { tas ->
        tas.id == TasId
    }
    Column(
        modifier = Modifier
    ) {
        detailTasContent(newTasList = newTasList,navController = navController )
    }
}

@Composable
fun detailTasContent(
    newTasList: List<tas>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        if (newTasList.isNotEmpty()) {
            topAppback(
                text = newTasList.first().title,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                newTasList.forEach { tas ->
                    Column(
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = tas.tasImageId),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .width(300.dp)
                                .height(200.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Nama : ${tas.title}")
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Deskripsi : ${tas.description}")
                    }
                }
            }
        } else {
            Text(text = "Tidak ada tas untuk ditampilkan", modifier = Modifier.fillMaxWidth().padding(16.dp))
        }
    }
}