package uz.gita.info_app_jamik;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private LinearLayout linear;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Base base = Base.getInstance();
        int[][] imagess = base.getResurs();
        String[] names = base.getNames();


        linear = findViewById(R.id.viewGr);
        LayoutInflater inflater = LayoutInflater.from(this);

        for (int i = 0; i < imagess.length; i++) {

            View view = inflater.inflate(R.layout.views, linear, false);
            view.<ImageView>findViewById(R.id.image).setImageResource(imagess[i][0]);
            view.<TextView>findViewById(R.id.main_name).setText(names[i]);

            int finalI = i;
            view.setOnClickListener(v -> {
                Intent intent = new Intent(this, Read_Activity.class);
                intent.putExtra("images", finalI);
                intent.putExtra("text", base.getText()[finalI]);
                startActivity(intent);
            });

            linear.addView(view);
        }

    }
}