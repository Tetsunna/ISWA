package ISWA.code;

/**
 * Created by Adrien on 17/03/2017.
 */
public class Message
{
    String user_name;
    String message;

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setUser_name(String name)
    {
        this.user_name = name;
    }

    public String getMessage()
    {
        return message;
    }

    public String getUser_name()
    {
        return this.user_name;
    }
}
