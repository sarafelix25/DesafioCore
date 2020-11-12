package digital.house.com.desafio

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RestauranteAdap(private val listRestaurantes: Restaurantes: ArrayList<Restaurantes>, val listener: OnRestauranteClickListener): RecyclerView.Adapter<RestauranteAdap.RestauranteViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestauranteAdap.RestauranteViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.restaurantes, parent, false)
    }
}