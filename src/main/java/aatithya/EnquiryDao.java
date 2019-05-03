package aatithya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class EnquiryDao {
	private Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	private SessionFactory sf = configuration.buildSessionFactory();
	private Session s;
	private Transaction tx;

	public String addDetails(EnquiryDetails details) {
		try {

			s = sf.openSession();
			tx = s.beginTransaction();
			s.save(details);
			tx.commit();

		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			tx.rollback();
		} finally {
			s.close();
		}
		return "added";

	}
	public String addInfo(EnquiryInformation info) {
		try {

			s = sf.openSession();
			tx = s.beginTransaction();
			s.save(info);
			tx.commit();

		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			tx.rollback();
		} finally {
			s.close();
		}
		return "added";

	}
	public String addVehichle(VehicleInformation vehichle) {
		try {

			s = sf.openSession();
			tx = s.beginTransaction();
			s.save(vehichle);
			tx.commit();

		} catch (Exception e) {
			System.err.println("Exception : " + e.getMessage());
			tx.rollback();
		} finally {
			s.close();
		}
		return "added";

	}

}
