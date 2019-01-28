package top.wordcount.java.concurrent.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class TestThread {
    public static void main(String[] args) {
        ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = mxBean.dumpAllThreads(false, false);
        for(ThreadInfo threadInfo:threadInfos){
            System.out.println(threadInfo.getThreadId()+"|"+threadInfo.getThreadName());
        }
    }
}
