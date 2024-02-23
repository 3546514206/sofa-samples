package edu.zjnu.biz.service;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import edu.zjnu.IPongService;
import org.springframework.stereotype.Service;

/**
 * @author 杨海波
 * @date 2024/2/5 09:02
 * @description PingService
 */
@Service
public class PingService implements IPingService {

    @SofaReference(interfaceType = IPongService.class, binding = @SofaReferenceBinding(bindingType = "bolt", directUrl = "127.0.0.1:12220"), uniqueId = "pongService")
    private IPongService pongService;

    @Override
    public String ping(String request) {
        return pongService.pong("ping");
    }
}
