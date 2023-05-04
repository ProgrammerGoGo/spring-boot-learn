package com.programmer.springboot.logging.service;

import com.programmer.springboot.logging.SpringBootLoggingApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author programmerGoGo
 * @Description
 */
@Service
public class UserService {
    //记录器
    Logger logger = LoggerFactory.getLogger(UserService.class);

    public UserService() {

        // 日志的级别由低到高 trace<debug<info<warn<error
        // 可以调整输出的日志级别;日志就只会在这个级别以以后的高级别生效
        logger.trace("这是UserService-trace日志...");
        logger.debug("这是UserService-debug日志...");

        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别
        logger.info("这是UserService-info日志...");
        logger.warn("这是UserService-warn日志...");
        logger.error("这是UserService-error日志...");
    }
}
