package digital.house.com.desafio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalhe.*
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_menu.ivRestaurante
import kotlinx.android.synthetic.main.prato.*
import kotlinx.android.synthetic.main.prato.tvNomePrato

class DetalheMenuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        val extras = intent.extras
        var foto = extras?.getInt("imagem")
        var nome = extras?.getString("nome")

        if (foto != null){
            ivRestaurante.setImageResource(foto)
        }

        tvNomePrato.text = nome

        val toolbar = setSupportActionBar(tbdetalhe)
    }


}