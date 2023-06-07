package com.example.mycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class PlaceItem(
    @StringRes val categoryNameRes: Int,
    @StringRes val placeNameRes: Int,
    @StringRes val descriptionsRes: Int,
    @StringRes val addressRes: Int,
    @StringRes val phoneNumberRes: Int,
    @DrawableRes val imageSmallRes: Int,
    @DrawableRes val imageMediumRes: Int,

    )

data class CategoryItem(
   @StringRes val categoryNameRes: Int,
   @DrawableRes val imageRes: Int
)