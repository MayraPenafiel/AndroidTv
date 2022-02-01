package com.example.galeria.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.galeria.R;

public class GaleriaImgAdanimales  extends BaseAdapter {
    private Context mcontext;
    public int[] img = {
            R.drawable.animales___portada,
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img8
    };

    public GaleriaImgAdanimales(Context mcontext) {
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int i) {
        return img[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView image = new ImageView(mcontext);
        image.setImageResource(img[i]);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setLayoutParams(new AbsListView.LayoutParams(340, 350));
        return image;
    }
}
