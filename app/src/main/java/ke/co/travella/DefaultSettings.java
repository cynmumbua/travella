package ke.co.travella;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.app.ActionBarDrawerToggle;

import butterknife.ButterKnife;

/**
 * Created by HP on 1/8/2018.
 */
/**
public class DefaultSettings extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        Fragment fragment = new Settings();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        if (savedInstanceState == null) {
            //created for the first time
            fragmentTransaction.add(R.id.drawer_layout, fragment, "settings_fragment");
            fragmentTransaction.commit();
        } else {
            fragment = getFragmentManager().findFragmentByTag("settings_fragment");
        }
    }

    public static class Settings extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState){
            super .onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings);
        }
    }

}
*/