package demo.order.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import demo.order.model.Order;

@WebService
public interface OrderProcess {

	@WebMethod
	String processOrder(@WebParam(name="order") Order order);
}