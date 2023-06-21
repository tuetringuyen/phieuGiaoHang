package phieugiaohang.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import phieugiaohang.entity.DeliveryNote;

@Repository
public interface DeliveryNoteRepository extends JpaRepository<DeliveryNote, Integer> {

}
