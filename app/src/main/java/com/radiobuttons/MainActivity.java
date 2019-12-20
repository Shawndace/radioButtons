package com.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup rdoGroup;
    private static RadioButton rdoButton;
    private static Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
    }

    public void onClickListenerButton(){

        rdoGroup = (RadioGroup)findViewById(R.id.rg_animals);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected_id = rdoGroup.getCheckedRadioButtonId();
                rdoButton = (RadioButton)findViewById(selected_id);
                Toast.makeText(MainActivity.this,rdoButton.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
