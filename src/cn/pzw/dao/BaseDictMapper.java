package cn.pzw.dao;

import java.util.List;

import cn.pzw.pojo.BaseDict;

public interface BaseDictMapper {
	 public List<BaseDict> getBaseDictsByCode(String code);
}
