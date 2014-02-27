package co.sdslabs.mdg.justsay;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CreateBlog extends Activity implements OnClickListener {

	EditText etTitle,etDesp,etTag;
	Button bSubmit;
	String _Title,_Desp,_Tag,url;
	
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
InternetData obj=new InternetData();
		_Title=etTitle.getText().toString();
		_Desp=etDesp.getText().toString();
		_Tag=etTag.getText().toString();
		url="http://bloggy.comeze.com/create_blogposts_backend.php";
		
		ArrayList<NameValuePair> nameValuePair = new ArrayList<NameValuePair>();
		   nameValuePair.add(new BasicNameValuePair("title",_Title));
		   nameValuePair.add(new BasicNameValuePair("description",_Desp));
		   nameValuePair.add(new BasicNameValuePair("tags",_Tag));
		   obj.postData(url, nameValuePair);
	}
	

}
