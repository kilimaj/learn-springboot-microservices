package dev.kilima.mybatis.programs;

import java.io.IOException;
import java.util.List;

import dev.kilima.mybatis.dao.CustomerDao;
import dev.kilima.mybatis.dao.DaoFactory;
import dev.kilima.mybatis.entity.CustomersLombok;

public class GetCustomerByCity {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();
		
		String city = "Bombay";
		List<CustomersLombok> customers = dao.getCustomerByCity(city);
		if(customers == null) {
			System.out.println("No customer lives in: " + city);
		} else {
			System.out.println("There are " +customers.size()+ " living in " + city);
			for(CustomersLombok c: customers) {
				System.out.println(c.getName() + " lives in " + c.getCity());
			}
		}
		

	}

}
