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

public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of sights
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.big_ben_title), R.drawable.bigbenicon));
        places.add(new Places(getResources().getString(R.string.nelsons_column_title), R.drawable.nelsonicon));
        places.add(new Places(getResources().getString(R.string.tower_bridge_title), R.drawable.towericon));
        places.add(new Places(getResources().getString(R.string.london_zoo_title), R.drawable.londonzooicon));
        places.add(new Places(getResources().getString(R.string.madam_tussauds_title), R.drawable.madameicon));
        places.add(new Places(getResources().getString(R.string.natural_history_title), R.drawable.naturalhistoryicon));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s.
        // adapter knows how to create list items for each item in the list.
        final PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_sites);
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
                    intent.putExtra(getResources().getString(R.string.bigben_extra), getResources().getString(R.string.Big_Ben));
                } else if (position == 1) {
                    intent.putExtra(getResources().getString(R.string.nelson_extra), getResources().getString(R.string.Nelsons_Column));
                } else if (position == 2) {
                    intent.putExtra(getResources().getString(R.string.tower_extra), getResources().getString(R.string.Tower_Bridge));
                } else if (position == 3) {
                    intent.putExtra(getResources().getString(R.string.zoo_extra), getResources().getString(R.string.London_Zoo));
                } else if (position == 4) {
                    intent.putExtra(getResources().getString(R.string.madam_extra), getResources().getString(R.string.Madam_Tussauds));
                } else if (position == 5) {
                    intent.putExtra(getResources().getString(R.string.natural_extra), getResources().getString(R.string.Natural_history));
                }
                startActivity(intent);
            }
        });
        return rootView;
    }
}