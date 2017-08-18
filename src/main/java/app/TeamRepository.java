package app;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TeamRepository extends PagingAndSortingRepository<Team, Long> {

}


//
//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
//public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
//
//	List<Person> findByLastName(@Param("name") String name);
//	
//	List<Person> findDistinctPeopleByFirstNameOrLastNameIgnoreCase(String lastname, String firstname);
//	
////	List<Person> findDistinctPeopleByLastnameOrFi4rstname(String lastname, String firstname);
//
//}