package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("stockwatcherService")
public interface stockwatcherService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use stockwatcherService.App.getInstance() to access static instance of stockwatcherServiceAsync
     */
    public static class App {
        private static stockwatcherServiceAsync ourInstance = GWT.create(stockwatcherService.class);

        public static synchronized stockwatcherServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
