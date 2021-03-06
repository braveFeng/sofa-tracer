/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.tracer.boot.zipkin.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ZipkinSofaTracerProperties
 *
 * @author yangguanchao
 * @since 2018/05/01
 */
@ConfigurationProperties("com.alipay.sofa.tracer.zipkin")
public class ZipkinSofaTracerProperties {

    /**
     * URL of the zipkin query server instance.
     */
    private String      baseUrl       = "http://localhost:9411/";
    private boolean     enabled       = true;
    private int         flushInterval = 1;
    private Compression compression   = new Compression();

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public int getFlushInterval() {
        return this.flushInterval;
    }

    public Compression getCompression() {
        return this.compression;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setFlushInterval(int flushInterval) {
        this.flushInterval = flushInterval;
    }

    public void setCompression(Compression compression) {
        this.compression = compression;
    }

    /**
     * When enabled, spans are gzipped before sent to the zipkin server
     */
    public static class Compression {

        private boolean enabled = false;

        public boolean isEnabled() {
            return this.enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
    }
}
