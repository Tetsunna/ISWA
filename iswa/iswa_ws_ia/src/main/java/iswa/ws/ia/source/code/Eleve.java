package iswa.ws.ia.source.code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h nh on 17/03/2017.
 */
public class Eleve
{
    Matiere matieres = new Matiere();
    private String name;

    public Eleve()
    {

    }

    public Eleve(String name1)
    {
        name = name1;
    }

    public Matiere getMatieres()
    {
        return (matieres);
    }

    public void setMatieres(Matiere m)
    {
        matieres = m;
    }

    public String getName()
    {
        return (name);
    }

    public void setName(String n)
    {
        name = n;
    }
}
