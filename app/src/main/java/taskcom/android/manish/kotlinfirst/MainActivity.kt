package taskcom.android.manish.kotlinfirst

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHobbies.setOnClickListener {
            val hobbiesIntent = Intent(this, HobbiesActivity::class.java)
            startActivity(hobbiesIntent)
        }
    }
}

