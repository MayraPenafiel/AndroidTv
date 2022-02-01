package com.example.galeria.adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.galeria.R;


public class GaleriaFotosAdapter extends BaseAdapter {
    private Context mContext;
    public int[] imageArray ={
            R.drawable.zapato1,
            R.drawable.zapato2,
            R.drawable.zapato3,
            R.drawable.zapato4,
            R.drawable.zapato5,
            R.drawable.zapato6,
            R.drawable.zapato7,
            R.drawable.zapato8,
            R.drawable.zapato9,
            R.drawable.zapato10,
            R.drawable.zapato11,
            R.drawable.zapato12

    };

    public GaleriaFotosAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340 , 350));

        return imageView;
    }
}
