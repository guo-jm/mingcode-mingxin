package com.mingcode;

import com.mingcode.netty.WSServer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author GuoJiaming
 * @version 1.0
 */

@Component
public class NettyBooter implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(event.getApplicationContext().getParent()==null){
            try {
                WSServer.getInstance().start();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
