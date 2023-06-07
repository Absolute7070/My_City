package com.example.mycity.model

import androidx.annotation.StringRes
import com.example.mycity.R

data class MyCityUiState(
    // current screen title
    @StringRes val screenTitle: Int = R.string.app_name,
    // category: e.g. restaurants
    val category: CategoryItem? = null,
    // place: e.g. Zhong Guo Long
    val place: PlaceItem? = null,
)
