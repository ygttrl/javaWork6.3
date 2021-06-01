package JavaWork.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaWork.HRMS.business.abstracts.JobpositionService;
import JavaWork.HRMS.dataAccess.abstracts.JobpositionDao;
import JavaWork.HRMS.entities.concretes.jobposition;

@Service
public class jobpositionManager implements JobpositionService {

	private JobpositionDao jobpositionDao;
	
	@Autowired
	public jobpositionManager(JobpositionDao jobpositionDao) {
		super();
		this.jobpositionDao = jobpositionDao;
	}
	
	@Override
	public List<jobposition> GetAll() {		
		return this.jobpositionDao.findAll();
	}
	
}
