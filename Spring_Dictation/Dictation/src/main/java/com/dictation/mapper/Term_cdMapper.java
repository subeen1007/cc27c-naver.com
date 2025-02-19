package com.dictation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dictation.vo.Term_cdVO;


@Repository
@Mapper
public interface Term_cdMapper {	//term_cdMapper.xml에서 이름,명령어 지정	
	
	//insert
	public void insert(Term_cdVO term_cd);

	//according to id delete
	public void delete(String year, String term);	//삭제할때 year, term이 필요함

	//according to user Of id modify
	public void update(Term_cdVO term_cd);

	//according to id query
	public Term_cdVO getById(String year, String term);

	//All queries
	public List<Term_cdVO> list();

	
}
