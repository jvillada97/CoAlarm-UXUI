package com.example.co_alarm

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class create_group : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_group)

        val toolbar: Toolbar = findViewById(R.id.topAppBar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val buttonCreateGroup: Button = findViewById(R.id.buttonCreateGroup)
        buttonCreateGroup.setOnClickListener {
            showCreateConfirmationDialog()
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

    private fun showCreateConfirmationDialog() {
        val builder = AlertDialog.Builder(this)

        val customTitleView = layoutInflater.inflate(R.layout.dialog_title_text, null)
        val titleTextView = customTitleView.findViewById<TextView>(R.id.customTitle)
        titleTextView.text = "Tu grupo ha sido creado"
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