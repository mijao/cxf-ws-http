package demo.order.service.impl;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.cxf.message.Message;
import org.apache.log4j.Logger;

import demo.order.model.Order;
import demo.order.service.OrderProcess;


@WebService
public class OrderProcessImpl implements OrderProcess {
	
	private static final Logger LOG = Logger.getLogger(OrderProcessImpl.class.getName());
	
	@Resource
	WebServiceContext wsc;

	@Override
	public String processOrder(Order order) {
		LOG.info("Executing operation processOrder");
		
		/*
		 * Obtener informacion del contexto
		 */
		MessageContext ctx = wsc.getMessageContext();
		QName operation = (QName) ctx.get(Message.WSDL_OPERATION);		
		LOG.info("The operation name is: " + operation);
		
		String orderID = validate(order);
		return orderID;
	}

	public String validate(Order order) { 
		String custID = order.getCustomerID();
		String itemID = order.getItemID();
		int qty = order.getQty();
		double price = order.getPrice();
		
		if (custID != null && itemID != null && !custID.equals("")
						   && !itemID.equals("") && qty > 0
						   && price > 0.0) {
			return "ORD1234";
		}
		
		return null;		
	}

}