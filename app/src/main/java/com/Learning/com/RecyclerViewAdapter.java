package com.Learning.com;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Viewholder> {
    List<Ver>vers;
    RecyclerViewAdapter(List<Ver>vers) {

        this.vers = vers;
    }
    public static class Viewholder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView textView;
        ImageView imageView;
        Viewholder(View itemView){
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.cardview_odd);
            textView=(TextView)itemView.findViewById(R.id.name);
            imageView=(ImageView)itemView.findViewById(R.id.user);


        }
    }
    @Override
    public RecyclerViewAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_recycler_view,parent,false);
        Viewholder viewholder=new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.Viewholder holder, int position) {
        holder.textView.setText(vers.get(position).name);
        holder.imageView.setImageResource(vers.get(position).logo);
    }

    @Override
    public int getItemCount() {
        return vers.size();
    }
}
