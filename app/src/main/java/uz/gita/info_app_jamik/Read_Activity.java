package uz.gita.info_app_jamik;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Read_Activity extends AppCompatActivity {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        findViewById(R.id.back).setOnClickListener(v -> finish());

        ImageSlider imageSlider = findViewById(R.id.imagess);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        Base base = Base.getInstance();
        int[][] imag = base.getResurs();

        int im = this.getIntent().getIntExtra("images", 0);

        TextView name = findViewById(R.id.nametxt);
        name.setText(base.getNames()[im]);

        for (int i = 0; i < imag[im].length; i++) {
            slideModels.add(new SlideModel(imag[im][i], ScaleTypes.FIT));
        }
        imageSlider.setImageList(slideModels);

        findViewById(R.id.read_back).setBackgroundResource(base.getColors()[im].getColor_back());
        findViewById(R.id.read_toolbar).setBackgroundResource(base.getColors()[im].getColor_tool());

        TextView textView = findViewById(R.id.txt);
        textView.setText(base.getText()[im]);

    }
}