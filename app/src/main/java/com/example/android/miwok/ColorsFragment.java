package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.colored_list, container, false);

        ListView listView = (ListView)rootView.findViewById(R.id.listView);
       final ArrayList<Word> colors = new ArrayList<Word>();
        WordAdapter wordAdapter = new WordAdapter(getActivity(),colors);

        colors.add(new Word("Red", "احمر",R.drawable.color_red));
        colors.add(new Word("Green","اخضر",R.drawable.color_green));
        colors.add(new Word("Brown", "بني",R.drawable.color_brown));
        colors.add(new Word("Yellow", "اصفر",R.drawable.color_dusty_yellow));
        colors.add(new Word("black", "اسود",R.drawable.color_black));
        colors.add(new Word("White", "ابيض",R.drawable.color_white));
        colors.add(new Word("gray", "رصاصي",R.drawable.color_gray));

        listView.setAdapter(wordAdapter);

        return rootView;


    }

}