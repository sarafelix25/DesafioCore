package digital.house.com.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var listaRestaurantes = getRestaurantes()
    var adapter = RestauranteAdap(listaRestaurantes, this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}