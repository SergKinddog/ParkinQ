package info.parkinq.monitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import info.parkinq.pqlib.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
