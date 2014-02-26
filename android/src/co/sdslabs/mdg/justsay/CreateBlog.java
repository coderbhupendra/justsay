package co.sdslabs.mdg.justsay;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CreateBlog extends Activity implements OnClickListener {

	EditText etTitle,etDesp,etTag;
	Button bSubmit;
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		etTitle=(EditText)findViewById(R.id.editText1);
		etDesp=(EditText)findViewById(R.id.editText2);
		etTag=(EditText)findViewById(R.id.editText3);
		bSubmit=(Button)findViewById(R.id.button1);
		bSubmit.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
