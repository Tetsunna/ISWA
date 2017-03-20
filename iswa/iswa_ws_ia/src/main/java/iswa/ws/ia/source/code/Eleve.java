package iswa.ws.ia.source.code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h nh on 17/03/2017.
 */
public class Eleve
{
    Matiere matieres = new Matiere();
    private String _name;

    public Eleve()
    {

    }

    public Eleve(String name)
    {
        _name = name;
    }

    String getName()
    {
        return (_name);
    }
}
