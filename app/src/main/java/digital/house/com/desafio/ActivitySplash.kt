package digital.house.com.desafio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.splash.*

class ActivitySplash: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        imgv2.setOnClickListener{
            startActivity(Intent(this@ActivitySplash, ActivityLogin::class.java))
        }
    }
}