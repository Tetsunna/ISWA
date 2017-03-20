package ISWA.code;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrien on 18/03/2017.
 */

@WebService(endpointInterface= "ISWA.code.ISWA_connexion", serviceName="ISWA_salon", portName="ISWAport")
public class ISWA_connexion_impl implements ISWA_connexion
{
    private List<User> user_list = new ArrayList<User>();

    public ISWA_connexion_impl()
    {
        User u1 = new User();
        User u2 = new User();

        u1.SetUserName("toto");
        u2.SetUserName("tata");
        u1.SetPassWord("azerty");
        u2.SetPassWord("azerty");
        user_list.add(u1);
        user_list.add(u2);
    }

    public boolean connexion(String UserName, String PassWord)
    {
        System.out.println(UserName);
        if (verif_user_exsit(UserName) == true)
        {
            int i = 0;

            while (i != user_list.size())
            {
                if (UserName.equals(user_list.get(i).GetUserName()) == true)
                {
                    if (PassWord.equals(user_list.get(i).GetPassWord()) == true)
                    {
                        System.out.println(user_list.get(i).GetUserName());
                        return true;
                    } else
                        return false;
                }
                i++;
            }
        }
        return false;
    }

    public boolean verif_user_exsit(String User)
    {
        int i = 0;

        while (i != user_list.size())
        {
            if (User.equals(user_list.get(i).GetUserName()) == true)
                return true;
            else
                i++;
        }
        return false;
    }

    public boolean create_account(String UserName, String PassWord)
    {
        User newuser = new User();
        newuser.SetUserName(UserName);
        newuser.SetPassWord(PassWord);
        this.user_list.add(newuser);
        return true;
    }
}
