package com.example.galeria.adaptadores;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.galeria.R;

public class GaleriaImagenesAdapter  extends BaseAdapter {
    private Context mcontext;
    public int[] imgz = {
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


    public GaleriaImagenesAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return imgz.length;
    }

    @Override
    public Object getItem(int i) {
        return imgz[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView image = new ImageView(mcontext);
        image.setImageResource(imgz[i]);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setLayoutParams(new AbsListView.LayoutParams(340, 350));
        return image;
    }
}
