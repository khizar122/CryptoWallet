package com.example.bitcoin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.bitcoin.R;

public class sliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public sliderAdapter(Context context){
        this.context=context;
    }

    public int[] slideImages = {
            R.drawable.group_29696,
            R.drawable.group_29772,
            R.drawable.group_29776
    };

    public String[] slideHeadings ={
            "All Coins in one Place",
            "Trade Assets",
            "Explore Decenterlized apps"
    };

    public String[] slideDescriptions ={
            "Create Wallet","Create Wallet","Account Wallet"
    };


    @Override
    public int getCount() {
        return slideHeadings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view ==  object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.image2);
        TextView slideHeading = (TextView) view.findViewById(R.id.tv_heading);
        Button slideDescription =  view.findViewById(R.id.btncreate2);

        slideImageView.setImageResource(slideImages[position]);
        slideHeading.setText(slideHeadings[position]);
        slideDescription.setText(slideDescriptions[position]);

        container.addView(view);

        return view;

    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);  //todo: RelativeLayout??
    }
}