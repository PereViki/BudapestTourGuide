package com.example.android.budapesttourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of hotels.
 */
public class HotelsFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    public HotelsFragment() {
        // Required empty public constructor
    }

    public static HotelsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        HotelsFragment fragment = new HotelsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations;
        locations = new ArrayList<>();

        // Create a list of locations
        locations.add(new Location(getString(R.string.hotel_01_name), getString(R.string.hotel_01_description), getString(R.string.hotel_01_address), "", getString(R.string.hotel_01_phone), R.drawable.hotel_01));
        locations.add(new Location(getString(R.string.hotel_02_name), getString(R.string.hotel_02_description), getString(R.string.hotel_02_address), "", getString(R.string.hotel_02_phone), R.drawable.hotel_02));
        locations.add(new Location(getString(R.string.hotel_03_name), getString(R.string.hotel_03_description), getString(R.string.hotel_03_address), "", getString(R.string.hotel_03_phone), R.drawable.hotel_03));
        locations.add(new Location(getString(R.string.hotel_04_name), getString(R.string.hotel_04_description), getString(R.string.hotel_04_address), "", getString(R.string.hotel_04_phone), R.drawable.hotel_04));
        locations.add(new Location(getString(R.string.hotel_05_name), getString(R.string.hotel_05_description), getString(R.string.hotel_05_address), "", getString(R.string.hotel_05_phone), R.drawable.hotel_05));
        locations.add(new Location(getString(R.string.hotel_06_name), getString(R.string.hotel_06_description), getString(R.string.hotel_06_address), "", getString(R.string.hotel_06_phone), R.drawable.hotel_06));

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
