package com.example.mycity.ui

import androidx.annotation.StringRes
import androidx.lifecycle.ViewModel
import com.example.mycity.model.CategoryItem
import com.example.mycity.model.MyCityUiState
import com.example.mycity.model.PlaceItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MyCityViewModel: ViewModel() {


    private val _uiState= MutableStateFlow(MyCityUiState())
    val uiState: StateFlow<MyCityUiState> = _uiState.asStateFlow()






    fun reset() {
        _uiState.value = MyCityUiState()
    }
    // set place and change screen title
    fun setPlace(place: PlaceItem) {
        _uiState.update { currentState ->
            currentState.copy(
                screenTitle = place.placeNameRes,
                place = place,
                category = currentState.category
            )
        }
    }

    // set category and change screen title
    fun setCategory(category: CategoryItem) {
        _uiState.update { currentState ->
            currentState.copy(
                screenTitle = category.categoryNameRes,
                place = currentState.place,
                category = category
            )
        }
    }

    fun setTitle_returnFromPlaceDescripToPlaceList(@StringRes screenTitleRes: Int) {
        _uiState.update {currentState ->
            currentState.copy(
                screenTitle = screenTitleRes,
                place = null,
                category = currentState.category
            )
        }
    }

    fun setTitle_returnFromPlaceListToStartScreen(@StringRes screenTitleRes: Int) {
        _uiState.update {currentState ->
            currentState.copy(
                screenTitle = screenTitleRes,
                place = currentState.place,
                category = null
            )
        }
    }


}