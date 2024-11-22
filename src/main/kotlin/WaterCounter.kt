import androidx.compose.foundation.layout.Column
import androidx.compose.ui.semantics.Role.Companion.Button


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var contadorVasos by remember { mutableStateOf(0) }

        Button(
            onClick = { contadorVasos++ },
            Modifier.padding(bottom = 15.dp)
        ) {
            Text("Añadir vaso")
        }
        if (contadorVasos > 0) {
            Text("Tienes $contadorVasos vasos.")
        }

    }
}