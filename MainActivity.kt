package com.example.myapplication

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MyApp()
                }
            }
        }
    }
}


@ExperimentalMaterialApi
@Composable
fun MyApp(){


    Column(
        Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ){

        LazyColumn(
            state = rememberLazyListState(),
            contentPadding = PaddingValues(10.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(
                count = 50,
                itemContent = { value ->
                    ListItem(
                        icon = { Icon(Icons.Default.List,"")},
                        text = { Text("Text $value")},
                        secondaryText = { Text("This is just an example.")},
                        overlineText = { Text("OverLine Text example")}
                    )
                }
            )
        }


    }

}

