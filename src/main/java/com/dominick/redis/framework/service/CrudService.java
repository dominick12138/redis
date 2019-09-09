package com.dominick.redis.framework.service;


import com.dominick.redis.framework.persistence.CrudDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author dominick
 * @2019/8/28 - 16:07
 * @function:
 */

@Transactional(readOnly = true)
public abstract class CrudService<D extends CrudDao<T>,T> {

	@Autowired
	protected D dao;

	/**
	 * 获取单条数据
	 *
	 * @param id
	 * @return
	 */
	public T get(Serializable id) {
		return dao.get(id);
	}

	/**
	 * 获取单条数据
	 *
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}

	/**
	 * 获取所有数据
	 *
	 * @return
	 */
	public List<T> getList() {
		return dao.getList();
	}

	/**
	 * 插入数据
	 *
	 * @param entity
	 * @return
	 */
	public int insert(T entity) {
		return dao.insert(entity);
	}

	/**
	 * 更新数据
	 *
	 * @param entity
	 * @return
	 */
	public T update(T entity) {
		dao.update(entity);
		return entity;
	}

	/**
	 * 删除数据
	 *
	 * @param id
	 * @return
	 */
	public int delete(Serializable id) {
		return dao.delete(id);
	}


}
