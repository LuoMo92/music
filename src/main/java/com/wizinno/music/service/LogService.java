package com.wizinno.music.service;

import com.wizinno.music.base.BaseService;
import com.wizinno.music.common.vo.SearchVo;
import com.wizinno.music.domain.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author LiuMei
 * @date 2018-09-12.
 */
public interface LogService  extends BaseService<Log,String> {

    /**
     * 日志搜索
     * @param key
     * @param searchVo
     * @param pageable
     * @return
     */
    Page<Log> searchLog(String key, SearchVo searchVo, Pageable pageable);

    /**
     * 删除所有
     */
    void deleteAll();

}
