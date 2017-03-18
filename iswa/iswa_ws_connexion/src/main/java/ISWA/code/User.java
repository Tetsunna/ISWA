package ISWA.code;

/**
 * Created by Adrien on 18/03/2017.
 */
public class User
{
    private String user_name;
    private String password;

    public void SetUserName(String name)
    {
        this.user_name = name;
    }

    public String GetUserName()
    {
        return this.user_name;
    }

    public void SetPassWord(String password)
    {
        this.password = password;
    }

    public String GetPassWord()
    {
        return this.password;
    }
}
