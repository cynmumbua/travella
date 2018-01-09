package ke.co.travella;

import android.content.DialogInterface;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.github.rubensousa.bottomsheetbuilder.BottomSheetBuilder;
import com.github.rubensousa.bottomsheetbuilder.BottomSheetMenuDialog;
import com.github.rubensousa.bottomsheetbuilder.adapter.BottomSheetItemClickListener;

public class AccountActivity extends MainActivity  {
    Button show;

    BottomSheetMenuDialog mBottomSheetDialog;
    boolean mShowSimpleDialog;
    AppBarLayout mAppBarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        show = (Button)findViewById(R.id.button);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onShowingsimpleDialog();
            }
        });
    }
    private void onShowingsimpleDialog(){
        if(mBottomSheetDialog !=null){
            mBottomSheetDialog.dismiss();
        }
        mShowSimpleDialog = true;
        mBottomSheetDialog = new BottomSheetBuilder(this)
                .setMode(BottomSheetBuilder.MODE_LIST)
                .setAppBarLayout(mAppBarLayout)
                .addTitleItem("My account")
                .addItem(0,"Home", R.mipmap.ic_launcher_foreground)
                .addItem(1, "My Bookings", R.drawable.ic_settings)
                .addItem(2 , "Review/feedback", R.drawable.ic_message)
                .addItem(3, "Exit", R.drawable.ic_exit)

                        .expandOnStart(true)
                        .setItemClickListener(new BottomSheetItemClickListener(){
                            @Override
                            public void onBottomSheetItemClick(MenuItem item){
                                Toast.makeText(AccountActivity.this,""+item.getTitle(),Toast.LENGTH_SHORT).show();
                                mShowSimpleDialog = false;
                            }
                        })
                        .createDialog();
                mBottomSheetDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialogInterface) {
                        mShowSimpleDialog = false;
                    }
                });
                        mBottomSheetDialog.show();


    }
}
