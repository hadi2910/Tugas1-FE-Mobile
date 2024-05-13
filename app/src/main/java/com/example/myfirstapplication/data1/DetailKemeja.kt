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
fun DetailKemeja(
    modifier : Modifier = Modifier,
    navController: NavController,
    KemejaId : Int?
)
{
    val newKemejaList = DataProvider3.kemejaList.filter { kemeja ->
        kemeja.id == KemejaId
    }
    Column(
        modifier = Modifier
    ) {
        detailKemejaContent(newKemejaList = newKemejaList,navController = navController )
    }
}

@Composable
fun detailKemejaContent(
    newKemejaList: List<kemeja>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        if (newKemejaList.isNotEmpty()) {
            topAppback(
                text = newKemejaList.first().title,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                newKemejaList.forEach { kemeja ->
                    Column(
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = kemeja.kemejaImageId),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .width(300.dp)
                                .height(200.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Nama : ${kemeja.title}")
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Deskripsi : ${kemeja.description}")
                    }
                }
            }
        } else {
            Text(text = "Tidak ada kemeja untuk ditampilkan", modifier = Modifier.fillMaxWidth().padding(16.dp))
           }
        }
}