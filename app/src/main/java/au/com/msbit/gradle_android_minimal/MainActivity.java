package au.com.msbit.gradle_android_minimal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static android.view.Gravity.CENTER;
import static android.widget.TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM;

public class MainActivity extends Activity {
  int _count = 0;

  @Override
  protected void onCreate(Bundle saved) {
    super.onCreate(saved);

    var view = new TextView(this);

    view.setAutoSizeTextTypeWithDefaults(AUTO_SIZE_TEXT_TYPE_UNIFORM);
    view.setGravity(CENTER);
    view.setOnClickListener(v -> ((TextView)v).setText(count()));
    view.setText(count());

    setContentView(view);
  }

  String count() {
    return String.valueOf(_count++);
  }
}
