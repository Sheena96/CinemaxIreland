package ie.app.cinemaxireland;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ie.app.cinemaxireland.R;


public class Overview extends AppCompatActivity {

    ListView listView;

    static final String[] numbers = new String[] {
            "Amount, Pay method",
            "2,     Direct",
            "4,    PayPal",
            "1,   Direct",
            "3,     PayPal",
            "2,   PayPal"};

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_ticket);

        listView = (ListView) findViewById(R.id.overviewList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,  android.R.layout.simple_list_item_1, numbers);
        listView.setAdapter(adapter);
    }
}
