import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.HibernateUtil;
import com.job.job;
import com.problem.problem;
import com.user.user;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction tr = session.beginTransaction();
//		user u = new user();
//		u.setUser_name("Job_user2");

		problem p = new problem();
		p.setProblem_name("P13");
		
		job j1 = new job();
		j1.setJob_name("J13");
		j1.setP(p);
//		j1.setJob_type("T11");
		job j2 = new job();
		j2.setJob_name("J24");
		j2.setP(p);
//		j2.setJob_type("T22");
		
//		u.getJobs().add(j1);
//		u.getJobs().add(j2);
		
		try{
			session.save(j1);
			session.save(j2);
			tr.commit();
		}catch(Exception e){
			tr.rollback();
		}finally{
			session.close();
		}
	}

}
