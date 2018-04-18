package com.example.android.budapesttourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of sights.
 */
public class SightsFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    public static SightsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        SightsFragment fragment = new SightsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations;
        locations = new ArrayList<>();

        // Create a list of locations
        locations.add(new Location(getString(R.string.sights_01_name),getString(R.string.sights_01_description),getString(R.string.sights_01_address),R.drawable.sights_01));
        locations.add(new Location(getString(R.string.sights_02_name),getString(R.string.sights_02_description),getString(R.string.sights_02_address),R.drawable.sights_02));
        locations.add(new Location(getString(R.string.sights_03_name),getString(R.string.sights_03_description),getString(R.string.sights_03_address),R.drawable.sights_03));
        locations.add(new Location(getString(R.string.sights_04_name),getString(R.string.sights_04_description),getString(R.string.sights_04_address),R.drawable.sights_04));
        locations.add(new Location(getString(R.string.sights_05_name),getString(R.string.sights_05_description),getString(R.string.sights_05_address),R.drawable.sights_05));
        locations.add(new Location(getString(R.string.sights_06_name),getString(R.string.sights_06_description),getString(R.string.sights_06_address),R.drawable.sights_06));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        if (listView != null) {
            listView.setAdapter(adapter);
        }

        return rootView;
    }

}
