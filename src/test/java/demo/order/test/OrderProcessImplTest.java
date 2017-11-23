package demo.order.test;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import demo.order.model.Order;
import demo.order.service.impl.OrderProcessImpl;

public class OrderProcessImplTest {
	//test
	
	private static final Logger LOG = Logger.getLogger(OrderProcessImplTest.class.getName());
	private OrderProcessImpl service = new OrderProcessImpl();  
	
	@Test
	public void testOrderProcess_orderNotNull() {
		LOG.info("Executing test testOrderProcess_orderNotNull");
		Order order = new Order("Jose Rivas", "carro", 500, 12.5);
		assertEquals("ORD1234", service.validate(order));
	}
	
	@Test
	public void testOrderProcess_orderIsNull() {
		LOG.info("Executing test testOrderProcess_orderIsNull");
		Order order = new Order();		
		assertNull(service.validate(order));		
	}
	
	@Test
	public void testOrderProcess_customerIdIsNull() {
		LOG.info("Executing test testOrderProcess_customerIdIsNull");
		Order order = new Order(null, "carro", 500, 12.5);		
		assertNull(service.validate(order));		
	}	

}
