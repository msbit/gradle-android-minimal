package au.com.msbit.gradle_android_minimal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static android.view.Gravity.CENTER;
import static android.widget.TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM;

public class MainActivity extends Activity {
  int _count = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    if (savedInstanceState != null) {
      int savedCount = savedInstanceState.getInt("count", -1);
      if (savedCount != -1) {
        _count = savedCount;
      }
    }

    var view = new TextView(this);

    view.setAutoSizeTextTypeWithDefaults(AUTO_SIZE_TEXT_TYPE_UNIFORM);
    view.setGravity(CENTER);
    view.setOnClickListener(v -> ((TextView)v).setText(count()));
    view.setText(count());

    setContentView(view);
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    outState.putInt("count", _count);
  }

  String count() {
    return String.valueOf(_count++);
  }
}
