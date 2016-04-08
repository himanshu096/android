package ga.himanshu.home.invidzsignin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText emailtext;
    EditText passwordtext;
    public String username;
    public String password;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailtext=(EditText)findViewById(R.id.username_input);
        passwordtext=(EditText)findViewById(R.id.password_input);
        loginbtn=(Button)findViewById(R.id.submit_button);
        loginbtn.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        username=emailtext.getText().toString();
        password=passwordtext.getText().toString();

        SignInClass signin=new SignInClass();
        signin.execute();

    }
}
