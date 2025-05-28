package com.example.btvn_tuan3_bai1.Screens

import android.graphics.Color.parseColor
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ColumnScreen(BackMenu:()-> Unit){
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
                text = "Text Detail",
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
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,                ),
                text = buildAnnotatedString {
                    append("The ")
                    withStyle(style = SpanStyle(textDecoration = TextDecoration.LineThrough)) {
                        append("quick")
                    }
                    withStyle(style = SpanStyle(fontSize = 50.sp, color = Color(parseColor("#DB9900")))) {
                        append(" B")
                    }
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(parseColor("#DB9900")))) {
                        append("rown\n")
                    }
                    append("fox j u m p s ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)) {
                        append("over\n")
                    }
                    withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                        append(" the")
                    }
                    withStyle(style = SpanStyle(fontFamily = FontFamily.Serif, fontSize= 15.sp)) {
                        append(" lazy ")
                    }
                    append("dog.")

                }
            )
        }
    }



}