package com.he0303.test.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
public class BaseDaoImpl<T>  {
	@Resource
	private   SessionFactory sessionFactory;
	protected  Class<T> clazz;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public BaseDaoImpl() {
		Type genericSuperclass = this.getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) genericSuperclass;
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}

	public T getById(Serializable id) {
		return (T) getSession().get(clazz, id);
	}

	public List<T> getAll(){
		return getSession().createQuery(" FROM "+clazz.getSimpleName()).list();
	}




}
