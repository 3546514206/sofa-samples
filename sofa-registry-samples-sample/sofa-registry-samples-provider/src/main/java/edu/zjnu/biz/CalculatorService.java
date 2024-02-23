package edu.zjnu.biz;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import edu.zjnu.ICalculatorService;
import org.springframework.stereotype.Service;

/**
 * @author 杨海波
 * @date 2024/1/23 16:51
 * @description TODO
 */
@SofaService(interfaceType = ICalculatorService.class, bindings = {@SofaServiceBinding(bindingType = "bolt")})
@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}