package jo.zohour_zo3bi.android_app_developer.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout categoryTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define the view pager and connect it to a custom adapter
        viewPager = findViewById(R.id.viewPager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(categoryAdapter);

        // Define the tab layout and connect it with the view pager
        categoryTabLayout = findViewById(R.id.category_tabs);
        categoryTabLayout.setupWithViewPager(viewPager);
    }//end onCreate()
}//end MainActivity

