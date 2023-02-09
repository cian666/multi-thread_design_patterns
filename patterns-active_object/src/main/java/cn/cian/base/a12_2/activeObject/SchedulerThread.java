package cn.cian.base.a12_2.activeObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class SchedulerThread extends Thread {
    private final ActivationQueue queue;

    public SchedulerThread(ActivationQueue queue) {
        this.queue = queue;
    }

    public void invoke(MethodRequest request) {
        queue.putRequest(request);
    }

    public void run() {
        while (true) {
            MethodRequest request = queue.takeRequest();
            request.execute();
        }
    }
}