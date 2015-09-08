package com.example.hello_c_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView _tV;
	private Button _button;
	public EditText _eT;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this._tV = (TextView) this.findViewById(R.id.textView2);
		_eT = (EditText) findViewById(R.id.editText1);

		this._button = (Button) this.findViewById(R.id.button1);
		this._button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				String txt = _eT.getText().toString();

				Toast toast = Toast.makeText(v.getContext(), txt, Toast.LENGTH_LONG);
				toast.show();

				setText(txt);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void setText(String text) {
		String ndkMessage = NDKMethods.set_msg(text);
		
		this._tV.setText(ndkMessage);
	}
}
