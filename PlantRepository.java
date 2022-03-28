package in.capgemini.onlineplantnureseryapplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import in.capgemini.onlineplantnureseryapplication.domain.Plants;

@Repository
public interface PlantRepository extends CrudRepository<Plants, Integer>{
	

}
