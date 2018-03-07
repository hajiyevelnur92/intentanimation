package maestech.intentanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import static maes.tech.intentanim.CustomIntent.customType;

public class MainActivity extends AppCompatActivity {

    private Spinner myspinner;
    private Button mybutton;

    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myspinner = (Spinner) findViewById(R.id.myspinner);
        mybutton = (Button) findViewById(R.id.mybutton);
        intent = new Intent(MainActivity.this,SecondActivity.class);


        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //initialize library
                startActivity(intent);

                customType(MainActivity.this,myspinner.getSelectedItem().toString());
            }
        });
    }
}
