package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			//SELECT
			//List<City> cities = session.createQuery("from City").getResultList();
			
			//KOÞULLU SELECT
			//List<City> cities = session.createQuery("from City c where c.countryCode='TUR'").getResultList();
			//List<City> cities = session.createQuery("from City c where c.countryCode='TUR' and c.population>500000").getResultList();
			//List<City> cities = session.createQuery("from City c where c.countryCode='TUR' order by c.name desc").getResultList();
			//List<String> countryCodes = session.createQuery("select c.countryCode from City c group by c.countryCode").getResultList();
			/*for(City city:cities) {
				System.out.println(city.getName()+ " " + city.getCountryCode()+" "+city.getDistrict()+" "+city.getPopulation());
			}*/
			/*
			 * for(String countryCode:countryCodes) { System.out.println(countryCode); }
			 */
			
			//INSERT ÝÞLEMLERÝ
			/*
			 * City city = new City(); city.setName("Musul"); city.setCountryCode("TUR");
			 * city.setDistrict("Musul"); city.setPopulation(250000);
			 * 
			 * session.save(city);
			 */
			
			
			//UPDATE ÝÞLEMLERÝ
			/*
			 * City city = session.get(City.class, 4080);
			 * System.out.println(city.getName()); city.setName("Kerkük");
			 * city.setPopulation(350000); session.save(city);
			 */
			
			//DELETE ÝÞLEMLERÝ
			City city = session.get(City.class, 4080);
			System.out.println(city.getName());
			session.delete(city);
			
			
			session.getTransaction().commit();
			System.out.println("Þehir silindi...");
		}finally {
			factory.close();
		}
	}
}
