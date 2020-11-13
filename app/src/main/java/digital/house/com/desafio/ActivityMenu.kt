package digital.house.com.desafio

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_menu.*
import java.text.FieldPosition

class ActivityMenu: AppCompatActivity(), PratoAdap.OnPratoClickListener {
    var listaPratos = getPratos()
    var adapter = PratoAdap(listaPratos, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val extras = intent.extras
        var foto = extras?.getInt("imagem")
        var nome = extras?.getString("nome")

        tvNomeRest.text = nome
        if(foto != null){
            ivRestaurante.setImageResource(foto)
        }

        recvPratos.adapter = adapter
        recvPratos.layoutManager = GridLayoutManager(this, 2)
        recvPratos.setHasFixedSize(true)

        val toolbar = setSupportActionBar(tbmenu)
        getSupportActionBar()?.setDisplayShowTitleEnabled(false)
    }

    fun getPratos(): ArrayList<Prato>{
        val p1 = Prato("Salada com molho Gengibre", R.drawable.image2)
        return arrayListOf(p1, p1, p1, p1, p1, p1)
    }

    override fun pratoClick(position: Int){
        var intent = Intent(this, DetalheMenuActivity::class.java)
        var prato: Prato = listaPratos.get(position)

        intent.putExtra("imagem", prato.foto)
        intent.putExtra("nome", prato.nome)

        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}