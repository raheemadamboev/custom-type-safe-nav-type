package xyz.teamgravity.customtypesafenavtype

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DogListScreen(
    onDogClick: (dog: DogModel, size: DogSize) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(DogData.VALUE) { dog ->
            Text(
                text = dog.first.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onDogClick(dog.first, dog.second)
                    }
                    .padding(16.dp)
            )
        }
    }
}