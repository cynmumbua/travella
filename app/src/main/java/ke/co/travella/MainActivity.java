package ke.co.travella;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.text_view_headline)
    TextView textViewHeadline;
    @BindView(R.id.text_view_sub_headline)
    TextView textViewSubHeadline;
    @BindView(R.id.edit_text_from)
    EditText editTextFrom;
    @BindView(R.id.edit_text_to)
    EditText editTextTo;
    @BindView(R.id.image_view_circle_from)
    ImageView imageViewCircleFrom;
    @BindView(R.id.image_view_circle_to)
    ImageView imageViewCircleTo;
    @BindView(R.id.btn_one_way)
    Button btnOneWay;
    @BindView(R.id.btn_return)
    Button btnReturn;
    @BindView(R.id.edit_text_depart_date)
    EditText editTextDepartDate;
    @BindView(R.id.edit_text_return_date)
    EditText editTextReturnDate;
    @BindView(R.id.text_view_passengers)
    TextView textViewPassengers;
    @BindView(R.id.text_view_class)
    TextView textViewClass;
    @BindView(R.id.edit_text_passenger_count)
    EditText editTextPassengerCount;
    @BindView(R.id.edit_text_class)
    EditText editTextClass;
    @BindView(R.id.checkbox)
    CheckBox checkbox;
    @BindView(R.id.rl_action_get_buses)
    RelativeLayout rlActionGetBuses;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        navView.setNavigationItemSelectedListener(this);

    }


    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @OnClick(R.id.rl_action_get_buses)
    public void getBuses(View view){
        Intent intent = new Intent(this, BusesActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_login) {
            // Handle the camera action
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            return true;

        } else if (id == R.id.nav_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


}
