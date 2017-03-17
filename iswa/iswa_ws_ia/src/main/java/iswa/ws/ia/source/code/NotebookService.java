package iswa.ws.ia.source.code;

import java.util.List;

import javax.jws.WebService;

@WebService(name = "imatest", targetNamespace="http://iswa.ws.ia.source.code")
public interface NotebookService {

	boolean addPerson(Person p);
	
	List<Person> getPersons();
	
	Person getPersonAt(String name);
}
