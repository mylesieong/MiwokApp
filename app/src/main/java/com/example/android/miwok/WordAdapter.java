package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.os.WorkSource;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 9/11/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, List<Word> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_miwok);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getTextMiwok());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.text_english);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getTextEng());

        /**Find the ImageView in the list_item.xml layout with the ID list_item_icon */
        //ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        /** Get the image resource ID from the current AndroidFlavor object
                * and set the image to iconView
                 */
        //iconView.setImageResource(currentWord.getImageResourceId());

        /** Return the whole list item layout (containing 2 TextViews and an ImageView)
                 *   so that it can be shown in the ListView
                 */
        return listItemView;
    }


}
