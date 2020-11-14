package digital.house.com.desafio

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.splash.*

class ActivitySplash: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        val handle = Handler(Looper.myLooper()!!)
        handle.postDelayed(
            Runnable {
                startActivity(Intent(this, ActivityLogin::class.java))
            }, 3000
        )
    }
}