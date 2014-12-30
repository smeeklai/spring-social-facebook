/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.facebook.api;

import java.util.List;

/**
 * Interface defining operations for querying Facebook with the Facebook Query Language (FQL).
 * See https://developers.facebook.com/docs/reference/fql/ for details on FQL.
 * @author habuma
 * @deprecated Facebook API versions after 2.0 will no longer support FQL
 */
@Deprecated
public interface FqlOperations {

	/**
	 * Performs an FQL query, returning a list of results mapped by an {@link FqlResultMapper}.
	 * @param fql the FQL query
	 * @param mapper an {@link FqlResultMapper} used to map the results to specific object types
	 * @param <T> the Java type to bind the result objects to
	 * @return a list of objects of type specified by the given {@link FqlResultMapper}
	 */
	<T> List<T> query(String fql, FqlResultMapper<T> mapper);
	
}