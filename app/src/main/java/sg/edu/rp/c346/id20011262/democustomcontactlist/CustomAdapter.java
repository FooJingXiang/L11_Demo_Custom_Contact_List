package sg.edu.rp.c346.id20011262.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewContryCode);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);
        ImageView ivGender = rowView.findViewById(R.id.imageViewGender);

        Contact currentItem = contactList.get(position);
        tvName.setText(currentItem.getName());
        tvCode.setText("+" + currentItem.getCountryCode());
        tvNum.setText(currentItem.getPhoneNum() + "");
        if (currentItem.getGender() == 'M') {
            ivGender.setImageResource(R.drawable.male);
        } else {
            ivGender.setImageResource(R.drawable.female);
        }

        return rowView;
    }
}
