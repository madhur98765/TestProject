package singh.madhur.jersy.RestAPIJersy.DIO;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory ==null)
		{
			try {
			Configuration cfg=new Configuration();
			Properties pr=new Properties();
			pr.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
			pr.put(Environment.URL, "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=EmployeeDB");
			pr.put(Environment.USER, "singhmadhur");
			pr.put(Environment.PASS, "madhursingh");
			pr.put(Environment.DIALECT, "org.hibernate.dialect.SQLServer2012Dialect");
			pr.put(Environment.SHOW_SQL, "true");
			pr.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			pr.put(Environment.HBM2DDL_AUTO, "create-drop");
			
			cfg.setProperties(pr);
			cfg.addAnnotatedClass(Aliens.class);
			ServiceRegistry sr=new StandardServiceRegistryBuilder().
						applySettings(cfg.getProperties()).build();
			
			sessionFactory= cfg.buildSessionFactory(sr);
			}
			 catch (Exception e) {
				 
				 e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		return sessionFactory;
	}

}
