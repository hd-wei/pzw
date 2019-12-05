package cn.pzw.dao;

import java.util.List;

import cn.pzw.pojo.Customer;
import cn.pzw.pojo.QueryVo;

public interface CustomerMapper {

	public List<Customer> getCustomerByQueryVo(QueryVo vo);

	public Integer getCountByVo(QueryVo vo);

	public Customer selectById(Integer id);

}
