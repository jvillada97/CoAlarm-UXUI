package com.example.co_alarm

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
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
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class create_alarm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_alarm)

        val datePicker: DatePicker = findViewById(R.id.datePicker)

        hideDatePickerHeader(datePicker)

        val buttonText = findViewById<TextView>(R.id.textAccept)

        buttonText.setOnClickListener {
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
            autoCompleteTextView.setTextColor(Color.BLACK)
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
            showCreateConfirmationDialog()
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
                val intent = Intent(this, Menu::class.java)
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

    private fun showCreateConfirmationDialog() {
        val builder = AlertDialog.Builder(this)

        val customTitleView = layoutInflater.inflate(R.layout.dialog_title_text, null)
        val titleTextView = customTitleView.findViewById<TextView>(R.id.customTitle)
        titleTextView.text = "Tu alarma ha sido creada"
        builder.setCustomTitle(customTitleView)

        builder.setPositiveButton("Aceptar") { dialog, id ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.setOnShowListener {
            dialog.getButton(AlertDialog.BUTTON_POSITIVE)?.apply {
                setTextColor(Color.BLACK)
                textSize = 10f
            }

            dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_border)
        }

        dialog.show()

        val window = dialog.window
        if (window != null) {
            val width = (312 * resources.displayMetrics.density).toInt()
            val height = (107 * resources.displayMetrics.density).toInt()
            window.setLayout(width, height)
            window.setGravity(Gravity.CENTER)
        }
    }
}
