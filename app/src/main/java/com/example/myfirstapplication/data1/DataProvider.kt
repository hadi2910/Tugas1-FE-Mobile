package com.example.myfirstapplication.data1

import com.example.myfirstapplication.R

object DataProvider {
    val sepatu =
        sepatu(
            id = 1,
            title = "Sneakers",
            material = "Male",
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            sepatuImageId = R.drawable.s1
        )

    val sepatuList = listOf(
        sepatu,
        sepatu(
            id = 2,
            title = "Running Shoes",
            material = "Female",

            description = "Jubilee enjoys thoughtful discussions by the campfire.",
            sepatuImageId = R.drawable.s2
        ),
        sepatu(
            id = 3,
            title = "Slip On",
            material = "Male",

            description = "Beezy's favorite past-time is helping you choose your brand color.",
            sepatuImageId = R.drawable.s3
        ),
        sepatu(
            id = 4,
            title = "Loafers",
            material = "Male",

            description = "Beezy's favorite past-time is helping you choose your brand color.",
            sepatuImageId = R.drawable.s4
        ),
        sepatu(
            id = 5,
            title = "Boots",
            material = "Male",

            description = "Beezy's favorite past-time is helping you choose your brand color.",
            sepatuImageId = R.drawable.s5
        ),
        sepatu(
            id = 6,
            title = "Stiletto",
            material = "Male",

            description = "Beezy's favorite past-time is helping you choose your brand color.",
            sepatuImageId = R.drawable.s6
        ),
        sepatu(
            id = 7,
            title = "Wedges",
            material = "Male",

            description = "Beezy's favorite past-time is helping you choose your brand color.",
            sepatuImageId = R.drawable.s7
        ),
        sepatu(
            id = 8,
            title = "Flat Shoes",
            material = "Male",

            description = "Beezy's favorite past-time is helping you choose your brand color.",
            sepatuImageId = R.drawable.s8
        ),
        sepatu(
            id = 9,
            title = "Mary Janes",
            material = "Male",

            description = "Beezy's favorite past-time is helping you choose your brand color.",
            sepatuImageId = R.drawable.s9
        ),
        sepatu(
            id = 10,
            title = "Ballerina Flats",
            material = "Male",

            description = "Beezy's favorite past-time is helping you choose your brand color.",
            sepatuImageId = R.drawable.s10
        ),
    )
}