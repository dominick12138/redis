package com.dominick.redis.framework.persistence;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author dominick
 * @2019/8/28 - 15:51
 * @function:
 */
public interface CrudDao<T> extends BaseDao{
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(Serializable id);

	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity);

	/**
	 * 获取所有数据
	 * @return
	 */
	public List<T> getList();

	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	public int inset(T entity);

	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public T update(T entity);

	/**
	 * 删除数据
	 * @param id
	 * @return
	 */
	public int delete(Serializable id);



}
