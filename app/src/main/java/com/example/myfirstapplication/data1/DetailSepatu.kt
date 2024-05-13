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
fun DetailSepatu(
    modifier : Modifier = Modifier,
    navController: NavController,
    SepatuId : Int?
)
{
    val newSepatuList = DataProvider.sepatuList.filter { sepatu ->
        sepatu.id == SepatuId
    }
    Column(
        modifier = Modifier
    ) {
        detailSepatuContent(newSepatuList = newSepatuList,navController = navController )
    }
}

@Composable
fun detailSepatuContent(
    newSepatuList: List<sepatu>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        if (newSepatuList.isNotEmpty()) {
            topAppback(
                text = newSepatuList.first().title,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                newSepatuList.forEach { sepatu ->
                    Column(
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = sepatu.sepatuImageId),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                                .width(300.dp)
                                .height(200.dp)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Nama : ${sepatu.title}")
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Deskripsi : ${sepatu.description}")
                    }
                }
            }
        } else {
            Text(text = "Tidak ada sepatu untuk ditampilkan", modifier = Modifier.fillMaxWidth().padding(16.dp))
        }
    }
}