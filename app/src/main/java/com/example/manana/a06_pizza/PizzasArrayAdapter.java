package com.example.manana.a06_pizza;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by manana on 26/5/16.
 */
public class PizzasArrayAdapter extends BaseAdapter
{
    private List<Pizza>data;


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View oldView, ViewGroup parent) {










        return null;


    }
}
