package cn.pzw.service;

import cn.pzw.pojo.Customer;
import cn.pzw.pojo.QueryVo;
import cn.pzw.util.Page;

public interface CustomerService {

	public Page<Customer> getCustomerByQueryVo(QueryVo queryVo);

	public Customer selectById(Integer id);

}
