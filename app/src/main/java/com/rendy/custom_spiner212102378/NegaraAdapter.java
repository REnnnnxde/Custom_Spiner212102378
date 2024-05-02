package com.rendy.custom_spiner212102378;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NegaraAdapter extends BaseAdapter {
    private Context _context;
    private List<String> _negaraList;

    public NegaraAdapter(Context _context, List<String> _negaraList) {
        this._context = _context;
        this._negaraList = _negaraList;
    }

    @Override
    public int getCount() {
        return _negaraList != null ? _negaraList.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return _negaraList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i; // You can use the position as the ID
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(_context);
        view = inflater.inflate(R.layout.spinner_a, viewGroup, false);

        TextView textView1 = view.findViewById(R.id.textView1);
        String negara = _negaraList.get(i);
        textView1.setText(negara);

        ImageView imageView1 = view.findViewById(R.id.image1);

        switch (negara.toLowerCase()) { // Make sure to use lowercase to match cases
            case "albania":
                imageView1.setImageResource(R.drawable.albania);
                break;
            case "belgia":
                imageView1.setImageResource(R.drawable.belgia);
                break;
            case "hungary":
                imageView1.setImageResource(R.drawable.hungary);
                break;
            case "iran":
                imageView1.setImageResource(R.drawable.iran);
                break;
            case "slovenia":
                imageView1.setImageResource(R.drawable.slovenia);
                break;
            case "Indonesia ":
                imageView1.setImageResource(R.drawable.indonesia);
                break;
        }

        return view;
    }
}
