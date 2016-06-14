/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.model.remote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.spi.Metadata;

/**
 * Etcd remote service call configuration
 */
@Metadata(label = "eip,routing,remote")
@XmlRootElement(name = "etcdConfiguration")
@XmlAccessorType(XmlAccessType.FIELD)
public class EtcdConfigurationDefinition extends ServiceCallConfigurationDefinition {
    @XmlAttribute
    private String uris;
    @XmlAttribute @Metadata(label = "security")
    private String userName;
    @XmlAttribute @Metadata(label = "security")
    private String password;
    @XmlAttribute
    private Long timeout;
    @XmlAttribute @Metadata(defaultValue = "/services/")
    private String servicePath = "/services/";

    public EtcdConfigurationDefinition() {
    }

    public EtcdConfigurationDefinition(ServiceCallDefinition parent) {
        super(parent);
    }

    // -------------------------------------------------------------------------
    // Getter/Setter
    // -------------------------------------------------------------------------

    public String getUris() {
        return uris;
    }

    public void setUris(String uris) {
        this.uris = uris;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public String getServicePath() {
        return servicePath;
    }

    public void setServicePath(String servicePath) {
        this.servicePath = servicePath;
    }


    // -------------------------------------------------------------------------
    // Fluent API
    // -------------------------------------------------------------------------

    /**
     * The URIs the client can connect to.
     */
    public EtcdConfigurationDefinition uris(String uris) {
        setUris(uris);
        return this;
    }

    /**
     * The user name to use for basic authentication.
     */
    public EtcdConfigurationDefinition userName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * The password to use for basic authentication.
     */
    public EtcdConfigurationDefinition password(String password) {
        setPassword(password);
        return this;
    }

    /**
     * To set the maximum time an action could take to complete.
     */
    public EtcdConfigurationDefinition timeout(Long timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * The path to look for for service discovery
     */
    public EtcdConfigurationDefinition servicePath(String servicePath) {
        setServicePath(servicePath);
        return this;
    }
}