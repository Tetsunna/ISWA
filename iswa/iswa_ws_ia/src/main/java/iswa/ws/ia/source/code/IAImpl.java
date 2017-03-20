package iswa.ws.ia.source.code;

import com.fasterxml.jackson.databind.ObjectMapper;
import iswa.json_gen.Json;
import net.sf.json.JSONObject;
import sun.rmi.runtime.Log;

import javax.jws.WebService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by h nh on 17/03/2017.
 */
@WebService(endpointInterface="iswa.ws.ia.source.code.I_IA", serviceName="imatest", portName="imatestport")
public class IAImpl implements I_IA
{
    List<Eleve> Eleves = new ArrayList<Eleve>();
    Test_classes Usr_to_test;

    public int getFicheEleve(String pseudo)
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
        return (_index);
    }

    public void setFicheEleve(String pseudo, String result_test)
    {
        int index_usr = getFicheEleve(pseudo);

        System.out.println(Eleves.get(index_usr).getName());
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            Usr_to_test = mapper.readValue(new File("G:\\ISWA\\ISWA\\iswa\\iswa_ws_ia\\src\\main\\java\\iswa\\questionnaire_test.json"), Test_classes.class);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void addNewEleve(Eleve new_eleve)
    {
        Eleves.add(new_eleve);
    }

    public int getEleveDifficulty(String pseudo)
    {
        int index_usr = getFicheEleve(pseudo);

        ObjectMapper mapper = new ObjectMapper();
        try
        {
            int failed = 0;

            Test_classes obj = mapper.readValue(new File("G:\\ISWA\\ISWA\\iswa\\iswa_ws_ia\\src\\main\\java\\iswa\\questionnaire.json"), Test_classes.class);
            for (int i = 0; i != obj.question_rep.size(); i++)
            {
                if (obj.question_rep.get(i).equals(Usr_to_test.question_rep.get(i)))
                    failed++;
            }
            System.out.println("index name " + failed);
            Eleves.get(index_usr).matieres.mathematiques.setAdditionDifficultDriority(failed * 10);
            return (Eleves.get(index_usr).matieres.mathematiques.getAdditionDifficultDriority());
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            return (-1);
        }
    }
    /*public static void main (String[] args)
    {
        Json test = new Json();
        IAImpl bjr = new IAImpl();
        test.setNewReq();
        test.addParamToReq("b");
        test.addParamToReq("c");
        test.addParamToReq("d");
        test.endReq();

        bjr.setFicheEleve("romain", test.getReq().toString());
    }*/
}
