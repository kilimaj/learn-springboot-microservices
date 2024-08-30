package dev.kilima.mybatis.programs;

import java.io.IOException;
import java.util.List;

import dev.kilima.mybatis.dao.CustomerDao;
import dev.kilima.mybatis.dao.DaoFactory;
import dev.kilima.mybatis.entity.CustomersLombok;

public class GetAllCustomers {

	public static void main(String[] args) throws IOException {
		CustomerDao dao = DaoFactory.getCustomerDao();

		List<CustomersLombok> list = dao.getAllCustomers();

		System.out.println("There are " + list.size() + " customers.");
		for (CustomersLombok c : list) {
			System.out.println(c.getName() + " is from " + c.getCity());
		}

	}

}
