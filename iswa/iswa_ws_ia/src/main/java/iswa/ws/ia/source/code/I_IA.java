package iswa.ws.ia.source.code;

/**
 * Created by h nh on 17/03/2017.
 */
public interface I_IA
{
    Eleve getFicheEleve(String pseudo);
    void setFicheEleve(String pseudo, String result_test);
    void addNewEleve(Eleve new_eleve);
}
