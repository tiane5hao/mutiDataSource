package com.zhengyun.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.Map;

/**
 * Created by 听风 on 2017/9/28.
 */
public class MutiDataSource extends AbstractRoutingDataSource {

    public static ThreadLocal<String> key = new ThreadLocal<String>();

    public MutiDataSource( Map<Object, Object> targetDataSources,Object defaultTargetDataSource ){
        super.setDefaultTargetDataSource(defaultTargetDataSource);
        super.setTargetDataSources(targetDataSources);
    }

    protected Object determineCurrentLookupKey() {
        return key.get();
    }
}
