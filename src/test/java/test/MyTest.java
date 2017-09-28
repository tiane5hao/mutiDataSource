package test;

import com.zhengyun.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by 听风 on 2017/9/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MyTest {

    @Autowired
    private IStudentService orderDao;
    @Test
    public void demo1(){
        orderDao.queryStudentInfo("a");

    }
}


