package ga.himanshu.home.invidzsignin;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Himanshu on 4/6/2016.
 */
public class  SignInClass extends AsyncTask<Void, Void, SigninResponse> {
    private final String API_URL="http://api.invidz.org/auth/login";
    int i;




    @Override
    protected SigninResponse doInBackground(Void... params)
    {



        try {
            String urlString = API_URL + "?email=101.prashant@gmail.com&password=rajneesh";
            URL url = new URL(urlString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            i=0;
            InputStream stream = connection.getInputStream();
            i = 1;

            BufferedReader r = new BufferedReader(new InputStreamReader(stream));
            String totalResponse = "";
            String line;
            i = 2;


            while ((line = r.readLine()) != null) {
                totalResponse += line;
            }

            Log.d("codekamp", totalResponse);

            JSONObject response = new JSONObject(totalResponse);
            i = 3;

            JSONArray lists = response.getJSONArray("data");


        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;

    }

    @Override
    protected void onPostExecute(SigninResponse signinResponse) {
        super.onPostExecute(signinResponse);
        if(signinResponse == null){
            Log.d("codekamp", Integer.toString(i));
        }
    }
}
