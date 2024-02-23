package edu.zjnu.biz;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import edu.zjnu.IPongService;
import org.springframework.stereotype.Service;

/**
 * @author 杨海波
 * @date 2024/2/4 16:42
 * @description IPongService
 */
@SofaService(interfaceType = IPongService.class, bindings = {@SofaServiceBinding(bindingType = "bolt")}, uniqueId = "pongService")
@Service
public class PongService implements IPongService {

    @Override
    public String pong(String request) {
        if (request != null) {
            return "pong";
        }

        return null;
    }
}
