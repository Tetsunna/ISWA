package iswa.json_gen;

import net.sf.json.JSONObject;

/**
 * Created by h nh on 17/03/2017.
 */
public interface I_Json
{
    void setNewReq();
    void addParamToReq(String num, String rep);
    JSONObject getReq();
}
