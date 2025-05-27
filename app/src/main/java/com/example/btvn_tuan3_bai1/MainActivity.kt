package com.example.btvn_tuan3_bai1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.btvn_tuan3_bai1.Screens.HomeScreen
import com.example.btvn_tuan3_bai1.Screens.ImageScreen
import com.example.btvn_tuan3_bai1.Screens.MenuScreen
import com.example.btvn_tuan3_bai1.Screens.PassWordScreen
import com.example.btvn_tuan3_bai1.Screens.RowScreen
import com.example.btvn_tuan3_bai1.Screens.TextFieldScreen
import com.example.btvn_tuan3_bai1.Screens.TextScreen
import com.example.btvn_tuan3_bai1.ui.theme.BTVN_TUAN3_BAI1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BTVN_TUAN3_BAI1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ManageScreen()
                }
            }
        }
    }
}
@Composable
fun ManageScreen(){
    ImageScreen()

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BTVN_TUAN3_BAI1Theme {
        ManageScreen()
    }
}