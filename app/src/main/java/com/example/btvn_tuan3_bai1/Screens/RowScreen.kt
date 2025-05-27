package com.example.btvn_tuan3_bai1.Screens

import android.graphics.Color.parseColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RowScreen(){
    Row1Screen()
}

@Composable
fun Row1Screen(){
    val lightBlue = Color(0xFFA9C5EB)
    val deepBlue = Color(0xFF3399FF)
    Column(
        modifier = Modifier
            .padding(top = 40.dp, start = 20.dp, end = 20.dp) // chỉ cách đỉnh điện thoại
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            // Nút back ở bên trái
            IconButton(
                onClick = {},
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }

            // Tiêu đề căn giữa
            Text(
                text = "Row Layout",
                modifier = Modifier.align(Alignment.Center),
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(parseColor("#0099FF"))
                )
            )
        }


        repeat(4){
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier
                .padding(vertical = 10.dp)
            ){
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(lightBlue)
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(deepBlue)
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(lightBlue)
                )
            }
        }
    }



}