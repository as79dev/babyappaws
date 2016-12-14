package de.as79dev.babyappaws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.as79dev.babyappaws.model.Baby;

@RepositoryRestResource(collectionResourceRel = "baby", path = "babys")
public interface IBabyRepository extends PagingAndSortingRepository<Baby, Long> {
	
	//@Query
	//List<Baby> findByNameOrderByName(@Param("nachname") String nachname);
	
	@Query
	List<Baby> findByNachname(@Param("nachname") String nachname); 
	
	//@Query("SELECT b FROM Baby b where b.babyid = :id") 
	//Baby findNachnameById(@Param("id") Long id);
	
	//List<Client> findByNameOrderByName(@Param("name") String name);

	
}
