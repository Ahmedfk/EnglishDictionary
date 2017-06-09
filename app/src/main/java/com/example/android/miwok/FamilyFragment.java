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
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.colored_list, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

       final ArrayList<Word> famliyMembers = new ArrayList<Word>();
        WordAdapter wordAdapter = new WordAdapter(getActivity(), famliyMembers);
        famliyMembers.add(new Word("Father", "الأب", R.drawable.father));
        famliyMembers.add(new Word("Mother", "الأم", R.drawable.mother));
        famliyMembers.add(new Word("Son", "الابن, النجل", R.drawable.son));
        famliyMembers.add(new Word("Grandmother", "الجدة", R.drawable.grandmother));
        famliyMembers.add(new Word("Grandfather", "الجد", R.drawable.grandfather));
        famliyMembers.add(new Word("Young sister", "الاخت الصغيرة",R.drawable.daughter));
        listView.setAdapter(wordAdapter);

        return rootView;
    }

}
