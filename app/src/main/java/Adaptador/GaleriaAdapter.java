package Adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.galeria.R;

public class GaleriaAdapter extends BaseAdapter {
    private Context acontext;
    public int[] imgAnime = {
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
            R.drawable.imagen14,
            R.drawable.imagen15

    };

    public GaleriaAdapter(Context context) {
        this.acontext = context;
    }

    @Override
    public int getCount() {
        return imgAnime.length;
    }

    @Override
    public Object getItem(int position) {
        return imgAnime[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(acontext);
        imageView.setImageResource(imgAnime[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams( 340, 350 ) );

        return imageView;
    }


}
