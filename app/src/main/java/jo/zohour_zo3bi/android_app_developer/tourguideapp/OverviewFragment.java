package jo.zohour_zo3bi.android_app_developer.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class OverviewFragment extends Fragment {

    private ImageView overview_image_view;
    private TextView overview_text_view;

    public OverviewFragment() {
        // Required empty public constructor
    }//end constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.overview_layout, container, false);

        // Define the overview fragment image view and fill it with a specified image
        overview_image_view = rootView.findViewById(R.id.overview_image_view);
        overview_image_view.setImageResource(R.drawable.welcometoaqaba);

        // Define the overview fragment text view and fill it with a specified overview text
        overview_text_view = rootView.findViewById(R.id.overview_text_view);
        overview_text_view.setText(R.string.overview_text_view);

        return rootView;
    }//end onCreateView()
}//end OverviewFragment
