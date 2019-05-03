package aatithya;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VisitorDAO {
	private Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	private SessionFactory sf = configuration.buildSessionFactory();
	private Session s;
	private Transaction tx;
	
	Visitor visitor;

	public String addVisitorEntry(Visitor visitor) {
		try {

			
			s = sf.openSession();
			tx = s.beginTransaction();
			visitor.setCheckin(time());
			visitor.setStatus("pending");
			s.save(visitor);
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
		} finally {
			s.close();
		}
		return "added";
	}

	
	public String checkOut(long phone) {
		try {
			s=sf.openSession();
			tx=s.beginTransaction();
			Query query=s.createQuery("update Visitor set checkout='" + time() + "', status='COMPLETED' where phoneNumber=" +phone+" AND checkout is NULL ");
		query.executeUpdate();
		s.flush();
		tx.commit();
		}
		catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			tx.rollback();
		}
		
		return "added" ;
	}


	

	public List<Visitor> getAllVisitors() {
		s = sf.openSession();
		tx = s.beginTransaction();
		Query query = s.createQuery("from Visitor");
		List list = query.getResultList();
		tx.commit();
		s.close();
		return list;
	}

	public String time() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String checkOutTime = dtf.format(now);
		return checkOutTime;
	}
	

	public String getStatus2() {
		visitor.setStatus("completed");

		return "completed";
	}
}
