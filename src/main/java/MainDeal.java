import cn.hutool.cron.CronUtil;
import cn.hutool.cron.task.Task;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import cn.hutool.log.StaticLog;

/**
 * @author duzj
 * @create 2019-01-07 14:22
 */
public class MainDeal {
   static Log log = LogFactory.get();

    public static void main(String[] args) {
        CronUtil.schedule("*/2 * * * * *", new Task() {
            public void execute() {
                log.info("测试");
            }
        });

        // 支持秒级别定时任务
        CronUtil.setMatchSecond(true);
        CronUtil.start();
    }
}
