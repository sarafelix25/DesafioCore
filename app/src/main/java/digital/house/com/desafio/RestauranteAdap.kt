package digital.house.com.desafio

import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestauranteAdap(
    private val listRestaurantes: ArrayList<Restaurante>,
    val listener: OnRestauranteClickListener
): RecyclerView.Adapter<RestauranteAdap.RestauranteViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestauranteAdap.RestauranteViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.restaurante, parent, false)
        return RestauranteViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RestauranteAdap.RestauranteViewHolder, position: Int) {
        var restaurante = listRestaurantes.get(position)

        holder.tvNome.text = restaurante.nome
        holder.tvEndereco.text = restaurante.endereco
        holder.tvHorario.text = restaurante.horario
        holder.ivRestaurante.setImageResource(restaurante.foto)
    }

    interface OnRestauranteClickListener{
        fun restauranteClick(position: Int)
    }
    
    override fun getItemCount(): Int = listRestaurantes.size

    inner class RestauranteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        val tvNome: TextView = itemView.findViewById(R.id.tvNome)
        val tvEndereco: TextView = itemView.findViewById(R.id.tvEndereco)
        val tvHorario: TextView = itemView.findViewById(R.id.tvHorario)
        val ivRestaurante: ImageView = itemView.findViewById(R.id.ivRestaurante)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position)
                listener.restauranteClick(position)
        }
    }
}