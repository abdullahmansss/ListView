package mans.abdullah.abdullah_mansour.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

// Adapter that extends from ArrayAdapter<>
public class ListAdapter extends ArrayAdapter<words>
{
    // object from views in List Item
    TextView name,desc;

    // constructor
    public ListAdapter(@NonNull Context context , ArrayList<words> words )
    {
        super(context, 0, words);
    }

    // get view method to initilaize List Item xml file and associate it with data that ill be displayed in it
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        // new view object
        View words_list = convertView;

        // if view == null inflate ListItem.xml
        if (words_list == null)
        {
            words_list = LayoutInflater.from(getContext()).inflate(R.layout.list_item
                    , parent
                    , false);
        }

        // new object from data class to get data from it
        words words = getItem(position);

        // initialize views that in List Item xml file
        name = (TextView) words_list.findViewById(R.id.text_name);
        desc = (TextView) words_list.findViewById(R.id.text_desc);

        // set views
        name.setText(words.getName());
        desc.setText(words.getDesc());

        // return view
        return words_list;
    }
}
