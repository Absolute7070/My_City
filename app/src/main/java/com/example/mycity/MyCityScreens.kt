package com.example.mycity

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mycity.datasource.DataSource
import com.example.mycity.ui.CategoryMenuScreen
import com.example.mycity.ui.MyCityViewModel
import com.example.mycity.ui.PlaceMenuScreen
import com.example.mycity.ui.PlaceScreen
import com.example.mycity.ui.theme.MyCityTheme


// top bar names
enum class MyCityScreens (@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Category(title = R.string.category_screen),
    Place(title= R.string.place_screen)
}




/*
Top app bar, diplaying back button if possible
* */
@Composable
fun MyCityAppBar(
    @StringRes currentScreenTitle: Int,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(id = currentScreenTitle), color = Color.White) },
        modifier = modifier,
        navigationIcon =  {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.back_button)
                    )
                }
            } else {
                Icon(
                    painter = painterResource(id = R.drawable.ic_action_name),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        //.padding(8.dp)

                )
            }
        }
    )
}



@Composable
fun MyCityApp(modifier: Modifier = Modifier) {
    // create NavController
    val navController = rememberNavController()
    // get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // get the name of the current screen
    val currentScreen = MyCityScreens.valueOf(
        backStackEntry?.destination?.route ?: MyCityScreens.Start.name
    )

    // Create ViewModel
    val viewModel: MyCityViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            MyCityAppBar(
                currentScreenTitle = if (stringResource(id = currentScreen.title) != stringResource(id = MyCityScreens.Start.title) ) uiState.screenTitle else MyCityScreens.Start.title,
                canNavigateBack = navController.previousBackStackEntry != null ,
                navigateUp = {
                    navController.navigateUp()
                    if (uiState.place != null ) {
                        viewModel.setTitle_returnFromPlaceDescripToPlaceList(uiState.place!!.categoryNameRes)
                    }
                }
            )
        }
    ) { innerPaddding ->

        NavHost(
            navController = navController,
            startDestination = MyCityScreens.Start.name, 
            modifier = Modifier.padding(innerPaddding)
        ) {

            composable(route = MyCityScreens.Start.name) {
                CategoryMenuScreen(
                    options = DataSource.categoryItems,
                    // what happens after clicking the card
                    onSelectionChanged = {
                            item -> viewModel.setCategory(item)
                            navController.navigate(MyCityScreens.Category.name)
                    }
                )
            }

            composable(route = MyCityScreens.Category.name) {
                PlaceMenuScreen(
                    // filter those places that corresponds to the category selected
                    options = DataSource.placeItems.filter{stringResource(it.categoryNameRes) == uiState.category?.categoryNameRes?.let { it1 ->
                        stringResource(
                            it1
                        )
                    } } ,
                    onSelectionChanged = {
                            item -> viewModel.setPlace(item)
                            navController.navigate(MyCityScreens.Place.name)

                    }
                )
            }

            composable(route = MyCityScreens.Place.name) {
                uiState.place?.let { it1 -> PlaceScreen(item = it1) }
            }
        }

    }

}

@Preview
@Composable
fun previewApp() {
    MyCityTheme() {
        MyCityApp()
    }

}