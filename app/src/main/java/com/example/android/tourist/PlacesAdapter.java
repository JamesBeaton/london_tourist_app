package com.example.android.tourist;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {

    private int mColourResourceId;
    /**
     * added a colour id that the constructor can use
     */
    /**
     * @param context The current context. Used to inflate the layout file.
     * @param places  A List of place objects to display in a list
     */
    /* the constructer below named PlacesAdapter needs to match the class name */
    public PlacesAdapter(Activity context, ArrayList<Places> places, int colourResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the array list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for one TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places); /* we pass 0 here as the layout resource id as were inflating the layout ourselves in
         the getView method */
        mColourResourceId = colourResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        ViewHolder viewHolder;


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Places currentPlace = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_number

        viewHolder.defaultTextView.setText(currentPlace.getmPlaceId());

        if (currentPlace.hasImage()) {
            viewHolder.londonImageView.setImageResource(currentPlace.getmImageResourceId());
            viewHolder.londonImageView.setVisibility(View.VISIBLE);
        }
        /* make sure the visibility is set to gone */
        else {
            viewHolder.londonImageView.setVisibility(View.GONE);
        }
        Log.v("getView", "expensive");

        // find the colour that the resource ID maps to
        int colour = ContextCompat.getColor(getContext(), mColourResourceId);

        // set the background colour of the text container view
        viewHolder.colorResource.setBackgroundColor(colour);

        // Return the whole list item layout (containing a TextView and an ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }
     class ViewHolder {
        private TextView defaultTextView;
        private ImageView londonImageView;
        private LinearLayout colorResource;

        public ViewHolder (View view) {
            this.defaultTextView = (TextView) view.findViewById(R.id.default_text_view);
            this.londonImageView = (ImageView)view.findViewById(R.id.london_image_view);
            this.colorResource = (LinearLayout)view.findViewById(R.id.text_container);
        }
     }

}