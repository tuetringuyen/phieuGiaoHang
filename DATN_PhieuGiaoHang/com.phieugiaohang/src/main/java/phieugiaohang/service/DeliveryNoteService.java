package phieugiaohang.service;

import java.util.List;

import phieugiaohang.entity.DeliveryNote;
import phieugiaohang.entity.OrderDetails;
import phieugiaohang.entity.Orders;

public interface DeliveryNoteService {
	
	List<DeliveryNote> findAll();

	DeliveryNote create(DeliveryNote deliveryNote);

	DeliveryNote findById(Integer id);

	DeliveryNote update(Integer id ,DeliveryNote deliveryNote);

	void delete(Integer id);
	
	//Ngoài lề
	
	OrderDetails findByIdss(Integer id);
	
	Orders findByIds(Integer id);
	
	List<Orders> getAll();

}