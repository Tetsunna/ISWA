package iswa.json_gen;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by h nh on 17/03/2017.
 */
public class Json implements I_Json
{
    private JSONObject JsonReq;

    @Override
    public void setNewReq()
    {
        JSONObject new_req  = new JSONObject();

        JsonReq = new_req;
    }

    @Override
    public void addParamToReq(String num, String rep)
    {
        JsonReq.put("num_question", num);
        JsonReq.put("reponse", rep);
    }

    @Override
    public JSONObject getReq()
    {
        return (JsonReq);
    }
}
