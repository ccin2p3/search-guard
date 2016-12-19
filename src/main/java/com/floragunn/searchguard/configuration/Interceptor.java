/*
 * Copyright 2015 floragunn UG (haftungsbeschränkt)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.floragunn.searchguard.configuration;

import java.util.Set;

import org.elasticsearch.action.ActionRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.cluster.ClusterState;
import org.elasticsearch.cluster.metadata.IndexNameExpressionResolver;
import org.elasticsearch.common.settings.Settings;

import com.floragunn.searchguard.user.User;

public class Interceptor {

    public Interceptor() {

    }

    public void applyMultiTenancy(ActionRequest request, final User user, final String tenant, String action, Set<String> requestedResolvedIndices, Settings config, Client client) {
    }
    
    public boolean applyIndexReduce(ActionRequest request, String action, Set<PrivilegesEvaluator.IndexType> leftOvers, ClusterState cs, IndexNameExpressionResolver resolver) {
       return false;   
    }
}
