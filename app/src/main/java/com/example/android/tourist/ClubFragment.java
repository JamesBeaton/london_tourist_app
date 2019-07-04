package com.example.android.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ClubFragment extends Fragment {
    private static final String TAG = "ClubFragment";

    public ClubFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create an array list of clubs
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.piccadilly), R.drawable.piccadilly_institute));
        places.add(new Places(getResources().getString(R.string.cafe), R.drawable.cafe_de_paris));
        places.add(new Places(getResources().getString(R.string.bar_rumba), R.drawable.bar_rumba));
        places.add(new Places(getResources().getString(R.string.cirque_du_soleil), R.drawable.cirqueicon));
        places.add(new Places(getResources().getString(R.string.hippodrome), R.drawable.hippodromeicon));
        places.add(new Places(getResources().getString(R.string.zoobar), R.drawable.zoo_bar));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s.
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_club);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link place} in the list.
        listView.setAdapter(adapter);
        //set up a click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long offset) {
                // use an intent to open the detail activity
                Intent intent = new Intent(getContext(), DetailActivity1.class);
                // use an switch statement and the putExtra method to add strings for each place in the array which can be used in the detail activity
                switch (position) {
                    case 1: intent.putExtra(getString(R.string.cafe_extra), getResources().getString(R.string.cafe_de_paris));
                        break;
                    case 2: intent.putExtra(getString(R.string.rumba_extra), getResources().getString(R.string.rumba));
                        break;
                    case 3: intent.putExtra(getString(R.string.cirque_extra), getResources().getString(R.string.cirque));
                        break;
                    case 4: intent.putExtra(getString(R.string.hippodrome_extra), getResources().getString(R.string.hippodrome_info));
                        break;
                    case 5: intent.putExtra(getString(R.string.zoobar_extra), getResources().getString(R.string.zoo_bar));
                        break;
                    default: intent.putExtra(getString(R.string.piccadilly_extra), getResources().getString(R.string.institute));
                        Log.i(TAG,"piccadilly");
                        break;
                }
                startActivity(intent);
            }
        });
        return rootView;
    }
}