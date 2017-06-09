package com.example.android.miwok;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumbersFragment extends Fragment {
    MediaPlayer numbersMedia;

    public NumbersFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.colored_list, container, false);

       final ArrayList<Word> word= new ArrayList<Word>();
        WordAdapter arrayAdapter = new WordAdapter(getActivity(), word);

        word.add(new Word("one", "واحد", R.drawable.one));
        word.add(new Word("two", "اثنين", R.drawable.two));
        word.add(new Word("three", "ثلاثة", R.drawable.three));
        word.add(new Word("four", "اربعة", R.drawable.four));
        word.add(new Word("five", "خمسة", R.drawable.five));
        word.add(new Word("six", "ستة", R.drawable.six));
        word.add(new Word("seven", "سبعة", R.drawable.seven));
        word.add(new Word("eight", "ثمانية", R.drawable.eight));
        word.add(new Word("nine", "تسعة", R.drawable.nine));
        word.add(new Word("ten", "عشرة", R.drawable.ten));

        final ListView numbersListView = (ListView) rootView.findViewById(R.id.listView);

        numbersListView.setAdapter(arrayAdapter);


        return rootView;

    }

}
