package digital.house.com.desafio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.prato.view.*

class PratoAdap (private val listPratos: ArrayList<Prato>, val listener: PratoAdap.OnPratoClickListener): RecyclerView.Adapter<PratoAdap.PratoViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): PratoAdap.PratoViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.prato, parent, false)
        return PratoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PratoAdap.PratoViewHolder, position: Int) {
        var prato = listPratos.get(position)

        holder.tvNomePrato.text = prato.nome
        holder.ivPrato.setImageResource(prato.foto)
    }

    interface OnPratoClickListener {
        fun pratoClick(position: Int)
    }

    override fun getItemCount() = listPratos.size

    inner class PratoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val tvNomePrato: TextView = itemView.findViewById(R.id.tvNomePrato)
        val ivPrato: ImageView = itemView.findViewById(R.id.ivPrato)


        init {
            itemView.setOnClickListener(this)
        }


        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position)
                listener.pratoClick(position)
        }
    }
}

