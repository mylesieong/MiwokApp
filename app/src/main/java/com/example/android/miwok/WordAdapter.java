package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 9/11/2016.
 */

public class WordAdapter extends ArrayAdapter<String> {

    public WordAdapter(Context context, List<String> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
    }


}
