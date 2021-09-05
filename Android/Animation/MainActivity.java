import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
	ImageView logo;
	Button blink, slide, rotate, zoom;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// GFG logo
		logo = findViewById(R.id.imageView1);

		// blink button
		blink = findViewById(R.id.button1);

		// slide button
		slide = findViewById(R.id.button2);

		// rotate button
		rotate = findViewById(R.id.button3);

		// zoom button
		zoom = findViewById(R.id.button4);

		// blink button listener
		blink.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view)
			{
				// call a static function loadAnimation()
				// of the class AnimationUtils
				Animation object
					= AnimationUtils
						.loadAnimation(
							getApplicationContext(),

							// blink file is in anim folder
							R.anim.blinks);
				// call the startAnimation method
				logo.startAnimation(object);
			}
		});
		// slide button listener
		slide.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view)
			{
				// call a static function loadAnimation()
				// of the class AnimationUtils
				Animation object
					= AnimationUtils
						.loadAnimation(

							getApplicationContext(),

							// slide file is in anim folder
							R.anim.slide);

				// call the startAnimation method
				logo.startAnimation(object);
			}
		});

		// rotate button listener
		rotate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view)
			{
				// call a static function loadAnimation()
				// of the class AnimationUtils
				Animation object
					= AnimationUtils
						.loadAnimation(
							getApplicationContext(),

							// rotate file is in anim folder
							R.anim.rotate);

				// call the startAnimation method
				logo.startAnimation(object);
			}
		});

		// zoom button listener
		zoom.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view)
			{
				// call a static function loadAnimation()
				// of the class AnimationUtils
				Animation object
					= AnimationUtils
						.loadAnimation(
							getApplicationContext(),

							// zoom file is in anim folder
							R.anim.zoom);

				// call the startAnimation method
				logo.startAnimation(object);
			}
		});
	}
}
