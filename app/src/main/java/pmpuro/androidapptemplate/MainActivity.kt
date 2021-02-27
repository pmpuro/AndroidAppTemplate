package pmpuro.androidapptemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textVersion).text = BuildConfig.VERSION_NAME
        findViewById<TextView>(R.id.textCode).text = BuildConfig.VERSION_CODE.toString()
    }
}