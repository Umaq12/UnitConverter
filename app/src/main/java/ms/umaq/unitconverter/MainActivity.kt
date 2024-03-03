package ms.umaq.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ms.umaq.unitconverter.ui.theme.UnitConverterTheme
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Captain()
                }
            }
        }
    }

    @Composable
    fun Captain() {
        var treasuresFound by remember { mutableStateOf(0) }
        var direction by remember { mutableStateOf("North") }
        var StormOrTreasure by remember { mutableStateOf("") }
        Column {
            Text(text = "Treasures Found ${treasuresFound}")
            Text(text = "Current Direction ${direction}")
            Text(text = "${StormOrTreasure}")
            Button(onClick = {
                direction = "North"
                if (Random.nextBoolean()) {
                    treasuresFound += 1
                    StormOrTreasure = "WE FOUND VALUE"
                } else {
                    StormOrTreasure = "We in the storm"
                }
            }) {
                Text(text = "Sail North")
            }
            Button(onClick = {
                direction = "West"
                if (Random.nextBoolean()) {
                    treasuresFound += 1
                }
            }) {
                Text(text = "Sail West")
            }

            Button(onClick = {
                direction = "East"
                if (Random.nextBoolean()) {
                    treasuresFound += 1
                }
            }) {
                Text(text = "Sail East")
            }

            Button(onClick = {
                direction = "South"
                if (Random.nextBoolean()) {
                    treasuresFound += 1
                }
            }) {
                Text(text = "Sail South")
            }
        }

    }
}


