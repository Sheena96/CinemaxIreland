package ie.app.cinemaxireland;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Button;
import android.widget.DatePicker;



public class CinemaxIrelandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemax_ireland);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cinemax_ireland, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.menuCinema: startActivity (new Intent(this, Cinema.class));
                break;
            case R.id.menuMovies: startActivity (new Intent(this, WhatsOn.class));
                break;
            case R.id.menuBookTickets: startActivity (new Intent(this, BookTicket.class));
                break;
        }
            return super.onOptionsItemSelected(item);

    }

    public void onClick(View v) {
        startActivity(new Intent(CinemaxIrelandActivity.this, WhatsOn.class));

    }
}
