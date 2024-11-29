import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: EjemploViewModel = viewmodel()
) {
    WellnessTaskList(
        list = wellnessViewModel.tasks,
        onCheckedTask = { task, checked ->
            wellnessViewModel.changeTaskChecked(task, checked)
        },
        onCloseTask = { task ->
            wellnessViewModel.remove(task)
        }
    )
}