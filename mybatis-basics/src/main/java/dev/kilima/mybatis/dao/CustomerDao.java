package dev.kilima.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import dev.kilima.mybatis.entity.CustomersLombok;

public interface CustomerDao {

	// QUERIES
	// CRUD OPERATIONS
	// This method uses Annotations and SQL is in the same file as Dao interface
	@Insert("insert into customers (name, city, email, phone) values (#{name}, #{city}, #{email}, #{phone}) ")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void addCustomer(CustomersLombok customer);

	@Select("select * from customers where id=#{id}")
	public CustomersLombok getCustomerById(Integer id);

	@Update("update customers set name=#{name}, city=#{city}, email=#{email}, phone=#{phone} where id=#{id}")
	public void updateCustomer(CustomersLombok customer);

	@Delete("delete from customers where id=#{id}")
	public void deleteCustomer(Integer id);

	@Select("select * from customers")
	public List<CustomersLombok> getAllCustomers();

	@Select("select * from customers where city=#{city}")
	public List<CustomersLombok> getCustomerByCity(String city);

}
