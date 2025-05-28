package com.example.btvn_tuan3_bai1.Screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import com.example.btvn_tuan3_bai1.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    openMenuScreen:() -> Unit
){

    Column(
        modifier = Modifier.fillMaxSize(), // chiếm toàn bộ màn hình
        verticalArrangement = Arrangement.SpaceEvenly, // chia đều khoảng cách theo chiều dọc
        horizontalAlignment = Alignment.CenterHorizontally // căn giữa theo chiều ngang
    ) {
        Logo()
        DoanVan()
        ButtonChuyen(openMenuScreen)
    }
}

@Composable
fun Logo(){
    Image(
        painter = painterResource(id = R.drawable.jetpack_compose),
        contentDescription = "hinh anh",
        modifier = Modifier
            .size(200.dp)
    )
}

@Composable
fun DoanVan() {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Jetpack Compose",
            modifier = Modifier,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Jetpack Cornpose is a modern toolkit for\n"+
            "building native Android applications using\n"+
                    "a declarativo programming approach.",
            modifier = Modifier,
            color = Color.Gray,
            style = TextStyle(
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )

        )


    }
}

@Composable
fun ButtonChuyen(openMenuScreen:() -> Unit){
    Button(onClick = { openMenuScreen() },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            contentColor = Color.White,
            ),
        modifier = Modifier
            .width(200.dp)
            .height(50.dp),
        shape = RoundedCornerShape(20.dp),
    ) {
        Text(
            text = "I'm ready",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        )


    }
}