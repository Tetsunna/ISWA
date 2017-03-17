package ISWA.code;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Adrien on 17/03/2017.
 */

@WebService(endpointInterface="ISWA.code.ISWA_salon", serviceName="ISWA_salon", portName="ISWAport")
public class ISWA_salon_impl implements ISWA_salon
{
    private List<Message> message_list = new ArrayList<Message>();

    public void send(String user_name, String message)
    {
        Message new_message = new Message();
        new_message.setMessage(message);
        new_message.setUser_name(user_name);

        message_list.add(new_message);
    }

    public List<Message> Get_all_messages()
    {
        return message_list;
    }
}
