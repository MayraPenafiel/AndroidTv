package com.example.galeria.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.galeria.R;
import com.example.galeria.pantallaInicial;

public class GaleriaAdaptAnime extends BaseAdapter {

    private Context mcontext;
    public int[] img = {
            R.drawable.imagen1,
            R.drawable.imagen2,
            R.drawable.imagen3,
            R.drawable.imagen4,
            R.drawable.imagen5,
            R.drawable.imagen6,
            R.drawable.imagen7,
            R.drawable.imagen8,
            R.drawable.imagen9,
            R.drawable.imagen10,
            R.drawable.imagen11,
            R.drawable.imagen12,
            R.drawable.imagen13,
            R.drawable.imagen14
    };

    public GaleriaAdaptAnime(Context mcontext) {
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
