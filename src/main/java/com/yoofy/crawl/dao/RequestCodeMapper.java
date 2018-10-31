package com.yoofy.crawl.dao;

import com.yoofy.crawl.model.RequestCode;
import com.yoofy.crawl.model.RequestCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author yoofy.liu
 * @date 2018/10/31 15:36
 */
@Repository
public interface RequestCodeMapper {
    int countByExample(RequestCodeExample example);

    int deleteByExample(RequestCodeExample example);

    int insert(RequestCode record);

    int insertSelective(RequestCode record);

    List<RequestCode> selectByExample(RequestCodeExample example);

    int updateByExampleSelective(@Param("record") RequestCode record, @Param("example") RequestCodeExample example);

    int updateByExample(@Param("record") RequestCode record, @Param("example") RequestCodeExample example);
}