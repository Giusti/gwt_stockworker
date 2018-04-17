package com.google.gwt.sample.stockwatcher.server;

import com.google.gwt.sample.stockwatcher.client.stockwatcherService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class stockwatcherServiceImpl extends RemoteServiceServlet implements stockwatcherService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}