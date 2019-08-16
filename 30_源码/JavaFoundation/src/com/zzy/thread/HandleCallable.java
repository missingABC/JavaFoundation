package com.zzy.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



@SuppressWarnings("rawtypes")
public class HandleCallable<E> implements Callable<ResultBean> {
    //private static Log logger = LogFactory.getLog(HandleCallable.class);
    public static Log log = LogFactory.getLog(HandleCallable.class);
    /*private static final String format = "线程：%s,共处理: %s个数据，开始处理......";
    private static final String format1 = "线程：%s,第%s个数据，处理完成";
    private static final String format2 = "线程：%s,共处理: %s个数据，处理完成......";
    private static File file = new File("D:\\test\\read.txt");*/
    
    // 线程名称 
    private String threadName = "";
    // 需要处理的数据
    private List<E> data;
    // 辅助参数
    private Map<String, Object> params;
    // 具体执行任务
    private ITask<ResultBean<String>, E> task;

    public HandleCallable(String threadName, List<E> data, Map<String, Object> params,
            ITask<ResultBean<String>, E> task) {
        this.threadName = threadName;
        this.data = data;
        this.params = params;
        this.task = task;
    }
    
    @Override
    public ResultBean<List<ResultBean<String>>> call() throws Exception {
        // 该线程中所有数据处理返回结果
        ResultBean<List<ResultBean<String>>> resultBean = ResultBean.newInstance();
        if (data != null && data.size() > 0) {
            log.info("线程：{},共处理:{}个数据，开始处理......", threadName, data.size());
            // 返回结果集
            List<ResultBean<String>> resultList = new ArrayList<>();
            // 循环处理每个数据
            for (int i = 0; i < data.size(); i++) {
                // 需要执行的数据
                E e = data.get(i);
                // 将数据执行结果加入到结果集中
                resultList.add(task.execute(e, params));
                log.info("线程：{},第{}个数据，处理完成", threadName, (i + 1));
               
            }
            logger.info("线程：{},共处理:{}个数据，处理完成......", threadName, data.size());
            resultBean.setData(resultList);
        }
        return resultBean;
    }

}
