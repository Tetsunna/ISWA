package ISWA.code;

/**
 * Created by Adrien on 17/03/2017.
 */

import java.util.List;
import javax.jws.WebService;

@WebService(name = "ISWA_Salon", targetNamespace="http://ISWA.code")
public interface ISWA_salon
{
    public void send(String message, String user_name);
    public List<Message> Get_all_messages();
}
