package mans.abdullah.abdullah_mansour.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    // ListView object
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // new ArrayList<> with type of my new class of data
        ArrayList<words> list = new ArrayList<>();

        // store fixed data in ArrayList
        list.add(new words("Abdullah","heloo my name is Abdullah Mansour"));
        list.add(new words("Osama","heloo my name is Osama Mansour"));
        list.add(new words("Ali","heloo my name is Ali Mansour"));
        list.add(new words("Omar","heloo my name is Omar Mansour"));

        // create new object from Adapter
        ListAdapter listAdapter = new ListAdapter(getApplicationContext(),list);

        // initialize ListView
        listView = (ListView) findViewById(R.id.list_view);

        // add Adpater to ListView
        listView.setAdapter(listAdapter);
    }
}
