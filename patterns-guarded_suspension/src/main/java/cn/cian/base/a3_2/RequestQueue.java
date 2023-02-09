package cn.cian.base.a3_2;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Queue;

@Slf4j
public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();

    public synchronized Request getRequest() {
        while (queue.peek() == null) {
            try {
                log.info("  wait() begins, queue = " + queue);
                wait();
                log.info("  wait() ends,   queue = " + queue);
            } catch (InterruptedException e) {
            }
        }
        return queue.remove();
    }

    public synchronized void putRequest(Request request) {
        queue.offer(request);
        log.info(" notifyAll() begins, queue = " + queue);
        notifyAll();
        log.info(" notifyAll() ends, queue = " + queue);
    }
}