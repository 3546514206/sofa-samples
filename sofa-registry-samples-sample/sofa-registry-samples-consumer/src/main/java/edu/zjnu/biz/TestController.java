package edu.zjnu.biz;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import edu.zjnu.ICalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨海波
 * @date 2024/1/23 17:13
 * @description TestController
 */
@RestController
@RequestMapping("/sofa")
public class TestController {

    @SofaReference(interfaceType = ICalculatorService.class, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private ICalculatorService calculatorService;

    @GetMapping("/cal")
    public Integer result(@RequestParam Integer a, @RequestParam Integer b, @RequestParam Integer c,
                          @RequestParam Integer d, @RequestParam Integer e) {

        // (a+b-c)*d/e
        return calculatorService
                .divide(calculatorService.multiply(calculatorService.sub(calculatorService.add(a, b), c), d), e);
    }
}
