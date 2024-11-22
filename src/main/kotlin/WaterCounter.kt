import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
        horizontalAlignment = Alignment.Start
    ) {
        var contadorVasos by remember { mutableStateOf(0) }
        if (contadorVasos > 0) {
            var showTask by remember { mutableStateOf(true) }
            if (showTask) {
                WellnessTaskItem(
                    onClose = { },
                    taskName = "Es importante beber mucha agua"
                )
            }
            Text("Tienes $contadorVasos vasos.")
        }
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Button(
                onClick = { contadorVasos++ },
                Modifier.padding(vertical = 15.dp),
                enabled = contadorVasos < 10
            ) {
                Text("Añadir vaso")
            }
            Button(
                onClick = { contadorVasos = 0 }
            )
            {
                Text("Reset")
            }
        }
    }
}