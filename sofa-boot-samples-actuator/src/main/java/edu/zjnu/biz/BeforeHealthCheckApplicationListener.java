package edu.zjnu.biz;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author 杨海波
 * @date 2024/2/1 15:43
 * @description BeforeHealthCheckApplicationListener
 */
public class BeforeHealthCheckApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        // 3.x 的版本已经不支持 SofaBootBeforeHealthCheckEvent
        // if(event instanceof SofaBootBeforeHealthCheckEvent){
        //
        // }
    }
}
