package digital.house.com.desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RestauranteAdap.OnRestauranteClickListener {
    var listaRestaurantes = getRestaurantes()
    var adapter = RestauranteAdap(listaRestaurantes, this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recvRestaurantes.adapter = adapter
        recvRestaurantes.layoutManager = LinearLayoutManager(this)
        recvRestaurantes.setHasFixedSize(true)
    }

    fun getRestaurantes(): ArrayList<Restaurante> {
        val r1 = Restaurante(
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "Fecha às 22:00",
            R.drawable.image1
        )
        val r2 = Restaurante(
            "Aoyama - Moema",
            "Alameda dos Arapanés, 532 - Moema",
            "Fecha às 00:00",
            R.drawable.image2
        )
        val r3 = Restaurante(
            "Outback - Moema",
            "Av. Moaci, 187, 187 - Moema, São Paulo",
            "Fecha às 00:00",
            R.drawable.image4
        )
        val r4 = Restaurante(
            "Sí Señor!",
            "Alameda Jauaperi, 626 - Moema",
            "Fecha às 01:00",
            R.drawable.image3
        )

        return arrayListOf(r1, r2, r3, r4)
    }

    override fun restauranteClick(position: Int) {
        var intent = Intent(this, ActivityMenu::class.java)
        var restaurante: Restaurante = listaRestaurantes.get(position)

        intent.putExtra("imagem", restaurante.foto)
        intent.putExtra("nome", restaurante.nome)

        startActivity(intent)
    }
}