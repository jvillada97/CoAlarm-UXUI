package com.example.co_alarm

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)


        val buttonNewAlarm: ImageButton = findViewById(R.id.imageButtonNewAlarm)
        buttonNewAlarm.setOnClickListener {
            val intent = Intent(this, create_alarm::class.java)
            startActivity(intent)
        }

        val buttonAlarm: ImageButton = findViewById(R.id.imageButtonAlarms)
        buttonAlarm.setOnClickListener {
            val intent = Intent(this, edit_alarm::class.java)
            startActivity(intent)
        }

        val buttonNewGroup: ImageButton = findViewById(R.id.imageButtonNewGroup)
        buttonNewGroup.setOnClickListener {
            val intent = Intent(this, create_group::class.java)
            startActivity(intent)
        }

        val buttonGroups: ImageButton = findViewById(R.id.imageButtonGroups)
        buttonGroups.setOnClickListener {
            val intent = Intent(this, alert::class.java)
            startActivity(intent)
        }
    }
}