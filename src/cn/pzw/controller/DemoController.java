package cn.pzw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pzw.pojo.BaseDict;
import cn.pzw.pojo.Customer;
import cn.pzw.pojo.QueryVo;
import cn.pzw.service.BaseDictService;
import cn.pzw.service.CustomerService;
import cn.pzw.util.Page;

@Controller
public class DemoController {
	@Autowired
	private BaseDictService dictService;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("list")
	public String list(Model model,QueryVo queryVo){
		List<BaseDict> fromType = dictService.getBaseDictsByCode("002");
		List<BaseDict> industryType = dictService.getBaseDictsByCode("001");
		List<BaseDict> levelType = dictService.getBaseDictsByCode("006");
		
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
        
        Page<Customer> page = customerService.getCustomerByQueryVo(queryVo);
		
        //����һ��Ҫдpage
		model.addAttribute("page", page);
		model.addAttribute("vo", queryVo);
		
		return "customer";
	}
}