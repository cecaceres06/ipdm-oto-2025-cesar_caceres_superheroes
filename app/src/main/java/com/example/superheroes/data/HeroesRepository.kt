package com.example.superheroes.data

import com.example.superheroes.R
import com.example.superheroes.model.Hero

object HeroesRepository {
    val heroes = listOf(
        Hero(R.string.hero1, R.string.description1, R.string.power1, R.drawable.hero_1),
        Hero(R.string.hero2, R.string.description2, R.string.power2, R.drawable.hero_2),
        Hero(R.string.hero3, R.string.description3, R.string.power3, R.drawable.hero_3),
        Hero(R.string.hero4, R.string.description4, R.string.power4, R.drawable.hero_4),
        Hero(R.string.hero5, R.string.description5, R.string.power5, R.drawable.hero_5),
        Hero(R.string.hero6, R.string.description6, R.string.power6, R.drawable.hero_6)
    )
}
