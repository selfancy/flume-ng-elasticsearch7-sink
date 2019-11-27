package org.apache.flume.sink.elasticsearch;

import org.apache.commons.lang.StringUtils;
import org.apache.flume.Event;
import org.apache.flume.event.SimpleEvent;
import org.apache.flume.formatter.output.BucketPath;

import java.util.Map;

/**
 * Created by mike on 2019-11-25
 */
final class IndexNameEvent extends SimpleEvent {

    private final String indexName;

    private final Event event;

    IndexNameEvent(String indexName, Event event) {
        setBody(event.getBody());
        final Map<String, String> headers = event.getHeaders();
        String application = headers.get("application");
        if (StringUtils.isBlank(application)) {
            application = headers.get("@application");
        }
        if (StringUtils.isBlank(application)) {
            application = indexName;
        }
        this.indexName = application;
        this.event = event;
    }

    String getIndexName() {
        return BucketPath.escapeString(indexName, event.getHeaders());
    }
}
