package ISWA.code;

import javax.jws.WebService;

/**
 * Created by Adrien on 18/03/2017.
 */

@WebService(name = "ISWA_Connexion", targetNamespace="http://ISWA.code")
public interface ISWA_connexion
{
    public boolean connexion(String UserName, String PassWord);
    public boolean create_account(String UserName, String PassWord);
}
