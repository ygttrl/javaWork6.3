package JavaWork.HRMS.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaWork.HRMS.business.abstracts.JobpositionService;
import JavaWork.HRMS.entities.concretes.jobposition;


@RestController
@RequestMapping("/api/jobposition")
public class JobpositionController {	
	
	private  JobpositionService jobpositionService;
	
		
	
	public JobpositionController(JobpositionService jobpositionService) {
		super();
		this.jobpositionService = jobpositionService;
	}



	@GetMapping("/getall")
	public List<jobposition> getAll()
	{
		return this.jobpositionService.GetAll();
	}
	
}
