package com.example.co_alarm

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class alert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alert)


        val buttonCancelAlarm: Button = findViewById(R.id.buttonCancel)
        buttonCancelAlarm.setOnClickListener {
            showConfirmationDialog("Alarma Finalizada")
        }

        val buttonPuOffAlarm: Button = findViewById(R.id.buttonPutOff)
        buttonPuOffAlarm.setOnClickListener {
            showConfirmationDialog("Tu alarma se repetirá en 5 minutos")
        }

    }

    private fun showConfirmationDialog(message: String) {
        val builder = AlertDialog.Builder(this)

        val customTitleView = layoutInflater.inflate(R.layout.dialog_title_text, null)
        val titleTextView = customTitleView.findViewById<TextView>(R.id.customTitle)
        titleTextView.text = message
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