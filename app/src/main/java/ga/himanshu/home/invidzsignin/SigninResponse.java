package ga.himanshu.home.invidzsignin;

import org.json.JSONObject;

/**
 * Created by Himanshu on 4/6/2016.
 */
public class SigninResponse {

    public String token;
    public String uname;
    public String emailad;


    public SigninResponse(JSONObject jsonObject){

        try {
            token=jsonObject.getString("token");;
            uname=jsonObject.getJSONObject("user").getString("name");
            emailad=jsonObject.getJSONObject("user").getString("email");



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
