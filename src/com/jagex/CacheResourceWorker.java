package com.jagex;/* CacheResourceWorker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheResourceWorker implements Runnable {
    boolean stopped;
    Thread thread;
    int remaining;
    CircularDoubleLinkedList requests = new CircularDoubleLinkedList();

    public CacheResourceWorker() {
        this.remaining = 0;
        this.stopped = false;
        this.thread = new Thread(this);
        this.thread.setDaemon(true);
        this.thread.start();
        this.thread.setPriority(1);
    }

    CacheRequest requestRead(int i, ResourceCache cache) {
        CacheRequest request = new CacheRequest();
        request.type = -745165359;
        request.cachedKey = (long) i * 1476940603538232441L;
        request.cache = cache;
        request.highPriority = false;
        addRequest(request);
        return request;
    }

    CacheRequest priorityRead(int file, ResourceCache cache) {
        CacheRequest request = new CacheRequest();
        request.type = -248388453;
        synchronized (this.requests) {
            for (CacheRequest next = ((CacheRequest) this.requests.first()); next != null; next = ((CacheRequest) this.requests.next())) {
                if ((long) file == (-5533549728640346679L * next.cachedKey) && cache == (next.cache) && -1906220653 * (next.type) == 2) {
                    request.data = next.data;
                    request.waiting = false;
                    CacheRequest neededRequest = request;
                    return neededRequest;
                }
            }
        }
        request.data = cache.read(file);
        request.waiting = false;
        request.highPriority = true;
        return request;
    }

    CacheRequest requestWrite(int file, byte[] data, ResourceCache cache) {
        CacheRequest request = new CacheRequest();
        request.type = -496776906;
        request.cachedKey = 1476940603538232441L * (long) file;
        request.data = data;
        request.cache = cache;
        request.highPriority = false;
        addRequest(request);
        return request;
    }

    void addRequest(CacheRequest request) {
        synchronized (this.requests) {
            this.requests.offer(request);
            this.remaining += 872113935;
            this.requests.notifyAll();
        }
    }

    public void run() {
        while (!this.stopped) {
            CacheRequest request;
            synchronized (this.requests) {
                request = ((CacheRequest) this.requests.poll());
                if (request != null)
                    this.remaining -= 872113935;
                else {
                    try {
                        this.requests.wait();
                    } catch (InterruptedException interruptedexception) {
                            /* empty */
                    }
                    continue;
                }
            }
            try {
                if (-1906220653 * request.type == 2)
                    request.cache.write((int) (request.cachedKey * -5533549728640346679L), request.data, (request.data).length, 267663991);
                else if (3 == (request.type * -1906220653))
                    request.data = (request.cache.read((int) (-5533549728640346679L * request.cachedKey)));
            } catch (Exception exception) {
                IPAddress.reportError(null, exception);
            }
            request.waiting = false;
        }
    }

    public void stop() {
        this.stopped = true;
        synchronized (this.requests) {
            this.requests.notifyAll();
        }
        try {
            this.thread.join();
        } catch (InterruptedException interruptedexception) {
				/* empty */
        }
        this.thread = null;
    }

}
