package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface stockwatcherServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
