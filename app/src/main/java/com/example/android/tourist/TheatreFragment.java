package com.example.android.tourist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TheatreFragment extends Fragment {

    public TheatreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create an array list of theatres
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.queens_theatre_title), R.drawable.shaftesburyicon));
        places.add(new Places(getResources().getString(R.string.lyceum_theatre_title), R.drawable.lyceumicon));
        places.add(new Places(getResources().getString(R.string.old_vic_title), R.drawable.oldvicicon));
        places.add(new Places(getResources().getString(R.string.theatre_royal_title), R.drawable.theatreroyalicon));
        places.add(new Places(getResources().getString(R.string.prince_edward_title), R.drawable.princeicon));
        places.add(new Places(getResources().getString(R.string.gielgud_theatre_title), R.drawable.gielgudicon));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s.
        // adapter knows how to create list items for each item in the list.
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_theatre);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link place} in the list.
        listView.setAdapter(adapter);
        //set up a click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long offset) {
                // use an intent to open the detail activity
                Intent intent = new Intent(getContext(), DetailActivity1.class);
                // use an if statement and the putExtra method to add strings for each place in the array which can be used in the detail activity
                if (position == 0) {
                    intent.putExtra(getResources().getString(R.string.queens_extra), getResources().getString(R.string.Queens));
                } else if (position == 1) {
                    intent.putExtra(getResources().getString(R.string.lyceum_extra), getResources().getString(R.string.Lyceum));
                } else if (position == 2) {
                    intent.putExtra(getResources().getString(R.string.vic_extra), getResources().getString(R.string.vic));
                } else if (position == 3) {
                    intent.putExtra(getResources().getString(R.string.royal_extra), getResources().getString(R.string.royal));
                } else if (position == 4) {
                    intent.putExtra(getResources().getString(R.string.prince_extra), getResources().getString(R.string.prince));
                } else if (position == 5) {
                    intent.putExtra(getResources().getString(R.string.gielgud_extra), getResources().getString(R.string.gielgud));
                }
                startActivity(intent);
            }
        });
        return rootView;
    }
}