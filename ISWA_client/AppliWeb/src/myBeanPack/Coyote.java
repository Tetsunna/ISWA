/**
 * Created by orion on 18/03/2017.
 */

package myBeanPack;

public class Coyote
{
    private String nom;
    private String prenom;
    private boolean genius;

    public String getNom()
    {
        return this.nom;
    }

    public String getPrenom()
    {
        return this.prenom;
    }

    public boolean isGenius()
    {
        return this.genius;
    }

    public void setNom(String name)
    {
        this.nom = name;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public void setGenius(boolean genius)
    {
        this.genius = true;
    }
}