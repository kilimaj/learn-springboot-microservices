package dev.kilima.mybatis.programs;

import java.io.IOException;

import dev.kilima.mybatis.dao.CustomerDao;
import dev.kilima.mybatis.dao.DaoFactory;
import dev.kilima.mybatis.entity.CustomersLombok;

public class DeleteCustomer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CustomerDao dao = DaoFactory.getCustomerDao();

		int id = 3;
		CustomersLombok c1 = dao.getCustomerById(id);
		if (c1 == null) {
			System.out.println("No Customer data for id: " + id);
		} else {
			System.out.println(c1);
			dao.deleteCustomer(id);
			System.out.println("No Customer data for id: " + id + "is Deleted");
		}
	}

}
