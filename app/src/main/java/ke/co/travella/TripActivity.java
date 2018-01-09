package ke.co.travella;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TripActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.text_view_from)
    TextView textViewFrom;
    @BindView(R.id.text_view_to)
    TextView textViewTo;
    @BindView(R.id.text_view_from_stage)
    TextView textViewFromStage;
    @BindView(R.id.text_view_to_stage)
    TextView textViewToStage;
    @BindView(R.id.view_separator)
    View viewSeparator;
    @BindView(R.id.text_view_bus_co)
    TextView textViewBusCo;
    @BindView(R.id.text_view_price)
    TextView textViewPrice;
    @BindView(R.id.text_view_depature)
    TextView textViewDepature;
    @BindView(R.id.rl_action_book_now)
    RelativeLayout rlActionBookNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @OnClick({
            R.id.image_button_1,
            R.id.image_button_2,
            R.id.image_button_3,
            R.id.image_button_4,
            R.id.image_button_5,
            R.id.image_button_6,
            R.id.image_button_7,
            R.id.image_button_8,
            R.id.image_button_9,
            R.id.image_button_10,
            R.id.image_button_11,
            R.id.image_button_12,
            R.id.image_button_13,
            R.id.image_button_14,
            R.id.image_button_15,
            R.id.image_button_16,
            R.id.image_button_17,
            R.id.image_button_18,
            R.id.image_button_19,
            R.id.image_button_20,
            R.id.image_button_21,
            R.id.image_button_22,
            R.id.image_button_23,
            R.id.image_button_24,
            R.id.image_button_25,

    })
    void chooseSeat(ImageButton imageButton){
        imageButton.setImageResource(R.drawable.booking_seat);
    }
    @OnClick(R.id.rl_action_book_now)
    public void bookNow(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
