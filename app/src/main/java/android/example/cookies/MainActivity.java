package android.example.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity.java", "onCreate: Dang it I'm almost full");
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        imageView = findViewById(R.id.android_cookie_image_view);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        textView = findViewById(R.id.status_text_view);
        // change the visuals now
        imageView.setImageResource(R.drawable.after_cookie);
        textView.setText("I'm so full.");

    }
}
