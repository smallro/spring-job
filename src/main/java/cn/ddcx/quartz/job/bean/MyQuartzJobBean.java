package cn.ddcx.quartz.job.bean;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by Intellij IDEA
 * User: wr
 * Date: 2018/6/15
 */
public class MyQuartzJobBean extends QuartzJobBean {
    private static final Logger logger = LoggerFactory.getLogger(MyQuartzJobBean.class);

    int count =0;

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        count++;
        logger.info("===========MyQuartzJobBean runTask(),count:"+count);
    }
}
