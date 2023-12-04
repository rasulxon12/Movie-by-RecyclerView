package uz.akra.dars11hw1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.akra.dars11hw1.R
import uz.akra.dars11hw1.databinding.ItemRecvBinding
import uz.akra.dars11hw1.models.Movie

class MovieAdapter(var context: Context, val list: ArrayList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.Vh>() {

    inner class Vh(var itemRvBinding: ItemRecvBinding) : ViewHolder(itemRvBinding.root) {

        fun onBind(movie: Movie) {
            itemRvBinding.tvImage.setImageResource(movie.img)
            itemRvBinding.tvName.text = movie.name
            itemRvBinding.tvViews.text = movie.views
            itemRvBinding.tvDate.text = movie.date
            val anim = AnimationUtils.loadAnimation(context, R.anim.my_anim)
            itemRvBinding.root.startAnimation(anim)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRecvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}