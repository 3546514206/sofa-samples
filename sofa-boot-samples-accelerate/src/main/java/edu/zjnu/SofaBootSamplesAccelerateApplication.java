package edu.zjnu;

import edu.zjnu.biz.TimeWasteBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 杨海波
 * @date 2024/2/1 18:33
 * @description SofaBootSamplesAccelerateApplication
 * <p>
 * 在实际使用 Spring/Spring Boot 开发中，会有一些 Bean 在初始化过程中执行准备操作，如拉取远程配置、初始化数据源等等；在应用启动期间，这类 Bean 会增加 Spring 上下文刷新时间，
 * 导致应用启动耗时变长。为了加速应用启动，SOFABoot 通过配置可选项，将 Bean 的初始化方法(init-method) 使用单独线程异步执行，加快 Spring 上下文加载过程，提高应用启动速度。
 * <p>
 * SOFABoot 异步初始化能力提供两个属性配置，用于指定负责异步执行 Bean 初始化方法(init-method)的线程池大小： + com.alipay.sofa.boot.asyncInitBeanCoreSize > 线程池基本大小，
 * 默认值为 CPU 核数加一 + com.alipay.sofa.boot.asyncInitBeanMaxSize > 线程池中允许的最大线程数大小，默认值为 CPU 核数加一
 * <p>
 * 配置可以通过 VM -D 参数或者 Spring Boot 配置文件 application.yml 设置。
 */
@SpringBootApplication
@ImportResource("classpath:application-accelerate.xml")
public class SofaBootSamplesAccelerateApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SofaBootSamplesAccelerateApplication.class, args);
        TimeWasteBean bean = context.getBean(TimeWasteBean.class);
        System.out.println(bean.doSomeThing());
    }
}
