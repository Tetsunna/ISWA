package iswa.ws.ia.source.code;

import com.fasterxml.jackson.databind.ObjectMapper;
import iswa.json_gen.Json;
import net.sf.json.JSONObject;
import sun.rmi.runtime.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by h nh on 17/03/2017.
 */
public class IA
{
    List<Eleve> Eleves = new ArrayList<Eleve>();

    Eleve getFicheEleve(String pseudo)
    {
        int _index = -1;

        for (int i = 0; i != Eleves.size(); i++)
        {
            if (Eleves.get(i).getName() == pseudo)
                _index = i;
        }

        if (_index == -1)
        {
            Eleve e = new Eleve(pseudo);
            int tmp = Eleves.size();
            Eleves.add(tmp, e);
            _index = tmp;
        }
        return (Eleves.get(_index));
    }

    void setFicheEleve(String pseudo, String result_test)
    {
        Eleve add_result = getFicheEleve(pseudo);

        System.out.println(add_result.getName());
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            Test_classes obj = mapper.readValue(result_test, Test_classes.class);
            System.out.print(obj.question_rep.get(1));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    void addNewEleve(Eleve new_eleve)
    {
        Eleves.add(new_eleve);
    }

    /*public static void main (String[] args)
    {
        Json test = new Json();
        IA bjr = new IA();
        test.setNewReq();
        test.addParamToReq("b");
        test.addParamToReq("c");
        test.addParamToReq("d");
        test.endReq();

        bjr.setFicheEleve("romain", test.getReq().toString());
    }*/
}
