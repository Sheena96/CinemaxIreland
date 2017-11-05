package ie.app.cinemaxireland;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;

public class Cinema extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.cinema);
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
            case R.id.menuMovies: startActivity (new Intent(this, WhatsOn.class));
                break;
            case R.id.menuHome:
                startActivity(new Intent(this, CinemaxIrelandActivity.class));
                break;
            case R.id.menuBookTickets: startActivity (new Intent(this, BookTicket.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
