package jdbcassignment;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

public class CustomerApplication {

	public static void main(String[] args) throws IOException {
		Connection connection;
		connection = ConnectionFactory.getConnection();
		if (connection != null)
			System.out.println("sucessfull");

		CustomerDao dao = new CustomerDaoImple();

// add customer
		
		/*
		 * Customer customer=new Customer(6,"akbar", "8856742345", "akbar1324@gmail.com",
		 * new Date(),"delhi",897600); dao.addCustomer(customer1);
		 */
		 
// Delete the customer

		/*
		 * dao.delCustomer(6);
		 */
		
		  
// update the customer
		/*
		 * dao.updateCustomer(2,2001); 
		 * 
		 * 
		 */
		
		  
// print all the customers

		/*
		 * List<Customer>customers=dao.getAllCustomer(); customers.forEach(c->
		 * System.out.println(c));
		 * 
		 * 
		 */

		System.out.println(dao.getCustomerById(3));


		List<Customer> customers = dao.getSelectedCustomer(500000);
		customers.forEach(c -> System.out.println(c));

	}

}
