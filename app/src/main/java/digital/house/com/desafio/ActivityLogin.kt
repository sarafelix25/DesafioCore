package digital.house.com.desafio

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cad.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.btnRegister

class ActivityLogin: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            callMain()
        }

        btnRegister.setOnClickListener {
            callCadastro()
        }
    }

    fun callMain() {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun callCadastro() {
        var intent = Intent(this, ActivityCadastro::class.java )
        startActivity(intent)
    }
}