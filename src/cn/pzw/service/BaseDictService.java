package cn.pzw.service;

import java.util.List;

import cn.pzw.pojo.BaseDict;

public interface BaseDictService {

	public List<BaseDict> getBaseDictsByCode(String code);
}
