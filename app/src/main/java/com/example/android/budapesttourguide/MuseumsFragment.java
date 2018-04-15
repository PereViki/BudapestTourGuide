package com.example.android.budapesttourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of museums.
 */
public class MuseumsFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    public static MuseumsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        MuseumsFragment fragment = new MuseumsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations;
        locations = new ArrayList<>();

        // Create a list of locations
        locations.add(new Location("Hungarian National Museum","The Hungarian National Museum collects, preserves and presents the historical relics of the Carpathian Basin and Hungary since 1802.","Múzeum krt. 14-16, Budapest 1088","10:00 - 18:00 closed on mondays","+36 (1) 338 2122",R.drawable.museum_01));
        locations.add(new Location("Hungarian National Gallery","See the masters of Hungarian fine arts offering insights into the history of Hungary, every-day life and rural landscapes through beautiful paintings.","Szent György tér 2, Budapest 1014 ","10:00 - 18:00 closed on mondays","+36 (20) 439 7325",R.drawable.museum_02));
        locations.add(new Location("House of Terror Museum","Exhibits related to the fascist and communist regimes in 20th-century Hungary and is also a memorial to the victims of these regimes.","Andrássy út 60, Budapest 1062","10:00 - 18:00 closed on mondays","+36 (1) 374 2600",R.drawable.museum_03));
        locations.add(new Location("Memento Park","An open-air museum in Budapest, Hungary, dedicated to monumental statues and sculpted plaques from Hungary's Communist period.","Balatoni road – Szabadkai street corner, Budapest 1223","from 10:00 till dusk","+36 (1) 424 7500",R.drawable.museum_04));
        locations.add(new Location("Hall of Art, Budapest","The Budapest Hall of Art or Palace of Art, (Hungarian − Műcsarnok Kunsthalle), is a contemporary art museum and a historic building located in Budapest, Hungary.","Dózsa György út 37, Budapest 1146","10:00 - 18:00 closed on mondays","+36 (1) 460 7000",R.drawable.museum_05));
        locations.add(new Location("Victor Vasarely Museum","The material forming the core collection of the museum was donated by Victor Vasarely to the Hungarian State in the early eighties.","Szentlélek tér 6, Budapest 1033","10:00 - 18:00 closed on mondays","+36 (1) 388 7551",R.drawable.museum_06));

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
