package cn.beecp.starter.demo;

import cn.beecp.boot.EnableDataSourceMonitor;
import cn.beecp.boot.EnableMultiDataSource;
import cn.beecp.starter.demo.map1.UserInfo;
import cn.beecp.starter.demo.map1.UserInfoService;
import cn.beecp.starter.demo.map1.UserInfoService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableDataSourceMonitor
@SpringBootApplication
@RestController
public class MybatisDsApplication {
    @Autowired
    private UserInfoService service1;

    public static void main(String[] args) {
        SpringApplication.run(MybatisDsApplication.class, args);
    }

    @RequestMapping("/getAllUser1")
    public List<UserInfo> getAllUserInfo1() throws Exception {
        return service1.findAll();
    }
}
