package com.example.android.budapesttourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class FoodFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    public static FoodFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FoodFragment fragment = new FoodFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations;
        locations = new ArrayList<>();

        // Create a list of locations
        locations.add(new Location("Alabárdos Restaurant","Hungarian cuisine within medieval setting in a 400 year-old Gothic building. Great food, live classical music, candle light, fine porcelain and decor make Alabárdos a perfect place for a romantic dinner.","Országház u. 2, Budapest 1014","Mon-Fri: 19:00-23:00 Sat: 12:00-15:00 and 19:00-23:00","+36 (1) 356 0851",R.drawable.food_01));
        locations.add(new Location("Arany Kaviár","Arany Kaviár is an elegant restaurant with Russian Cuisine in Buda Castle. Beautiful decor, friendly service, fine food and drinks are what you’ll experience in this place.","Ostrom u. 19, Budapest 1015","Tue-Sun 12:00-14:30 & 18:00-22:30","+36 (1) 201 67 37",R.drawable.food_02));
        locations.add(new Location("Csalogány 26","Csalogány 26 is most often mentioned among the best-value restaurants in Budapest. The small place boasts creative cuisine with some Hungarian dishes with modern twist.","Csalogány u. 26, Budapest 1015","Tue-Sat 12:00-15:00 & 19:00-22:00","+36 (1) 201 7892",R.drawable.food_03));
        locations.add(new Location("Menza Restaurant","A retro-style place evoking the ambience of the ’80es and ’90es in Budapest. Traditional local dishes dominate the menu.","Liszt Ferenc tér 2, Budapest 1061","10:00-24:00","+36 (1) 413 1482",R.drawable.food_04));
        locations.add(new Location("Bottega Di Brontolo","You can enjoy simple but flavourful Itaian dishes in the grumpy chef’s restaurant (brontolo menas grumpy) right next to Vörösmarty tér.","Wekerle Sándor utca 5, Budapest 1051","Mon-Sun: 11.30-22.30","+36 (70) 611 4970",R.drawable.food_05));
        locations.add(new Location("Remíz Cafe & Brasserie","A fashionable dining spot among politicians and celebrities far away from the noisy city center. It is a large restaurant with at least five rooms and a spacious terrace.","Budakeszi út 5, Budapest 1021","12:00-23:00","+36 (1) 394 1896",R.drawable.food_06));
        locations.add(new Location("Zeller Bistro","You'll receive a very warm welcome at this lovely candlelit cellar where the attentive staff serve food sourced largely from the owner's family and friends in the Lake Balaton area.","Hercegprímás u. 18, Budapest 1051","Mon 18:00 - 24:00 Tue-Sun 12:00 - 24:00","+36 (30) 651 0880",R.drawable.food_07));
        locations.add(new Location("Baraka","You're ushered into the monochrome dining room, where chef André Bicalho works his magic in the half-open kitchen. Seafood features heavily, with French, Asian and Hungarian elements to the beautifully presented dishes.","Dorottya utca 6, Budaoest 1051","Mon-Sat 18:00-23.00","+36 (1) 200 0817",R.drawable.food_08));

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
