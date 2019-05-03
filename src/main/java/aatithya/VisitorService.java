package aatithya;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/uri", produces = "application/json")
public class VisitorService {

	VisitorDAO visitorDAO = new VisitorDAO();
	LoginDAO loginDAO = new LoginDAO();
	Visitor visitor = new Visitor();

	// posting into
	@RequestMapping(value = "/visit", method = RequestMethod.POST, consumes = "application/json")
	public String showDetails(@RequestBody Visitor visitor) {

		String res = visitorDAO.addVisitorEntry(visitor);
		return res;
	}
	//checkout
	@RequestMapping(value = "/check", method = RequestMethod.POST, consumes = "application/json")
	public String check(@RequestBody Visitor visit) {
		String res=visitorDAO.checkOut(visit.getPhoneNumber());
		return res;
	}

	
	
	// add login into db
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginDetails(@RequestBody Login user) {

		String res = loginDAO.addLoginEntry(user);
		return res;}

	// get visitors data from db
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<List<Visitor>> getDetails() {
		List<Visitor> v = visitorDAO.getAllVisitors();
		return new ResponseEntity<List<Visitor>>(v, HttpStatus.OK);
	}

	// validating login
	@RequestMapping(value = "/LoginGet", method = RequestMethod.POST,consumes="application/json")
	public String getLoginDetails(@RequestBody Login login) {
		return loginDAO.getLogin(login);
	}

	// status
	@RequestMapping(value = "/status", method = RequestMethod.POST, consumes = "application/json")
	public String getStatus() {
		String status = visitorDAO.getStatus2();
		return status;
	}
	

	


}
