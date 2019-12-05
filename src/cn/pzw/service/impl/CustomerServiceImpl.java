package cn.pzw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pzw.dao.CustomerMapper;
import cn.pzw.pojo.Customer;
import cn.pzw.pojo.QueryVo;
import cn.pzw.service.CustomerService;
import cn.pzw.util.Page;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	public CustomerMapper customerMapper;

	public Page<Customer> getCustomerByQueryVo(QueryVo vo) {
	    	vo.setStart((vo.getPage()-1)*vo.getRows());
		    List<Customer> list = customerMapper.getCustomerByQueryVo(vo);
	     	Integer total = customerMapper.getCountByVo(vo);
		    Page<Customer> page = new Page<Customer>(total, vo.getPage(), vo.getRows(),list);
	    	return page;
	}

	@Override
	public Customer selectById(Integer id) {
		return customerMapper.selectById(id);
	}

}
