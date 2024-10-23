package xyz.teamgravity.customtypesafenavtype

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import xyz.teamgravity.customtypesafenavtype.ui.theme.CustomTypeSafeNavTypeTheme
import kotlin.reflect.typeOf

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomTypeSafeNavTypeTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { padding ->
                    val controller = rememberNavController()

                    NavHost(
                        navController = controller,
                        startDestination = Route.DogList,
                        modifier = Modifier.padding(padding)
                    ) {
                        composable<Route.DogList> {
                            DogListScreen(
                                onDogClick = { dog, size ->
                                    controller.navigate(
                                        Route.Dog(
                                            dog = dog,
                                            size = size
                                        )
                                    )
                                }
                            )
                        }
                        composable<Route.Dog>(
                            typeMap = mapOf(
                                typeOf<DogModel>() to DogType,
                                typeOf<DogSize>() to NavType.EnumType(DogSize::class.java)
                            )
                        ) { entry ->
                            val arguments = entry.toRoute<Route.Dog>()
                            DogScreen(
                                dog = arguments.dog,
                                size = arguments.size
                            )
                        }
                    }
                }
            }
        }
    }
}