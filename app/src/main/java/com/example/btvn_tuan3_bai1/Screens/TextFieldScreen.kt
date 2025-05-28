
package com.example.btvn_tuan3_bai1.Screens

import android.R
import android.graphics.Color.parseColor

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun TextFieldScreen(BackMenu:()-> Unit){
    TextField1Screen(BackMenu)
}

@Composable
fun TextField1Screen(BackMenu:()-> Unit){
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .padding(top = 40.dp, start = 20.dp, end = 20.dp) // chỉ cách đỉnh điện thoại
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            // Nút back ở bên trái
            IconButton(
                onClick = {BackMenu()},
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }

            // Tiêu đề căn giữa
            Text(
                text = "TextField",
                modifier = Modifier.align(Alignment.Center),
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color(parseColor("#0099FF"))
                )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center

        ) {
            TextField(
                value = text,
                onValueChange = {text = it},
                label = {Text("Nhập nội dung...")},
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))

            )
            Text(
                text="Tự động cập nhật dữ liệu theo textfield",
                style = TextStyle(
                    fontSize = 17.sp,
                    color = Color.Red,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top=15.dp)
            )
        }
    }



}