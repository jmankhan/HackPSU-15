package jalal.com.hackpsu.dataobjects;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

/**
 * Created by Jalal on 3/28/2015.
 */
public class LandingPageActivity extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "NEW ACTIVITY STARTED", Toast.LENGTH_SHORT).show();
    }
}
