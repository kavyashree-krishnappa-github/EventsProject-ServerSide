package com.PersonalWebProjects.AngularEvents.Repository;
import com.PersonalWebProjects.AngularEvents.Entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="events",path="events")
public interface EventsRepository extends JpaRepository<Events, Integer>, CrudRepository<Events, Integer>{
}
