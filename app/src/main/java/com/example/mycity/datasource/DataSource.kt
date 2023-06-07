package com.example.mycity.datasource

import com.example.mycity.R
import com.example.mycity.model.CategoryItem
import com.example.mycity.model.PlaceItem

object DataSource {
    val categoryItems = listOf(
        CategoryItem(
            categoryNameRes = R.string.restaurants_category,
            imageRes = R.drawable.restaurant_categorydefault_small
        ),
        CategoryItem(
            categoryNameRes = R.string.coffee_shop_category,
            imageRes = R.drawable.cafe_categorydefault_small
        ),
        CategoryItem(
            categoryNameRes = R.string.kid_friendly_places_category,
            imageRes = R.drawable.kidfriendly_categorydefault_small
        ),
        CategoryItem(
            categoryNameRes = R.string.parks_category,
            imageRes = R.drawable.park_categorydefault_small
        ),
        CategoryItem(
            categoryNameRes = R.string.shopping_center_category,
            imageRes = R.drawable.shoppingmall_categorydefault_small
        )

    )

    val placeItems = listOf(

        // cafes
        PlaceItem(
            categoryNameRes = R.string.coffee_shop_category,
            placeNameRes = R.string.cafe1_name,
            descriptionsRes = R.string.cafe1_description,
            addressRes = R.string.cafe1_address,
            phoneNumberRes = R.string.cafe1_phone,
            imageSmallRes =  R.drawable.cafe_categorydefault_small,
            imageMediumRes =  R.drawable.cafe_categorydefault_small,
        ),
        PlaceItem(
            categoryNameRes = R.string.coffee_shop_category,
            placeNameRes = R.string.cafe2_name,
            descriptionsRes = R.string.cafe2_description,
            addressRes = R.string.cafe2_address,
            phoneNumberRes = R.string.cafe2_phone,
            imageSmallRes =  R.drawable.cafe_categorydefault_small,
            imageMediumRes =  R.drawable.cafe_categorydefault_small,
        ),
        PlaceItem(
            categoryNameRes = R.string.coffee_shop_category,
            placeNameRes = R.string.cafe3_name,
            descriptionsRes = R.string.cafe3_description,
            addressRes = R.string.cafe3_address,
            phoneNumberRes = R.string.cafe3_phone,
            imageSmallRes =  R.drawable.cafe_categorydefault_small,
            imageMediumRes =  R.drawable.cafe_categorydefault_small,
        ),
        PlaceItem(
            categoryNameRes = R.string.coffee_shop_category,
            placeNameRes = R.string.cafe4_name,
            descriptionsRes = R.string.cafe4_description,
            addressRes = R.string.cafe4_address,
            phoneNumberRes = R.string.cafe4_phone,
            imageSmallRes =  R.drawable.cafe_categorydefault_small,
            imageMediumRes =  R.drawable.cafe_categorydefault_small,
        ),


        // restaurants

        PlaceItem(
            categoryNameRes = R.string.restaurants_category,
            placeNameRes = R.string.restaurant1_name,
            descriptionsRes = R.string.restaurant1_description,
            addressRes = R.string.restaurant1_address,
            phoneNumberRes = R.string.restaurant1_phone,
            imageSmallRes = R.drawable.fastfood_default_small,
            imageMediumRes = R.drawable.fastfood_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.restaurants_category,
            placeNameRes = R.string.restaurant2_name,
            descriptionsRes = R.string.restaurant2_description,
            addressRes = R.string.restaurant2_address,
            phoneNumberRes = R.string.restaurant2_phone,
            imageSmallRes = R.drawable.fastfood_default_small,
            imageMediumRes = R.drawable.fastfood_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.restaurants_category,
            placeNameRes = R.string.restaurant3_name,
            descriptionsRes = R.string.restaurant3_description,
            addressRes = R.string.restaurant3_address,
            phoneNumberRes = R.string.restaurant3_phone,
            imageSmallRes = R.drawable.fastfood_default_small,
            imageMediumRes = R.drawable.fastfood_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.restaurants_category,
            placeNameRes = R.string.restaurant4_name,
            descriptionsRes = R.string.restaurant4_description,
            addressRes = R.string.restaurant4_address,
            phoneNumberRes = R.string.restaurant4_phone,
            imageSmallRes = R.drawable.fastfood_default_small,
            imageMediumRes = R.drawable.fastfood_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.restaurants_category,
            placeNameRes = R.string.restaurant5_name,
            descriptionsRes = R.string.restaurant5_description,
            addressRes = R.string.restaurant5_address,
            phoneNumberRes = R.string.restaurant5_phone,
            imageSmallRes = R.drawable.fastfood_default_small,
            imageMediumRes = R.drawable.fastfood_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.restaurants_category,
            placeNameRes = R.string.restaurant6_name,
            descriptionsRes = R.string.restaurant6_description,
            addressRes = R.string.restaurant6_address,
            phoneNumberRes = R.string.restaurant6_phone,
            imageSmallRes = R.drawable.fastfood_default_small,
            imageMediumRes = R.drawable.fastfood_default_medium
        ),


        // kid frinedly places
        PlaceItem(
            categoryNameRes = R.string.kid_friendly_places_category,
            placeNameRes = R.string.kid_friendly1_name,
            descriptionsRes = R.string.kid_friendly1_description,
            addressRes = R.string.kid_friendly1_address,
            phoneNumberRes = R.string.kid_friendly1_phone,
            imageSmallRes = R.drawable.kidfriendly_landscape_default_small,
            imageMediumRes = R.drawable.kidfriendly_landscape_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.kid_friendly_places_category,
            placeNameRes = R.string.kid_friendly2_name,
            descriptionsRes = R.string.kid_friendly2_description,
            addressRes = R.string.kid_friendly2_address,
            phoneNumberRes = R.string.kid_friendly2_phone,
            imageSmallRes = R.drawable.kidfriendly_landscape_default_small,
            imageMediumRes = R.drawable.kidfriendly_landscape_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.kid_friendly_places_category,
            placeNameRes = R.string.kid_friendly3_name,
            descriptionsRes = R.string.kid_friendly3_description,
            addressRes = R.string.kid_friendly3_address,
            phoneNumberRes = R.string.kid_friendly3_phone,
            imageSmallRes = R.drawable.kidfriendly_landscape_default_small,
            imageMediumRes = R.drawable.kidfriendly_landscape_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.kid_friendly_places_category,
            placeNameRes = R.string.kid_friendly4_name,
            descriptionsRes = R.string.kid_friendly4_description,
            addressRes = R.string.kid_friendly4_address,
            phoneNumberRes = R.string.kid_friendly4_phone,
            imageSmallRes = R.drawable.kidfriendly_landscape_default_small,
            imageMediumRes = R.drawable.kidfriendly_landscape_default_medium
        ),

        // parks
        PlaceItem(
            categoryNameRes = R.string.parks_category,
            placeNameRes = R.string.parks1_name,
            descriptionsRes = R.string.parks1_description,
            addressRes = R.string.parks1_address,
            phoneNumberRes = R.string.parks1_phone,
            imageSmallRes = R.drawable.park_default_small,
            imageMediumRes = R.drawable.park_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.parks_category,
            placeNameRes = R.string.parks2_name,
            descriptionsRes = R.string.parks2_description,
            addressRes = R.string.parks2_address,
            phoneNumberRes = R.string.parks2_phone,
            imageSmallRes = R.drawable.park_default_small,
            imageMediumRes = R.drawable.park_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.parks_category,
            placeNameRes = R.string.parks3_name,
            descriptionsRes = R.string.parks3_description,
            addressRes = R.string.parks3_address,
            phoneNumberRes = R.string.parks3_phone,
            imageSmallRes = R.drawable.park_default_small,
            imageMediumRes = R.drawable.park_default_medium
        ),

        // shopping centers
        PlaceItem(
            categoryNameRes = R.string.shopping_center_category,
            placeNameRes = R.string.shopping1_name,
            descriptionsRes = R.string.shopping1_description,
            addressRes = R.string.shopping1_address,
            phoneNumberRes = R.string.shopping1_phone,
            imageSmallRes = R.drawable.shoppingmall_default_small,
            imageMediumRes = R.drawable.shoppingmall_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.shopping_center_category,
            placeNameRes = R.string.shopping2_name,
            descriptionsRes = R.string.shopping2_description,
            addressRes = R.string.shopping2_address,
            phoneNumberRes = R.string.shopping2_phone,
            imageSmallRes = R.drawable.shoppingmall_default_small,
            imageMediumRes = R.drawable.shoppingmall_default_medium
        ),
        PlaceItem(
            categoryNameRes = R.string.shopping_center_category,
            placeNameRes = R.string.shopping3_name,
            descriptionsRes = R.string.shopping3_description,
            addressRes = R.string.shopping3_address,
            phoneNumberRes = R.string.shopping3_phone,
            imageSmallRes = R.drawable.shoppingmall_default_small,
            imageMediumRes = R.drawable.shoppingmall_default_medium
        ),



    )

}