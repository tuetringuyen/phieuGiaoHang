package phieugiaohang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phieugiaohang.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
