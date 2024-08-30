package dev.kilima.mybatis.programs;

import java.io.IOException;

import dev.kilima.mybatis.dao.CustomerDao;
import dev.kilima.mybatis.dao.DaoFactory;
import dev.kilima.mybatis.entity.CustomersLombok;

public class RetrieveCustomerById {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CustomerDao dao = DaoFactory.getCustomerDao();

		int id = 2;
		CustomersLombok c1 = dao.getCustomerById(id);
		if (c1 == null) {
			System.out.println("No Customer data for id: " + id);
		} else {
			System.out.println(c1);
		}
	}

}
