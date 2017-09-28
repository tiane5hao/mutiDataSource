package com.zhengyun.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by 听风 on 2017/9/28.
 */
@Repository
public interface StudentMapper {

    Map<String, ?> queryStudentInfo(String userName);
}
