package com.javaer.modules.websocket.servcer;

import cn.hutool.core.date.DateUtil;
//import com.xkcoding.websocket.common.WebSocketConsts;
//import com.xkcoding.websocket.model.Server;
//import com.xkcoding.websocket.payload.ServerVO;
//import com.xkcoding.websocket.util.ServerUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @description: 服务器定时推送任务
 * @author:
 * @date:
 * @version: V1.0
 * @modified:
 */
@Slf4j
@Component
public class ServerTask {
//    @Autowired
//    private SimpMessagingTemplate wsTemplate;

    @Resource
//    private WebSocket webSocket;

    /**
     * 按照标准时间来算，每隔 2s 执行一次
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void websocket() throws Exception {
        log.info("【推送消息】开始执行：{}", DateUtil.formatDateTime(new Date()));
//        wsTemplate.convertAndSend(WebSocketConsts.PUSH_SERVER, "1");
//        wsTemplate.convertAndSend("2");
//        webSocket.sendAllMessage(DateUtil.formatDateTime(new Date()));
        log.info("【推送消息】执行结束：{}", DateUtil.formatDateTime(new Date()));
    }
}
