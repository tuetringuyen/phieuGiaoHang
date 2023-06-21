package phieugiaohang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phieugiaohang.entity.DeliveryNote;
import phieugiaohang.entity.OrderDetails;
import phieugiaohang.entity.Orders;
import phieugiaohang.repository.DeliveryNoteRepository;
import phieugiaohang.repository.OrderDetailRepository;
import phieugiaohang.repository.OrderRepository;
import phieugiaohang.service.DeliveryNoteService;

@Service
public class DeliveryNoteServiceImpl implements DeliveryNoteService{
	
	@Autowired
	DeliveryNoteRepository pdao;
	
	@Autowired
	OrderDetailRepository orderDetailDAO;
	
	@Autowired
	OrderRepository orderDAO;
	
	@Override
	public DeliveryNote create(DeliveryNote deliveryNote) {
		return pdao.save(deliveryNote);
	}

	@Override
	public List<DeliveryNote> findAll() {
		return pdao.findAll();
	}
	
	@Override
	public DeliveryNote findById(Integer id) {
		return pdao.findById(id).get();
	}
	
	@Override
	public DeliveryNote update(Integer id,DeliveryNote deliveryNote) {
		return pdao.save(deliveryNote);
	}

	@Override
	public void delete(Integer id) {
		 pdao.deleteById(id);
	}
	
	//Ngoài lề
	
	@Override
	public OrderDetails findByIdss(Integer id) {
		return orderDetailDAO.findById(id).get();
	}
	
	@Override
	public Orders findByIds(Integer id) {
		return orderDAO.findById(id).get();
	}
	
	@Override
	public List<Orders> getAll() {
		return orderDAO.findAll();
	}
	
}
