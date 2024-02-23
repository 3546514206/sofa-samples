package edu.zjnu.biz;

/**
 * @author 杨海波
 * @date 2024/2/1 18:36
 * @description TimeWasteBean
 */
public class TimeWasteBean {

    private void init() throws InterruptedException {

        System.out.println("something waste time!!!");
        Thread.sleep(20000);
        System.out.println("async-init...done!!!");
    }

    public String doSomeThing() {
        return "do some thing";
    }
}
