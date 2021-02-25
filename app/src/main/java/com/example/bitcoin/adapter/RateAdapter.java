package com.example.bitcoin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitcoin.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RateAdapter extends RecyclerView.Adapter<RateAdapter.ViewHolder> {

    Context context;
    ArrayList coinname;
    ArrayList images;
    ArrayList price;

    public  RateAdapter(Context context, ArrayList coinname, ArrayList images,ArrayList price){
        this.context = context;
        this.coinname = coinname;
        this.price = price;
        this.images  = images;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.convertcard, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.curname.setText((CharSequence) coinname.get(position));
        holder.exRate.setText((CharSequence) price.get(position));
        holder.coinicon.setImageResource( (int)images.get(position));
    }

    @Override
    public int getItemCount() {
        return coinname.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView curname,exRate;
        ImageView coinicon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            curname  = itemView.findViewById(R.id.curname);
            exRate  = itemView.findViewById(R.id.exRate);
            coinicon = itemView.findViewById(R.id.coinicon);
        }
    }
}
