/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch.cat;

import org.opensearch.clients.opensearch._types.ErrorResponse;
import org.opensearch.clients.transport.Endpoint;
import org.opensearch.clients.transport.endpoints.SimpleEndpoint;

import java.util.HashMap;
import java.util.Map;

// typedef: cat.master.Request

/**
 * Returns information about the master node.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/cat/master/CatMasterRequest.ts#L22-L27">API
 *      specification</a>
 */

public class MasterRequest extends CatRequestBase {
	public MasterRequest() {
	}

	/**
	 * Singleton instance for {@link MasterRequest}.
	 */
	public static final MasterRequest _INSTANCE = new MasterRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.master}".
	 */
	public static final Endpoint<MasterRequest, MasterResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.master",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/master";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				return params;

			}, SimpleEndpoint.emptyMap(), false, MasterResponse._DESERIALIZER);
}