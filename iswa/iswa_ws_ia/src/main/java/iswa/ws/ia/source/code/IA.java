package iswa.ws.ia.source.code;

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
        int _index = Eleves.indexOf(pseudo);
        return (Eleves.get(_index));
    }

    void setFicheEleve(String pseudo, String result_test)
    {
        Eleve add_result = getFicheEleve(pseudo);


    }

    void addNewEleve(Eleve new_eleve)
    {
        Eleves.add(new_eleve);
    }

}
