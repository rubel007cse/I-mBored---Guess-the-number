package com.mrubel.imbored;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText _inp;
    Button _gue, _gup;
    TextView _show;
    int _result;
    int _guess_count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _inp = (EditText) findViewById(R.id.taking_inputs);
        _gue = (Button) findViewById(R.id.guess_button);
        _gup = (Button) findViewById(R.id.give_up);
        _show = (TextView) findViewById(R.id.showmsg);

        Random r = new Random();
        _result = r.nextInt(100-1) + 1;
     //   _show.setText("Guess the number");

        _gue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _guess_count =  _guess_count+1;
                int _user_no = Integer.parseInt(_inp.getText().toString());
                if(_result == _user_no) {
                    _show.setText("Correct!");
                } else if ( _result > _user_no ){
                    _show.setText("Go more higher! Guess no: "+_guess_count);
                } else {
                    _show.setText("Go more Lower! Guess no: "+_guess_count);
                }
            }
        });

        _gup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Random r = new Random();
                    double ey = r.nextInt(100-1) + 1;
              //  _show.setText(""+ey);
            }
        });

    }
}
