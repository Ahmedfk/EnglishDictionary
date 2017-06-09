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
public class PhrasesFragmt extends Fragment {


    public PhrasesFragmt() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.colored_list, container, false);


        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        final ArrayList<Word> phrases = new ArrayList<Word>();
        WordAdapter wordAdapter = new WordAdapter(getActivity(), phrases);
        phrases.add(new Word("What is your name?", "اسمك ايه ياض؟"));
        phrases.add(new Word("How are you?", "عامل ايه ياض؟"));
        phrases.add(new Word("How old are you?", " عندك كام سنة ياض؟"));
        phrases.add(new Word("Where are you from?", "انت منين يا شبح ؟"));
        phrases.add(new Word("I am pretty good", "انا كويس جدا الحمدلله"));
        phrases.add(new Word("I smell a rat", "الفار بيلعب فى عبي"));
        phrases.add(new Word("let's go", "يالا بيناااا"));
        phrases.add(new Word("I am gonna kill you?", "انا هحط عليك يالا انت يالا"));

        listView.setAdapter(wordAdapter);

        return rootView;
    }

}
