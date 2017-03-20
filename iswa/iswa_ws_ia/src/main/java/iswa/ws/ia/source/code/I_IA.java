package iswa.ws.ia.source.code;

import javax.jws.WebService;

/**
 * Created by h nh on 17/03/2017.
 */

@WebService(name = "iswawsia", targetNamespace="http://iswa.ws.ia.source.code")
public interface I_IA
{
    int getFicheEleve(String pseudo);
    boolean setFicheEleve(String pseudo, String result_test);
    void addNewEleve(Eleve new_eleve);
    Eleve getEleveDifficulty(String pseudo);

}
