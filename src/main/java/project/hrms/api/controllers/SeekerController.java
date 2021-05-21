package project.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.SeekerService;
import project.hrms.entities.concretes.Seeker;

@RestController
@RequestMapping("/api/seeker")
public class SeekerController {

    private SeekerService seekerService;

    @Autowired
    public SeekerController(SeekerService seekerService) {
    	super();
        this.seekerService = seekerService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> add(@RequestBody Seeker seeker){
    	return this.seekerService.add(seeker);    }
        
	
	@PostMapping("/addAllSeekers")
	public ResponseEntity<List<Seeker>> addAllSeekers(@RequestBody List<Seeker> seekers){
		List<Seeker> newSeekers = seekerService.addAllSeekers(seekers);
		return new ResponseEntity<>(newSeekers, HttpStatus.CREATED);			
	}
}
