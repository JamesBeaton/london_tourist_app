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

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create an array list of restaurants
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.belgo_title), R.drawable.belgoicon));
        places.add(new Places(getResources().getString(R.string.bubba_gumps), R.drawable.bubba_gumps));
        places.add(new Places(getResources().getString(R.string.thai_square), R.drawable.thaisquareicon));
        places.add(new Places(getResources().getString(R.string.tgi_fridays), R.drawable.tgiicon));
        places.add(new Places(getResources().getString(R.string.shake_shack), R.drawable.shakeshackicon));
        places.add(new Places(getResources().getString(R.string.five_guys), R.drawable.fiveguysicon));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s.
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_food);
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
                // use an if statement and the putExtra method to add strings for each place in the array which can be used in the detail activity
                if (position == 0) {
                    intent.putExtra(getResources().getString(R.string.belgo_extra), getResources().getString(R.string.belgo_info));
                } else if (position == 1) {
                    intent.putExtra(getResources().getString(R.string.bubba_extra), getResources().getString(R.string.bubba));
                } else if (position == 2) {
                    intent.putExtra(getResources().getString(R.string.thai_extra), getResources().getString(R.string.thai));
                } else if (position == 3) {
                    intent.putExtra(getResources().getString(R.string.tgi_extra), getResources().getString(R.string.tgi));
                } else if (position == 4) {
                    intent.putExtra(getResources().getString(R.string.shake_extra), getResources().getString(R.string.shake));
                } else if (position == 5) {
                    intent.putExtra(getResources().getString(R.string.five_extra), getResources().getString(R.string.five));
                }
                startActivity(intent);
            }
        });
        return rootView;
    }
}