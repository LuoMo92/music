package com.wizinno.music.dao.elasticsearch;

import com.wizinno.music.domain.elasticsearch.EsLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * @author LiuMei
 * @date 2018-09-12.
 */
public interface EsLogDao extends ElasticsearchRepository<EsLog, String> {

}
