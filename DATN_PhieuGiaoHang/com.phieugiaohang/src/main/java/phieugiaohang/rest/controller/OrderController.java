package phieugiaohang.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import phieugiaohang.entity.Orders;
import phieugiaohang.service.OrderService;

@RestController
@RequestMapping("/rest/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/get-all")
	public List<Orders> getAll() {
		return orderService.findAll();
	}

}
