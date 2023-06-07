package com.example.mycity.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mycity.model.CategoryItem
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycity.R
import com.example.mycity.datasource.DataSource
import com.example.mycity.model.PlaceItem
import com.example.mycity.ui.theme.MyCityTheme


@Composable
fun PlaceScreen(
    item: PlaceItem,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .padding(18.dp)
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = item.imageMediumRes),
            contentDescription = "" ,
            contentScale = ContentScale.FillWidth
        )
        Column(
            horizontalAlignment = Alignment.Start ,
            modifier = Modifier.fillMaxWidth()

        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(text = "Address:", style = MaterialTheme.typography.h6 )
                Text(text = stringResource(id = item.addressRes), style = MaterialTheme.typography.body1)

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(text = "Phone:", style = MaterialTheme.typography.h6)
                Text(text = stringResource(id = item.phoneNumberRes), style = MaterialTheme.typography.body1 )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Description:", style = MaterialTheme.typography.h6)
                Text(text = stringResource(id =  item.descriptionsRes) , style = MaterialTheme.typography.body1 )
            }
        }
//
    }

}

@Composable
fun PlaceMenuScreen(
    options: List<PlaceItem>,
    onSelectionChanged: (PlaceItem) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedItemName by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {
        options.forEach{ item ->

            selectedItemName = stringResource(id = item.placeNameRes)
            ItemRowForPlace(
                item = item,
                selectedItemName = selectedItemName,
                onSelectionItemChanged = {selectedItemName = selectedItemName} ,
                onSelectionChanged = onSelectionChanged
            )
        }

    }
}





@Composable
fun CategoryMenuScreen(
    options: List<CategoryItem>,
    onSelectionChanged: (CategoryItem) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedItemName by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {
        options.forEach{ item ->

            selectedItemName = stringResource(id = item.categoryNameRes)
            ItemRowForCategory(
                item = item,
                selectedItemName = selectedItemName,
                onSelectionItemChanged = {selectedItemName = selectedItemName} ,
                onSelectionChanged = onSelectionChanged as (CategoryItem) -> Unit
            )
        }

    }
}



@Composable
fun ItemRowForPlace(
    item: PlaceItem,
    selectedItemName: String,
    onSelectionItemChanged: (String) -> Unit,
    onSelectionChanged: (PlaceItem) -> Unit,
    modifier: Modifier = Modifier

) {

    // convert category name into string to be used in onClick
    val placeName = stringResource(id = item.placeNameRes)

    Card(
        // elevation = 4.dp,
        modifier = Modifier
            .selectable(
                selected = selectedItemName == stringResource(id = item.categoryNameRes),
                onClick = {
                    onSelectionItemChanged(placeName)  // select item name
                    onSelectionChanged(item)        // what happens after click -> update category

                }
            )
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            // .border(BorderStroke(4.dp, Color.Gray))
            .height(82.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Divider(thickness = 1.dp, color = Color.Black)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(id = item.imageSmallRes),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(80.dp)

                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(start = 8.dp)
                    // .fillMaxHeight()
                ) {
                    Text(
                        text = placeName,
                        style = MaterialTheme.typography.h5
                    )

                }
            }
            Divider(thickness = 1.dp, color = Color.Black)
        }
    }
}

@Composable
fun ItemRowForCategory(
    item: CategoryItem,
    selectedItemName: String,
    onSelectionItemChanged: (String) -> Unit,
    onSelectionChanged: (CategoryItem) -> Unit

) {

    // convert category name into string to be used in onClick
    val categoryName = stringResource(id = item.categoryNameRes)

    Card(
       // elevation = 4.dp,
        modifier = Modifier
            .selectable(
                selected = selectedItemName == stringResource(id = item.categoryNameRes),
                onClick = {
                    onSelectionItemChanged(categoryName)  // select item name
                    onSelectionChanged(item)        // what happens after click -> update category

                }
            )
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            // .border(BorderStroke(4.dp, Color.Gray))
            .height(82.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Divider(thickness = 1.dp, color = Color.Black)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(id = item.imageRes),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(80.dp)

                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .padding(start = 8.dp)
                       // .fillMaxHeight()
                ) {
                    Text(
                        text = categoryName,
                        style = MaterialTheme.typography.h5
                    )

                }
            }
            Divider(thickness = 1.dp, color = Color.Black)
        }
    }
}


@Preview
@Composable 
fun PlaceScreenPreview() {
    MyCityTheme() {
        PlaceScreen(item = DataSource.placeItems.get(1))
    }

}


@Preview
@Composable
fun CategoryScreenMenuPreview() {
    MyCityTheme() {
        CategoryMenuScreen(options = DataSource.categoryItems, onSelectionChanged = {} )
    }
}

@Preview
@Composable
fun PlaceScreenMenuPreview() {
    PlaceMenuScreen(options = DataSource.placeItems, onSelectionChanged = {} )
}