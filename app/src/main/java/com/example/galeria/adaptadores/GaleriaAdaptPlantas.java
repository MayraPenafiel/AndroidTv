package com.example.galeria.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.galeria.R;

public class GaleriaAdaptPlantas extends BaseAdapter {
    private Context mcontext;
    public int[] img = {
            R.drawable.r
    };

    public GaleriaAdaptPlantas(Context mcontext) {
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
