package com.example.bitcoin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.ProgressDialog;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bitcoin.Model.coin;
import com.example.bitcoin.adapter.RateAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import okhttp3.OkHttpClient;

public class home extends AppCompatActivity {

    private RecyclerView recyclerView;
    RateAdapter rateAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.rcycle);
        ArrayList cname = new ArrayList<>(Arrays.asList("Bitcoin", "Ethreum","Dogecoin","Gridcoin","Namecoin"));
        ArrayList price = new ArrayList<>(Arrays.asList("$54,675.00", "$1,956.53$","$0.06","$0.01515095","$0.387114"));
        ArrayList images = new ArrayList<>(Arrays.asList(R.drawable.bitcoin, R.drawable.ethereum,R.drawable.dogecoin,R.drawable.gridcoin,R.drawable.bitcoin));
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL);
        rateAdapter = new RateAdapter(this, cname, images, price);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(rateAdapter);



    }

}