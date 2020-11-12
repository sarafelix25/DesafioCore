package digital.house.com.desafio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cad.*

class ActivityCadastro: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad)
        toolbar.setNavigationOnClickListener {
            startActivity(Intent(this, ActivityLogin::class.java))
        }
        btnRegister.setOnClickListener {
            callMain()
        }
    }

    fun callMain() {
        var intent = Intent(this, MainActivity::class.java)
    }
}
