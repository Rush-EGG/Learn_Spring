package com.Egg.spring.durationOfBean;

public class Order {
    private String oname;

    public Order() {
        System.out.println("第一步 无参构造创建bean实例");
    }

    public void setOname(String oname) {
        System.out.println("第二步 set方法设置oname值");
        this.oname = oname;
    }

    // 创建执行初始化的方法
    public void initMethod(){
        System.out.println("第三步 调用初始化方法");
    }

    // 创建销毁方法
    public void destroyMethod(){
        System.out.println("第五步 调用销毁方法");
    }
}
