package jp.techacademy.rei.nishimura.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { _, hour, _ ->
                    if (hour in 2..9) {
                        textView.text = "おはよう"
                    }else if (hour in 10..17) {
                        textView.text = "こんにちは"
                    }else{
                        textView.text = "こんばんは"
                    }
                },
                13, 0, true)
        timePickerDialog.show()
    }
}