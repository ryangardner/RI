/**
 *  Copyright 2011 Terracotta, Inc.
 *  Copyright 2011 Oracle America Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package javax.cache.annotation.impl;

/**
 * Base class for cache related interceptors
 * 
 * @author Eric Dalquist
 * @version $Revision$
 * @param <I> The intercepted method invocation
 */
public abstract class AbstractCacheInterceptor<I> {
    /**
     * Proceed with the invocation
     * 
     * @param invocation The intercepted invocation
     * @return The value returned by the invocation
     * @throws Throwable The exception thrown by the invocation, if any
     */
    protected abstract Object proceed(I invocation) throws Throwable;

}
