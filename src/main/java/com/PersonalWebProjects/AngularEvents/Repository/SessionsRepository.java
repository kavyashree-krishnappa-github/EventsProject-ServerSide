package com.PersonalWebProjects.AngularEvents.Repository;
import com.PersonalWebProjects.AngularEvents.Entity.Sessions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="sessions",path="sessions")

public interface SessionsRepository extends JpaRepository<Sessions, Integer>{


}
