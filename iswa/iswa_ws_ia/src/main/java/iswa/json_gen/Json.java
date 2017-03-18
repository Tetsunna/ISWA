package iswa.json_gen;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by h nh on 17/03/2017.
 */
public class Json
{
    private JSONObject  JsonReq;
    private ArrayList<String> container = new ArrayList<String>();

    public void setNewReq()
    {
        JsonReq = new JSONObject();
    }

    public void addTestNumber(String num)
    {
        JsonReq.put("num_test", num);
    }

    public void addParamToReq(String rep)
    {
        container.add(rep);
    }

    public void endReq()
    {
        JsonReq.put("question_rep", container);
    }

    public JSONObject getReq()
    {
        return (JsonReq);
    }
}
