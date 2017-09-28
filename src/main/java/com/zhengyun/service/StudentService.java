package com.zhengyun.service;

import com.zhengyun.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by 听风 on 2017/9/28.
 */
@Service
public class StudentService implements IStudentService {

    @Autowired
    StudentMapper studentMapper;
    public Map<String, ?> queryStudentInfo(String userName) {
        return studentMapper.queryStudentInfo(userName);
    }
}
