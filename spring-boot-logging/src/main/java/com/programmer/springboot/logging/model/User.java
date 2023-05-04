package com.programmer.springboot.logging.model;

import com.programmer.springboot.logging.SpringBootLoggingApplication;
import com.programmer.springboot.logging.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author programmerGoGo
 * @Description
 */
@Component
public class User {
    //记录器
    Logger logger = LoggerFactory.getLogger(User.class);

    // 注意：如果这里使用 UserService ，那么这里的日志级别使用 UserService 包所设置的级别。
//    Logger logger = LoggerFactory.getLogger(UserService.class);

    public User() {

        // 日志的级别由低到高 trace<debug<info<warn<error
        // 可以调整输出的日志级别;日志就只会在这个级别以以后的高级别生效
        logger.trace("这是User-trace日志...");
        logger.debug("这是User-debug日志...");

        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别
        logger.info("这是User-info日志...");
        logger.warn("这是User-warn日志...");
        logger.error("这是User-error日志...");
    }
}
