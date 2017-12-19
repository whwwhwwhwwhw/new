package cn.tyyhoa.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.tyyhoa.pojo.OaScbConsulter;
import cn.tyyhoa.pojo.OaScbRecord;
import cn.tyyhoa.pojo.OaScbVisit;

public interface OaScbNetworkService {
		//新增
	     public int networkAdd(OaScbConsulter oaScbConsulter);
	
	      //查询
		public List<OaScbConsulter> NetworkQuery(Map<String, Object> map);
		//查询总记录数
		public int getNetworkcount(OaScbConsulter oaScbConsulter);
		
		//查询学生详情
		public OaScbConsulter selectOne(int id);
		//查询基本信息
		public List<OaScbConsulter> selectstudentInfo(Map<String, Object> map);
		//查询基本信息(提交)
		public int editConInfoStatus(int id );
		
		//查询基本信息总记录数
		public int selectInfoCount(OaScbConsulter oaScbConsulter);
		//跟踪
		public List<OaScbVisit> networkVisitFind(int consultId);
		public List<OaScbConsulter> NetworkQueryfollwing(Map<String, Object> map );
		//提交量
		public int handallInfo(int[] id);
		
		//记事
		public int insertRecord(OaScbRecord oaScbRecord);
		//最大id
		public int maxId();
		
}
