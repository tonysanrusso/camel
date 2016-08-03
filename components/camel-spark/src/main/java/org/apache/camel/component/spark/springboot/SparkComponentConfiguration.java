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
package org.apache.camel.component.spark.springboot;

import org.apache.camel.component.spark.RddCallback;
import org.apache.spark.api.java.JavaRDDLike;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The spark component can be used to send RDD or DataFrame jobs to Apache Spark
 * cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.spark")
public class SparkComponentConfiguration {

    /**
     * RDD to compute against.
     */
    private JavaRDDLike rdd;
    /**
     * Function performing action against an RDD.
     */
    private RddCallback rddCallback;

    public JavaRDDLike getRdd() {
        return rdd;
    }

    public void setRdd(JavaRDDLike rdd) {
        this.rdd = rdd;
    }

    public RddCallback getRddCallback() {
        return rddCallback;
    }

    public void setRddCallback(RddCallback rddCallback) {
        this.rddCallback = rddCallback;
    }
}