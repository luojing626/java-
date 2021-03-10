package org.example.dao;

import org.example.dataobject.CommodityDO;
import org.example.dataobject.UserInfoDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"org.example"})
@RestController
@MapperScan("org.example.dao")

public class App 
{
    @Autowired
    private UserInfoDOMapper userInfoDOMapper;

    @RequestMapping("/")
    public String home(){
        int id = 1;
      UserInfoDO userInfoDO= userInfoDOMapper.selectByPrimaryKey(id);
       if(userInfoDO ==null){
           return "用户不存在";
       }else{
           return userInfoDO.getUserName();
       }

    }

    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }
}
