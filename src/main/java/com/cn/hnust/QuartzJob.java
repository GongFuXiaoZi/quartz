package com.cn.hnust;

import org.springframework.stereotype.Component;

@Component(value="quartzJob")
public class QuartzJob {
	public void work() {
        System.out.println("Quartz��������ȣ�����");
    }
}
