package com.ilham.myfootballleague

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class LeagueAdapter (private val context: Context, private val items: List<League>) : RecyclerView.Adapter<LeagueAdapter.LeagueViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueViewHolder {
        return LeagueViewHolder(
            GridLayoutItemUI().createView(AnkoContext.Companion.create(context, parent))
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: LeagueViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    class LeagueViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        private val imgLeague: ImageView = itemView.find(R.id.img_league)
        private val tvLeagueName: TextView = itemView.find(R.id.tv_league_name)

        fun bindItem(items: League) {
            Glide.with(itemView.context).load(items.logo).into(imgLeague)
            tvLeagueName.text = items.name
            itemView.setOnClickListener {
                itemView.context.startActivity<DetailActivity>("league" to items)
            }
        }
    }

    class GridLayoutItemUI: AnkoComponent<ViewGroup> {
        override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui){
            cardView {
                lparams(width = matchParent, height = wrapContent) {
                    margin = dip(12)
                }

                verticalLayout {
                    lparams(width = matchParent, height = wrapContent) {
                        padding = dip(16)
                    }

                    imageView {
                        id = R.id.img_league
                        contentDescription = resources.getString(R.string.image)
                    }.lparams(width = dip(100), height = dip(125)) {
                        gravity = Gravity.CENTER_HORIZONTAL
                        bottomMargin = dip(8)
                    }

                    textView {
                        id = R.id.tv_league_name
                        textColor = Color.BLACK
                        textSize = 16F
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                    }.lparams(width = matchParent, height = wrapContent)

                }

            }
        }
    }
}