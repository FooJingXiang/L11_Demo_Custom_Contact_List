package sg.edu.rp.c346.id20011262.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.Lv);

        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary",65,1234567,'F');
        Contact item2 = new Contact("John",65,7654321,'M');
        alContactList.add(item1);
        alContactList.add(item2);

        caContact = new CustomAdapter(MainActivity.this,R.layout.row,alContactList);
        lvContact.setAdapter(caContact);
    }
}