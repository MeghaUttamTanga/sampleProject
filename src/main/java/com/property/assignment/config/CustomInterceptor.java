package com.property.assignment.config;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.springframework.stereotype.Component;

import org.hibernate.type.Type;

@Component
public class CustomInterceptor extends EmptyInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8471206462013809533L;
	
	@Override
	public boolean onSave(Object entity, Serializable id, 
	  Object[] state, String[] propertyNames, Type[] types) {
	     
	    System.out.println("------interceptor save------");
	    return super.onSave(entity, id, state, propertyNames, types);
	}

}
