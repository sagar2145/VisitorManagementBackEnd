package aatithya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class LoginDAO {

	private Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	private SessionFactory sf = configuration.buildSessionFactory();
	private Session s;
	private Transaction tx;

	public String addLoginEntry(Login user) {
		try {

			s = sf.openSession();
			tx = s.beginTransaction();
			s.save(user);
			tx.commit();

		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			tx.rollback();
		} finally {
			s.close();
		}
		return "added";

	}

	public String getLogin(Login login) {

		s = sf.openSession();
		tx = s.beginTransaction();
		NativeQuery<?> query = s.createNativeQuery("select 1 from Login where User_Name='" + login.getName()
				+ "' and Password ='" + login.getPassword() + "'");
		tx.commit();
		if (query.uniqueResult() != null) {
			return "success";
		} else {
			return "failure";
		}
	}

}
