/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.gateway.core.policy;

import io.gravitee.definition.model.Path;
import io.gravitee.gateway.api.Request;

/**
 * This resolver is used to determine the configured {@link Path} from
 * the API definition {@link io.gravitee.definition.model.Api} for the given
 * {@link Request}. By getting this path, the gateway will be able to determine
 * the {@link io.gravitee.definition.model.Rule} to apply for policy chains (request and response).
 *
 * @author David BRASSELY (brasseld at gmail.com)
 */
public interface PathResolver {

    /**
     * The "configured" path of the provided {@link Request}.
     *
     * @param request The current request.
     * @return The "configured" path for current request / call.
     */
    Path resolve(Request request);
}
