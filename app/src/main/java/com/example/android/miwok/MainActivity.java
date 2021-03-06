/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView colors, numbers, family, phrases;

    public void openNumbersList(View view){
        startActivity(new Intent(this, NumbersActivity.class));
    }

    public void openFamilyList(View view){
        startActivity(new Intent(this, FamilyActivity.class));
    }

    public void openColorsList(View view){
        startActivity(new Intent(this, ColorsActivity.class));
    }

    public void openPhrasesList(View view){
        startActivity(new Intent(this, PhrasesActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        colors = (TextView) findViewById(R.id.colors);
        numbers = (TextView) findViewById(R.id.numbers);
        family = (TextView) findViewById(R.id.family);
        phrases = (TextView) findViewById(R.id.phrases);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), this);

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.slidingTabs);

        tabLayout.setupWithViewPager(viewPager);




    }
}
