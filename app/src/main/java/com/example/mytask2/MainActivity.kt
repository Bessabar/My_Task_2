package com.example.mytask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottom_nav_menu : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottom_nav_menu = findViewById(R.id.bottom_nav_menu)

        val controller = findNavController(R.id.nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(

            setOf(

                R.id.firstFrag,
                R.id.secondFrag,
                R.id.thirdFrag

            )

        )

        setupActionBarWithNavController(controller,appBarConfiguration)
        bottom_nav_menu.setupWithNavController(controller)

    }
}