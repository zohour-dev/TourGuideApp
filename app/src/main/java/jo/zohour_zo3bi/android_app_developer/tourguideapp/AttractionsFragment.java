package jo.zohour_zo3bi.android_app_developer.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    private ArrayList<Item> attractions = new ArrayList<>();

    public AttractionsFragment() {
        // Required empty public constructor
    }//end constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        // Create the list of attractions
        createAttractionsList();

        // Define a recycler view and set a linear layout manager for it with a divider between its items
        RecyclerView attractionsRecyclerView = rootView.findViewById(R.id.category_content_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        attractionsRecyclerView.setLayoutManager(manager);
        attractionsRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        // Create a custom adapter for binding the created recycler view
        // with items taken from the created list of attractions
        ItemAdapter attractionsAdapter = new ItemAdapter(getActivity(), attractions);
        attractionsRecyclerView.setAdapter(attractionsAdapter);

        return rootView;
    }//end onCreateView()

    /**
     * Create an array list of the attractions
     *
     */
    private void createAttractionsList() {

        // adding items to the list
        attractions.add(new Item(R.drawable.sharif_hussein_bin_ali,
                getString(R.string.sherif_mosque_name),
                getString(R.string.sherif_mosque_description),
                getString(R.string.sherif_mosque_location)));

        attractions.add(new Item(R.drawable.aqaba_castle,
                getString(R.string.aqaba_castle_name),
                getString(R.string.aqaba_castle_description),
                getString(R.string.aqaba_castle_location)));

        attractions.add(new Item(R.drawable.aqaba_archaeological,
                getString(R.string.aqaba_arch_muesum_name),
                getString(R.string.aqaba_arch_muesum_description),
                getString(R.string.aqaba_arch_muesum_location)));

        attractions.add(new Item(R.drawable.aqaba_bird_opservatory,
                getString(R.string.aqaba_bird_observatory_name),
                getString(R.string.aqaba_bird_observatory_description),
                getString(R.string.aqaba_bird_observatory_location)));

        attractions.add(new Item(R.drawable.berenice_beach_club,
                getString(R.string.berenice_beach_club_name),
                getString(R.string.berenice_beach_club_description),
                getString(R.string.berenice_beach_club_location)));

        attractions.add(new Item(R.drawable.b12_beach_club,
                getString(R.string.b12_beach_name),
                getString(R.string.b12_beach_description),
                getString(R.string.b12_beach_location)));
    }//end createAttractionsList()
}//end AttractionsFragment class
