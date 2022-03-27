package in.capgemini.onlineplantnureseryapplication.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.capgemini.onlineplantnureseryapplication.domain.Plants;
import in.capgemini.onlineplantnureseryapplication.service.PlantService;

@RestController
@RequestMapping("/ex/plants")
public class PlantController {
	
		@Autowired
		private PlantService plantService;
		@PostMapping("")
		public Plants addPlant(@Valid @RequestBody Plants plant) {
			Plants addedPlant= plantService.saveOrUpdate(plant);
			return addedPlant;
		}
}
