package com.example.android.budapesttourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param locations   A List of Location objects to display in a list
     */

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, locations);

    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        final Location currentLocation = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image id from the current Location object and
        // set this image on the image imageView
        locationImageView.setImageResource(currentLocation.getLocationImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID location_description_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name_text_view);
        // Get the name from the current Location object and
        // set this text on the name TextView
        nameTextView.setText(currentLocation.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID location_name_text_view
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.location_description_text_view);
        // Get the description from the current Location object and
        // set this text on the description TextView
        descriptionTextView.setText(currentLocation.getLocationDescription());

        // Find the TextView in the list_item.xml layout with the ID opening_hours_text_view
        TextView openingHoursTextView = (TextView) listItemView.findViewById(R.id.opening_hours_text_view);

        if (currentLocation.hasOpening()) {

            // Get the opening hours from the current Location object and
            // set this text on the opening hours TextView
            openingHoursTextView.setText(currentLocation.getLocationOpeningHours());

            // Make sure the view is visible
            openingHoursTextView.setVisibility(View.VISIBLE);

        } else {
            openingHoursTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID address_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the description from the current Location object and
        // set this text on the address TextView
        addressTextView.setText(currentLocation.getLocationAddress());

        // Find the TextView in the list_item.xml layout with the ID phone_text_view
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);

        if (currentLocation.hasPhone()) {

            // Get the description from the current Location object and
            // set this text on the phone TextView
            phoneTextView.setText(currentLocation.getLocationPhone());

            // Make sure the view is visible
            phoneTextView.setVisibility(View.VISIBLE);

        } else {
            phoneTextView.setVisibility(View.GONE);
        }

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }

}
