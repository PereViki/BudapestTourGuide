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

    public static HotelsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        HotelsFragment fragment = new HotelsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations;
        locations = new ArrayList<>();

        // Create a list of locations
        locations.add(new Location("Aquaworld Resort Budapest","4-star superior hotel and Aqua Park located in Budapest, 11 km from Heroes' Square and 15 km from the Budapest Zoo and Botanical Garden.","Íves út 16, Budapest 1044","","+36 (1) 231 3600",R.drawable.hotel_01));
        locations.add(new Location("The Aquincum Hotel Budapest","Overlooking the Danube River, this refined, contemporary spa hotel is a 4-minute walk from the Szentlélek tér subway station and 8 km from Buda Castle. ","Árpád fejedelem útja 94, Budapest 1036","","+36 (1) 436 4100",R.drawable.hotel_02));
        locations.add(new Location("Danubius Hotel Helia","Overlooking the Danube river, this upscale hotel is a 10-minute walk from a metro station and 2 km from the Hungarian Parliament Building. ","Kárpát u. 62-64, Budapest 1133","","+36 (1) 889 5800",R.drawable.hotel_03));
        locations.add(new Location("Queen's Court Hotel & Residence","Set in Budapest's city center, this upscale all-suites hotel in a simple building with red brick accents is 300 m from a tram stop and 1 km from neo-Renaissance Magyar Állami Operaház.","Dob u. 63, Budapest 1074","","+36 (1) 882 3000",R.drawable.hotel_04));
        locations.add(new Location("ARCadia Hotel Budapest","Situated directly in the neighborhood of the Synagogue and the Deák Ferenc square, within 2 minutes’ walk from the Andrassy Avenue and the Basilica; 5 minutes’ walk from the Váci pedestrian street and the Danube Promenade.","Madách Imre út 3, Budapest 1075","","+36 (1) 796 2070",R.drawable.hotel_05));
        locations.add(new Location("Corinthia Hotel Budapest","In a landmark 1896 building, this palatial hotel is a 5-minute walk from a metro station, an 8-minute walk from the shops of Andrássy Avenue and 2 km from the Chain Bridge. ","Erzsébet krt. 43-49, Budapest 1073","","+36 (1) 479 4000",R.drawable.hotel_06));

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
