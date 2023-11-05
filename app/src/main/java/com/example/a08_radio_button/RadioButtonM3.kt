package com.example.a08_radio_button

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RadioButtonM3(){
    val options = listOf("Optischer Mangel", "Gefahr für die Bausubstanz", "Gefahr in Verzug")
    var selectedOption by remember { mutableStateOf(options[1]) }
    
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center){
        options.forEach{ option ->
            Row (modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .selectable(
                    selected = selectedOption == option,
                    onClick = {selectedOption = option}
                )){
                RadioButton(
                    selected = selectedOption == option,
                    onClick = null)
                Text(text = "Mangel: " + option)
                Text(text = "Mangel: " + option)
                Text(text = "Hallo")
            }
        }
    }

    Log.d(TAG, options.toString())
    Log.d(TAG, selectedOption)
}