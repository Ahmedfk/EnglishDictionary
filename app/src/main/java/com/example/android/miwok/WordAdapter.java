package com.example.android.miwok;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Al Badr on 3/2/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{


    public WordAdapter(Activity context, ArrayList<Word> words) {

        super(context,0,words);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView MikowTextView = (TextView) listItemView.findViewById(R.id.MikowTextView);
        MikowTextView.setTypeface(null, Typeface.BOLD);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        MikowTextView.setText(currentWord.getMikowTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaulatTExtView = (TextView) listItemView.findViewById(R.id.defaultTextView);
        MikowTextView.setTypeface(null, Typeface.BOLD);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaulatTExtView.setText(currentWord.getDeafaultTranslation());


        ImageView imageResource = (ImageView) listItemView.findViewById(R.id.img_resource);

        if(currentWord.hasImage()) {
            imageResource.setImageResource(currentWord.getImgResourceId());

            imageResource.setVisibility(View.VISIBLE);
        }else{
            imageResource.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon


        //ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView


       // iconView.setImageResource(currentAndroidFlavor.getImageResourceId());



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}



