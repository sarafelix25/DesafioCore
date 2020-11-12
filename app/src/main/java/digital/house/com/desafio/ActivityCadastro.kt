package digital.house.com.desafio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityCadastro: AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_cadastro)

            btn_register.setOnClickListener {
                callMain(getInformationUser())
            }
        }

        //Pega as informações do usuario
        fun getInformationUser(): Usuario{
            val username = edUsername.text.toString()
            val senha = edPassword.text.toString()

            return Usuario(1, username, senha)
        }

        //Chama MainActivity
        fun callMain(usuario: Usuario){
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("key", usuario)
            startActivity(intent)
        }
    }
}