package com.project.jpaMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaMappingApplication {

	@Autowired
//	ProductRepository productRepository;
//
//	@Autowired
//	CustomerRepository customerRepository;
//
//	@Autowired
//	OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaMappingApplication.class, args);
	}

//	private Logger logger = LoggerFactory.getLogger(JpaMappingApplication.class);

//	@Override
//	public void run(String... args) throws Exception {
	// TODO Auto-generated method stub

//		Product product1 = new Product();
//		product1.setName("Shampoo");
//		product1.setCategory("FMCG");
//		product1.setPrice("200");
//
//		Product product2 = new Product();
//		product2.setName("Dish Wash");
//		product2.setCategory("FMCG");
//		product2.setPrice("70");
//
//		Product prodObj = productRepository.save(product1);
//
//		Order order1 = new Order();
//		order1.setOrderNumber("002");
//		order1.setAddress("Madivala , Bangalore");
//		order1.setTotalAmount(200);
//

//		ArrayList<Product> productList = new ArrayList<>();
//		productList.add(product1);
//		order1.setProductId(productList);
//
//		Order orderObj = orderRepository.save(order1);

//		Customer customer1 = new Customer();
//		customer1.setName("zoya");
//		customer1.setAge(33);
//		customer1.setEmail("zoya@gmail.com");
//
//		ArrayList<Order> OrderList = new ArrayList<>();
//		OrderList.add(orderRepository.findById(1).get());
//		customer1.setOrders(order1);;

//		Customer customerObj = customerRepository.save(customer1);

//		Customer customerObj = customerRepository.getReferenceById(1);
//
//		Order orderObj = orderRepository.getReferenceById(1);
//
//		Customer cust = orderObj.getCustomer();

//		logger.info("customer {},{}", customerObj.getName(),customerObj.getOrders());

//		Optional<Product> productOptional = productRepository.findById(1);

//		System.out.println("customerObj : ");

//		customerRepository.deleteById(11);

//	}

}
