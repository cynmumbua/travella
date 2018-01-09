package ke.co.travella;





import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.craftman.cardform.Card;
        import com.craftman.cardform.CardForm;
        import com.craftman.cardform.OnPayBtnClickListner;


public class PaymentPayPal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_pay_pal);

        CardForm cardFrom = (CardForm) findViewById(R.id.cardform);
        TextView txtDes = (TextView) findViewById(R.id.payment_amount);
        Button btnPay = (Button) findViewById(R.id.btn_pay);

        txtDes.setText("$1999");
        btnPay.setText(String.format("payer %s", txtDes.getText()));

        cardFrom.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {
                Toast.makeText(PaymentPayPal.this, "Name : " + card.getName() + "|Last 4 digits :" + card.getLast4(), Toast.LENGTH_SHORT).show();
            }

        });
    }
}


