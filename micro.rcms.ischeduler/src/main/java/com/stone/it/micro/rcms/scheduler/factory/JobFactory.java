package com.stone.it.micro.rcms.scheduler.factory;

import javax.annotation.Resource;
import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author cj.stone
 * @Date 2023/7/18
 * @Desc
 */
@Component
public class JobFactory extends AdaptableJobFactory {
  @Resource
  private AutowireCapableBeanFactory capableBeanFactory;

  @Override
  protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
    //调用父类的方法
    Object jobInstance = super.createJobInstance(bundle);
    //进行注入
    capableBeanFactory.autowireBean(jobInstance);
    return jobInstance;
  }
}