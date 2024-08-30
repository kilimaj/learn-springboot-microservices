package dev.kilima.mybatis.programs;

import java.io.IOException;

import dev.kilima.mybatis.dao.CustomerDao;
import dev.kilima.mybatis.dao.DaoFactory;
import dev.kilima.mybatis.entity.CustomersLombok;

public class AddNewCustomer {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		CustomersLombok c1 = new CustomersLombok();
		c1.setName("Satya");
		c1.setCity("Bombay");
		c1.setEmail("satya@gmail.com");
		c1.setPhone("129056789");

		dao.addCustomer(c1);

		System.out.println(c1);

	}

}
