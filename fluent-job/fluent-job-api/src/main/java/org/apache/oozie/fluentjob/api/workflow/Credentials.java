/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.oozie.fluentjob.api.workflow;

import com.google.common.collect.ImmutableList;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

import java.util.List;

/**
 * Represents the {@code <credentials>} element and its siblings inside workflow XML / XSD.
 * <p>
 * By assigning non-{@code null} field values, the resulting parent {@code <workflow>} will have its
 * optional {@code <credentials>} element and its siblings filled.
 * <p>
 * This class is used only as part of a {@link org.apache.oozie.fluentjob.api.workflow.Workflow}, isn't
 * to be used alone with Jobs API.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public class Credentials {
    private final ImmutableList<Credential> credentials;

    public Credentials(final ImmutableList<Credential> credentials) {
        this.credentials = credentials;
    }

    public List<Credential> getCredentials() {
        return credentials;
    }
}