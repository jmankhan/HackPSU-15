package jalal.com.hackpsu.dataobjects;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import jalal.com.hackpsu.R;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button signInButton;
    private TextView userView, passView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userView = (TextView) findViewById(R.id.userView);
        passView = (TextView) findViewById(R.id.passView);
        signInButton = (Button) findViewById(R.id.sign_in_button);
        signInButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(signInButton)) {

            CharSequence user = userView.getText();
            CharSequence pass = passView.getText();

            if(isValidCredentials(user.toString(), pass.toString())) {
                Intent login = new Intent(MainActivity.this, LandingPageActivity.class);
                startActivity(login);
            }
            Toast.makeText(MainActivity.this, "HELLO", Toast.LENGTH_SHORT).show();
        }

        else if(v.equals(userView))
            userView.setHint("");
        else if(v.equals(passView))
            passView.setHint("");
    }

    public boolean isValidCredentials(String user, String pass) {
        if(user.equals("a") && pass.equals("a")) {
            return true;
        }
        return false;
    }
}
