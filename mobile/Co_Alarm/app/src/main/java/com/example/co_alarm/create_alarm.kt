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
import android.view.View
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class create_alarm : AppCompatActivity() {
    private lateinit var datePicker: DatePicker
    private lateinit var selectedDateTextView: TextView
    private lateinit var calendarIcon: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_alarm)

        // Encuentra el DatePicker
        val datePickerIni: DatePicker = findViewById(R.id.datePicker)

        // Oculta la cabecera del DatePicker
        hideDatePickerHeader(datePickerIni)

        val buttonText = findViewById<TextView>(R.id.textAccept)
        val datePicker: DatePicker = findViewById(R.id.datePicker)

        buttonText.setOnClickListener {
            // Aquí puedes manejar la fecha seleccionada
            val day = datePicker.dayOfMonth
            val month = datePicker.month
            val year = datePicker.year
            datePicker.visibility = View.GONE
            buttonText.visibility = View.GONE
        }

        val textInputLayout: TextInputLayout = findViewById(R.id.grupo)
        val autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.autoCompleteGrupo)

        val grupos = listOf("Grupo 1", "Grupo 2", "Grupo 3")

        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, grupos)
        autoCompleteTextView.setAdapter(adapter)

        autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->
            autoCompleteTextView.setTextColor(Color.BLACK) // Cambiar a negro
        }

        val textInputLayoutF: TextInputLayout = findViewById(R.id.frecuencia)
        val autoCompleteTextView1: AutoCompleteTextView = findViewById(R.id.autoCompleteFrecuencia)

        val frecuencias = listOf("Diario", "Semanal", "Mensual", "Anual")

        val adapterF = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, frecuencias)
        autoCompleteTextView1.setAdapter(adapterF)

        autoCompleteTextView1.setOnItemClickListener { parent, view, position, id ->
            autoCompleteTextView1.setTextColor(Color.BLACK)
        }
        val toolbar: Toolbar = findViewById(R.id.topAppBar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        textInputLayout.setEndIconOnClickListener {
            if (autoCompleteTextView.isPerformingCompletion) {
                autoCompleteTextView.dismissDropDown()
            } else {
                autoCompleteTextView.showDropDown()
            }
        }

        textInputLayoutF.setEndIconOnClickListener {
            if (autoCompleteTextView1.isPerformingCompletion) {
                autoCompleteTextView1.dismissDropDown()
            } else {
                autoCompleteTextView1.showDropDown()
            }
        }

        val buttonCreateAlarm: Button = findViewById(R.id.buttonCreateAlarm)
        buttonCreateAlarm.setOnClickListener {
            val intent = Intent(this, create_group::class.java)
            startActivity(intent)
        }

        val selectedDateTextView = findViewById<TextInputEditText>(R.id.selectedDateTextView)
        val textInputLayoutDate = findViewById<TextInputLayout>(R.id.fecha)
        val todayInMillis = System.currentTimeMillis()

        datePicker.minDate = todayInMillis
        textInputLayoutDate.setEndIconOnClickListener {
            if (datePicker.visibility == View.GONE) {
                datePicker.visibility = View.VISIBLE
                buttonText.visibility = View.VISIBLE
                datePicker.requestFocus()
            } else {
                datePicker.visibility = View.GONE
                buttonText.visibility = View.GONE
            }
        }

        datePicker.init(datePicker.year, datePicker.month, datePicker.dayOfMonth) { _, year, month, day ->
            val selectedDate = "$day/${month + 1}/$year"
            selectedDateTextView.setText(selectedDate)
            selectedDateTextView.setTextColor(Color.BLACK)
        }

    }




    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            R.id.home_button -> {
                val intent = Intent(this, MainActivity::class.java) // Redirigir a MainActivity o la actividad deseada
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun hideDatePickerHeader(datePicker: DatePicker) {
        val daySpinnerId = resources.getIdentifier("day", "id", "android")
        val monthSpinnerId = resources.getIdentifier("month", "id", "android")
        val yearSpinnerId = resources.getIdentifier("year", "id", "android")


        val daySpinner = datePicker.findViewById<View>(daySpinnerId)
        val monthSpinner = datePicker.findViewById<View>(monthSpinnerId)
        val yearSpinner = datePicker.findViewById<View>(yearSpinnerId)

        if (daySpinner != null) {
            daySpinner.visibility = View.VISIBLE
        }
        if (monthSpinner != null) {
            monthSpinner.visibility = View.VISIBLE
        }
        if (yearSpinner != null) {
            yearSpinner.visibility = View.VISIBLE
        }

        val headerId = resources.getIdentifier("date_picker_header", "id", "android")
        val header = datePicker.findViewById<View>(headerId)
        if (header != null) {
            header.visibility = View.GONE
        }


    }
}
