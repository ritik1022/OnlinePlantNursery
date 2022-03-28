package in.capgemini.onlineplantnureseryapplication.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.capgemini.onlineplantnureseryapplication.domain.Plants;
import in.capgemini.onlineplantnureseryapplication.repository.PlantRepository;
import in.capgemini.onlineplantnureseryapplication.service.PlantService;


@Service
public class PlantServiceImpl implements PlantService {
 
@Autowired
private PlantRepository plantrepository;
	@Override
	public Plants saveOrUpdate(Plants plant) {
		// TODO Auto-generated method stub
		return plantrepository.save(plant);
	}

}
