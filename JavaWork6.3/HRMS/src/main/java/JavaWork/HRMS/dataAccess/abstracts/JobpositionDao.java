package JavaWork.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaWork.HRMS.entities.concretes.jobposition;

public interface JobpositionDao extends JpaRepository<jobposition,Integer> {
		
}
