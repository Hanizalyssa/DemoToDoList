package sg.edu.rp.c346.id20007201.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.id20007201.demotodolist.R;
import sg.edu.rp.c346.id20007201.demotodolist.ToDoItem;


public class CustomAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> toDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super (context, resource, objects);
        parent_context = context;
        layout_id = resource;
        toDoList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        tvTitle.setText(toDoList.get(position).getTitle());
        tvDate.setText((CharSequence) toDoList.get(position).getDate());

        return rowView;
    }

}
