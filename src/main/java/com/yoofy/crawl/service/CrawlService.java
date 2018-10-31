package com.yoofy.crawl.service;

import com.yoofy.crawl.dao.RequestCodeMapper;
import com.yoofy.crawl.model.RequestCode;
import com.yoofy.crawl.model.RequestCodeExample;
import com.yoofy.crawl.vo.BaseReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yoofy.liu
 * @date 2018/10/31 14:17
 */
@Service
public class CrawlService {
    @Autowired
    private RequestCodeMapper requestCodeMapper;

    public BaseReturnVO testConnection(){
        RequestCodeExample requestCodeExample = new RequestCodeExample();
        requestCodeExample.createCriteria().andIdEqualTo(1);
        List<RequestCode> requestCodeList = requestCodeMapper.selectByExample(requestCodeExample);

        return new BaseReturnVO(requestCodeList);
    }
}
