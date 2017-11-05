package ie.app.cinemaxireland;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.NumberPicker;
import android.app.DatePickerDialog;
import android.widget.DatePicker;

/**
 * Created by sheenakelly on 05/11/2017.
 */

public class BookTicket extends AppCompatActivity {

    private Button          bookTicketButton;
    private RadioGroup      paymentMethod;
    private NumberPicker    amountPicker;
    private DatePicker      selectDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_ticket);

        bookTicketButton = (Button) findViewById(R.id.bookTicketButton);

        if (bookTicketButton != null)
        {
            Log.v("Book", "Really got the book button");
        }

        paymentMethod = (RadioGroup)   findViewById(R.id.paymentMethod);
        amountPicker  = (NumberPicker) findViewById(R.id.amountPicker);
        selectDate    = (DatePicker)   findViewById(R.id.selectDate);

        amountPicker.setMinValue(1);
        amountPicker.setMaxValue(6);

        selectDate.setMinDate(11/01/2017);
        selectDate.setMaxDate(12/31/2017);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cinemax_ireland, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menuCinema: startActivity (new Intent(this, Cinema.class));
                break;
            case R.id.menuMovies: startActivity (new Intent(this, WhatsOn.class));
                break;
            case R.id.menuHome:
                startActivity(new Intent(this, CinemaxIrelandActivity.class));
                break;
            case R.id.menuOverview: startActivity (new Intent(this, Overview.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void bookTicketButtonPressed (View view)
    {
        int amount = amountPicker.getValue();
        int month = selectDate.getMonth();
        int day = selectDate.getDayOfMonth();
        int year = selectDate.getYear();
        int radioId = paymentMethod.getCheckedRadioButtonId();
        String method = radioId == R.id.PayPal ? "PayPal" : "Direct";
        Log.v("Book", "Book pressed with "+ amount + " tickets booked, payment method: " + method + " Date: "
                + month + day + year);
    }






}






