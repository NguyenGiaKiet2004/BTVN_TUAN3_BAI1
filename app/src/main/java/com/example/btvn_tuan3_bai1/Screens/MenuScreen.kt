package com.example.btvn_tuan3_bai1.Screens

import android.R.attr.text
import android.R.style
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import android.graphics.Color.parseColor
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun MenuScreen(
    openImageScreen:() -> Unit,
    openTextScreen:()-> Unit,
    openRowScreen:()-> Unit,
    openPassWordScreen:()-> Unit,
    openTextFieldScreen:()-> Unit,
    openColumnScreen:() -> Unit
){
    Column(
        modifier = Modifier
            .padding(20.dp)
    ){


    Text(text = "UI Components List",
        modifier = Modifier
            .padding(vertical = 50.dp)
            .fillMaxWidth(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(parseColor("#0099FF"))// tao mau theo ma mau
        )

    )
    Column(
        modifier = Modifier.fillMaxSize(), // chiếm toàn bộ màn hình
        verticalArrangement = Arrangement.spacedBy(20.dp),//SpaceEvenly, // chia đều khoảng cách theo chiều dọc
    ) {

        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Text(text = "Display",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left
                )
                )
            Button(onClick = {openTextScreen()},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(parseColor("#99CCFF")),
                    contentColor = Color.Black,
                    )
                ) {
                Column(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Text",
                        modifier = Modifier.fillMaxWidth(),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Left
                        ))
                    Text(text = "Display text", color = Color.Gray)
                }
            }
            Button(onClick = {openImageScreen()},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(parseColor("#99CCFF")),
                    contentColor = Color.Black,
                )
                ) {
                Column(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Image",
                        modifier = Modifier.fillMaxWidth(),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Left
                        ))
                    Text(text = "Display image", color = Color.Gray)
                }
            }
        }
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Text(text = "Input",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left
                )
                )
            Button(onClick = {openTextFieldScreen()},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(parseColor("#99CCFF")),
                    contentColor = Color.Black,
                )
                ) {
                Column(modifier = Modifier.fillMaxWidth()){
                    Text(text = "TextField",
                        modifier = Modifier.fillMaxWidth(),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Left
                        ))
                    Text(text = "Input field for text", color = Color.Gray)
                }
            }
            Button(onClick = { openPassWordScreen()},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(parseColor("#99CCFF")),
                    contentColor = Color.Black,
                )
                ) {
                Column(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Password",
                        modifier = Modifier.fillMaxWidth(),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Left
                        ))
                    Text(text = "Input field for password", color = Color.Gray)
                }
            }
        }
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Text(text = "Layout",
                modifier = Modifier,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left
                )
                )
            Button(onClick = {openColumnScreen()},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(parseColor("#99CCFF")),
                    contentColor = Color.Black,
                )
                ) {
                Column(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Column",
                        modifier = Modifier.fillMaxWidth(),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Left
                        ))
                    Text(text = "Arrange elements vertically", color = Color.Gray)
                }
            }
            Button(onClick = {openRowScreen()},
                modifier = Modifier.fillMaxWidth(),

                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(parseColor("#99CCFF")),
                    contentColor = Color.Black,
                )
                ) {
                Column(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Row",
                        modifier = Modifier.fillMaxWidth(),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Left
                        ))
                    Text(text = "Arrange elements horizontally", color = Color.Gray)
                }
            }
            Button(onClick = {},
                modifier = Modifier.fillMaxWidth(),

                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(parseColor("#FF8A8A")),
                    contentColor = Color.Black,
                )
            ) {
                Column(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Row",
                        modifier = Modifier.fillMaxWidth(),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Left
                        ))
                    Text(text = "Arrange elements horizontally", color = Color.Gray)
                }
            }
        }
    }
    }
}