package com.hfad.workout;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    public static final String WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WorkoutDetailFragment workoutDetailFragment = (WorkoutDetailFragment)
                getFragmentManager().findFragmentById(R.id.frag_detail);
        workoutDetailFragment.setWorkoutId((int) (getIntent().getLongExtra(WORKOUT_ID, 0)));
    }
}
