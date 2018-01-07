package com.laioffer.eventreporter;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EventActivity extends AppCompatActivity {
    private Fragment mEventsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        if (mEventsFragment == null) {
            mEventsFragment = new EventsFragment();
        }
        getSupportFragmentManager().beginTransaction().
                add(R.id.relativelayout_event, mEventsFragment).commit();

    }
}
