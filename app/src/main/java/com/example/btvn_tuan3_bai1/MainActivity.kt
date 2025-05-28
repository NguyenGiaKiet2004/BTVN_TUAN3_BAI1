package com.example.btvn_tuan3_bai1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.btvn_tuan3_bai1.Screens.ColumnScreen
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
    val navController = rememberNavController()
    BTVN_TUAN3_BAI1Theme{
        NavHost(navController= navController, startDestination = "home"){
            composable ("home") {
                HomeScreen(
                    openMenuScreen = {
                        navController.navigate("MenuScreen")
                    },
                )
            }
                composable("MenuScreen") {
                    MenuScreen(
                        openImageScreen = {
                            navController.navigate("ImageScreen")
                        },
                        openTextScreen = {
                            navController.navigate("TextScreen")
                        },
                        openRowScreen = {
                            navController.navigate("RowScreen")
                        },
                        openPassWordScreen = {
                            navController.navigate("PassWordScreen")
                        },
                        openTextFieldScreen = {
                            navController.navigate("TextFieldScreen")
                        },
                        openColumnScreen ={
                            navController.navigate("ColumnScreen")
                        }
                    )
                }
            composable ("TextScreen") {
                TextScreen(
                    BackMenu = {
                        navController.navigate("MenuScreen")
                    },
                )
            }
            composable ("ImageScreen") {
                ImageScreen(
                    BackMenu = {
                        navController.navigate("MenuScreen")
                    },
                )
            }
            composable ("RowScreen") {
                RowScreen(
                    BackMenu = {
                        navController.navigate("MenuScreen")
                    },
                )
            }
            composable ("PassWordScreen") {
                PassWordScreen(
                    BackMenu = {
                        navController.navigate("MenuScreen")
                    },
                )
            }
            composable ("TextFieldScreen") {
                TextFieldScreen(
                    BackMenu = {
                        navController.navigate("MenuScreen")
                    },
                )
            }
            composable ("ColumnScreen") {
                ColumnScreen(
                    BackMenu = {
                        navController.navigate("MenuScreen")
                    },
                )
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BTVN_TUAN3_BAI1Theme {
        ManageScreen()
    }
}