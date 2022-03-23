package com.example.assignment4

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val btn = findViewById(R.id.button) as Button
       val dateTimeTextView = findViewById(R.id.dateText)as TextView
       val ageText=findViewById(R.id.ageText) as TextView
        val infosText=findViewById(R.id.wholeinfostext) as TextView

        //Calendar
         val c= Calendar.getInstance()
        val year=c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day=c.get(Calendar.DAY_OF_MONTH)
        val minutes=c.get(Calendar.MINUTE)


        btn.setOnClickListener {
         val dialogPicker=DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker, yYear, mMonth, mDay ->
             dateTimeTextView.setText(""+mDay+"/"+mMonth+"/"+yYear)
             ageText.text=(year-yYear).toString()
             infosText.text=("${year-yYear},${month-mMonth},${day-mDay},${minutes}").toString()

         },year,month,day)
            //show the dialog message
            dialogPicker.show()

        }

    }

}