package com.example.co_alarm

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class create_group : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_group)

        // Configurar Toolbar como ActionBar
        val toolbar: Toolbar = findViewById(R.id.topAppBar)
        setSupportActionBar(toolbar)

        // Mostrar el botón de navegación (ícono de back)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back)
        supportActionBar?.setDisplayShowTitleEnabled(false)

    }


    // Inflar el menú con el ícono de "home"
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    // Manejar las acciones de los botones en la Toolbar (back y home)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                // Acción cuando se presiona el ícono de "back"
                onBackPressed()
                true
            }
            R.id.home_button -> {
                // Acción cuando se presiona el ícono de "home"
                val intent = Intent(this, MainActivity::class.java) // Redirigir a MainActivity o la actividad deseada
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}