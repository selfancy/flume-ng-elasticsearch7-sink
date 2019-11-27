# Flume 1.8.0 supporting ElasticSearch 7.4.2
Base on: https://github.com/kitttyHappy/flume-ng-elasticsearch6-sink

This version of the Flume ElasticSearch sink works with ElasticSearch 7.4.2
but to do so, **some libraries used by Flume had to be updated to the newest
versions**,  **For this reason, many tests do not work retuning a pretty "jar
hell" exception.**

As Flume is packaged right now (sink and flume libraries in the  same class 
loader) seems difficult to find another solution. The best way, without
modifying Flume, would be a new ElasticSearch sink based on http API and 
built on top of a reactive framework.

## Modifications to your Flume lib path:
    
### Libraries to be added:
##### this project
- flume-ng-elasticsearch7-sink-1.8.0.jar

##### common library
- guava-11.0.2.jar
- hppc-0.8.1.jar
- httpclient-4.2.1.jar
- httpcore-4.2.1.jar
- jackson-core-2.9.5.jar
- jackson-databind-2.9.5.jar
- jackson-dataformat-smile-2.8.11.jar
- jackson-dataformat-yaml-2.8.11.jar
- joda-time-2.9.9.jar
- lang-mustache-client-7.4.2.jar
- t-digest-3.2.jar
- parent-join-client-7.4.2.jar
- percolator-client-7.4.2.jar
- snakeyaml-1.17.jar

#### netty library
- netty-3.9.4.Final.jar
- netty-buffer-4.1.38.Final.jar
- netty-codec-4.1.38.Final.jar
- netty-common-4.1.38.Final.jar
- netty-handler-4.1.38.Final.jar
- netty-resolver-4.1.38.Final.jar
- netty-transport-4.1.38.Final.jar
- transport-7.4.2.jar
- transport-netty4-client-7.4.2.jar

##### elasticsearch-7.4.2, plugins & dependencies
- elasticsearch-7.4.2.jar
- elasticsearch-cli-7.4.2.jar
- elasticsearch-core-7.4.2.jar
- elasticsearch-ssl-config-7.4.2.jar
- elasticsearch-x-content-7.4.2.jar
- lucene-core-8.2.0.jar
- lucene-highlighter-8.2.0.jar
- lucene-join-8.2.0.jar
- lucene-misc-8.2.0.jar
- lucene-queries-8.2.0.jar
- lucene-queryparser-8.2.0.jar
- lucene-sandbox-8.2.0.jar
- reindex-client-7.4.2.jar

##### transportClient dependencies
- transport-6.2.4.jar
- transport-netty4-client-5.0.0.jar
- netty-3.9.4.Final.jar
- netty-buffer-4.1.16.Final.jar
- netty-codec-4.1.16.Final.jar
- netty-common-4.1.16.Final.jar
- netty-resolver-4.1.16.Final.jar
- netty-handler-4.1.16.Final.jar
- netty-transport-4.1.16.Final.jar

##### log4j2 dependencies
- log4j-1.2.17.jar
- log4j-api-2.9.1.jar
- log4j-core-2.9.1.jar

#### avro dependencies
- jackson-dataformat-cbor-2.8.11.jar

### Libraries to be removed:
- flume-ng-elasticsearch-sink-1.8.0.jar
