package phieugiaohang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import phieugiaohang.entity.OrderDetails;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetails, Integer>{

}
