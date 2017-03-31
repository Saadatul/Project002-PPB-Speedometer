package id.sch.smktelkom_mlg.project2.xirpl61116252632.speedometer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class InfoActivity extends Activity {

    ImageView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        info = (ImageView) findViewById(R.id.imageinfo);
    }
}
