package JavaWork.HRMS.business.abstracts;

import java.util.List;

import JavaWork.HRMS.entities.concretes.jobposition;

public interface JobpositionService {
	
	List<jobposition> GetAll();
	
}
