package app.dao.tipologiche;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.dao.tabelle.entities._1X2Odds;
import app.dao.tipologiche.entities.HomeVariationType;
import app.dao.tipologiche.entities.TimeType;
import app.dao.tipologiche.entities.UoThresholdType;

@RepositoryRestResource
public interface UoThresholdTypeRepo extends JpaRepository<UoThresholdType, Long> {

//	List<Person> findByLastName(@Param("name") String name);
//	
//	List<Person> findDistinctPeopleByFirstNameOrLastNameIgnoreCase(String lastname, String firstname);
	
//	List<Person> findDistinctPeopleByLastnameOrFi4rstname(String lastname, String firstname);

}
