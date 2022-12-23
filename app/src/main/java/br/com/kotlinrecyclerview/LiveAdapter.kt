package br.com.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import br.com.kotlinrecyclerview.databinding.ResItemLiveBinding
import br.com.kotlinrecyclerview.model.Live

class LiverAdapter : RecyclerView.Adapter<ViewHolder>() {

    private var items : List<Live> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ResItemLiveBinding.inflate(inflater, parent, false)
        return LiveViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(holder) {
            is LiveViewHolder -> {
                holder.bind(items[position])
            }
        }


    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(lives : List<Live>) {
        this.items = lives
    }

    class LiveViewHolder(var binding: ResItemLiveBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(live: Live) {
            binding.title.text= live.title
            binding.author.text= live.author
        }


    }

}
