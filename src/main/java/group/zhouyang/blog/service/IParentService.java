package group.zhouyang.blog.service;

import java.util.List;

/** 
* @描述:这个是基础的service接口，包含了常见的几个方法
* @author 周阳 
* @date 创建时间：2018年5月18日 下午4:58:52
* @version v1.0
*/
public interface IParentService<T> {

	public void save(T t);
	
	public void saveAll(List<T> t);
	
	public int deleteById(int id);
	
	public int update(List<T> t);
	
	public List<T> findById(int id);
	
	
}
