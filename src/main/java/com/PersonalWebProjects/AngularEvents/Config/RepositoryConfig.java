package com.PersonalWebProjects.AngularEvents.Config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;
//import com.PersonalWebProjects.AngularEvents.Entity.*;
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{

	@Autowired
	private EntityManager entityManager;
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config)
	{
//		config.exposeIdsFor(Events.class);
//		config.exposeIdsFor(Sessions.class);
		config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));

	}
}
