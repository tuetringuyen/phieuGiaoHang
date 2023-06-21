package phieugiaohang.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import phieugiaohang.entity.DeliveryNote;
import phieugiaohang.service.DeliveryNoteService;

//@CrossOrigin("*")
@RestController
@RequestMapping("/rest/delivery-note")
public class DeliveryNoteRestController {
	
	@Autowired
	DeliveryNoteService deliveryNoteService;
	
	@PostMapping("/create")
	public DeliveryNote create(@RequestBody DeliveryNote deliveryNote) {
		return deliveryNoteService.create(deliveryNote);
	}
	
	@GetMapping("/get-all")
	public List<DeliveryNote> getAll() {
		return deliveryNoteService.findAll();
	}
	
	@GetMapping("/get-one/{id}")
	public DeliveryNote getOne(@PathVariable("id") Integer id) {
		return deliveryNoteService.findById(id);
	}
	
	@PutMapping("/update/{id}")
	public DeliveryNote update(@PathVariable("id") Integer id ,@RequestBody DeliveryNote deliveryNote) {
		return deliveryNoteService.update(id,deliveryNote);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		deliveryNoteService.delete(id);
	}

}
