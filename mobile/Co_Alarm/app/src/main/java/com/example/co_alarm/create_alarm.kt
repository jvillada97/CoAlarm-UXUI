package com.example.co_alarm

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.textfield.TextInputLayout

class create_alarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_alarm)

        val textInputLayout: TextInputLayout = findViewById(R.id.grupo)
        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.autoCompleteGrupo)

        // Lista de grupos
        val grupos = listOf("Grupo 1", "Grupo 2", "Grupo 3")

        // Adaptador
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, grupos)
        autoCompleteTextView.setAdapter(adapter)

        // Cambiar el color del texto al seleccionar un grupo
        autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->
            autoCompleteTextView.setTextColor(Color.BLACK) // Cambiar a negro
        }


        val textInputLayoutF: TextInputLayout = findViewById(R.id.frecuencia)
        val autoCompleteTextView1: AutoCompleteTextView = findViewById(R.id.autoCompleteFrecuencia)

        // Lista de grupos
        val frecuencias = listOf("Diario", "Semanal", "Mensual", "Anual")

        // Adaptador
        val adapterF = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, frecuencias)
        autoCompleteTextView1.setAdapter(adapterF)

        // Cambiar el color del texto al seleccionar un grupo
        autoCompleteTextView1.setOnItemClickListener { parent, view, position, id ->
            autoCompleteTextView1.setTextColor(Color.BLACK) // Cambiar a negro
        }
        // Configurar Toolbar como ActionBar
        val toolbar: Toolbar = findViewById(R.id.topAppBar)
        setSupportActionBar(toolbar)

        // Mostrar el botón de navegación (ícono de back)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        // Manejar el clic en el icono de la flecha
        textInputLayout.setEndIconOnClickListener {
            // Abre el dropdown de AutoCompleteTextView
            if (autoCompleteTextView.isPerformingCompletion) {
                autoCompleteTextView.dismissDropDown()
            } else {
                autoCompleteTextView.showDropDown()
            }
        }

        // Manejar el clic en el icono de la flecha
        textInputLayoutF.setEndIconOnClickListener {
            // Abre el dropdown de AutoCompleteTextView
            if (autoCompleteTextView1.isPerformingCompletion) {
                autoCompleteTextView1.dismissDropDown()
            } else {
                autoCompleteTextView1.showDropDown()
            }
        }

        // Configuración del botón de crear alarma
        val buttonCreateAlarm: Button = findViewById(R.id.buttonCreateAlarm)
        buttonCreateAlarm.setOnClickListener {
            val intent = Intent(this, create_group::class.java)
            startActivity(intent)
        }
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
