package singh.madhur.jersy.RestAPIJersy.DIO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlliensRepository 
{
	public static List<Aliens> alen = new ArrayList<Aliens>();
	
	public AlliensRepository()
	{
		//if(alen ==null)
		//{
			Aliens a=new Aliens();
			a.setId(1);
			a.setName("default");
			a.setPoints(5);
			alen.add(a);
		//}
	}
	public Aliens addAlien(Aliens al)
	{
		Session s =HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.saveOrUpdate(al);
		return al;	
	}
	public Aliens deleteAlien(int id)
	{
		Aliens a=alen.stream().filter(p->p.getId()==id).findAny().orElse(null);
		alen.remove(a);
		return a;
	}
	public List<Aliens> getAliens() {
		return alen;
		
	}
	
	public Aliens getAliens(int id)
	{
		Aliens a=alen.stream().filter(p->p.getId()==id).findAny().orElse(null);
		return a;
	}
}
