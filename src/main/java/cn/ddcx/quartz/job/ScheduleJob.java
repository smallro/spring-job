package cn.ddcx.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerContext;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

/**
 * Created by Intellij IDEA
 * User: wr
 * Date: 2018/6/14
 */
public class ScheduleJob extends QuartzJobBean {

    private final Logger logger = LoggerFactory.getLogger(ScheduleJob.class);

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("kldsjlsakdjaaaaaaa.................");
        SchedulerContext context = null;
        try {
            context = jobExecutionContext.getScheduler().getContext();
            List list = (List) context.get("list");
            for (Object item : list)
                System.out.println(item.getClass().toString() + " - " + item);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
