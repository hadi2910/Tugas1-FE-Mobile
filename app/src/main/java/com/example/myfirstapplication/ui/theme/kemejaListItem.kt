package com.example.myfirstapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapplication.data1.kemeja


@Composable
fun kemejaListItem(
    kemeja: kemeja,
                   modifier: Modifier = Modifier,
                   onClick : (Int) -> Unit) {
    Card (
        //colors = CardDefaults.cardColors(
        //containerColor = Color.White),
        modifier = Modifier.clickable {
            onClick (kemeja.id)
        }
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth()
            .size(width = 100.dp, height = 120.dp),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ){
        Row(
        ) {
            kemejaImage(kemeja = kemeja)
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = kemeja.title,
                    modifier = Modifier,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Lihat Detail")
            }
        }
    }

}

@Composable
private fun kemejaImage(kemeja: kemeja){
    Image(painter = painterResource(id = kemeja.kemejaImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(103.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp))))

}