package cn.pzw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pzw.dao.BaseDictMapper;
import cn.pzw.pojo.BaseDict;
import cn.pzw.service.BaseDictService;

@Service
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	private BaseDictMapper baseDictMapper;
	@Override
	public List<BaseDict> getBaseDictsByCode(String code) {
		return baseDictMapper.getBaseDictsByCode(code);
	}
}
