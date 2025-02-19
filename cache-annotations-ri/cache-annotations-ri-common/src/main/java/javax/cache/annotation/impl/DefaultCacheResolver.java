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

import java.lang.annotation.Annotation;

import javax.cache.Cache;
import javax.cache.annotation.CacheInvocationContext;
import javax.cache.annotation.CacheResolver;

/**
 * @author Eric Dalquist
 * @version $Revision$
 */
public class DefaultCacheResolver implements CacheResolver {
    private final Cache<Object, Object> cache;

    /**
     * Create a new default cache resolver that always returns the specified cache
     * 
     * @param cache The cache to return for all calls to {@link #resolveCache(CacheInvocationContext)}
     */
    public DefaultCacheResolver(Cache<Object, Object> cache) {
        if (cache == null) {
            throw new IllegalArgumentException("The Cache can not be null");
        }
        
        this.cache = cache;
    }

    /* (non-Javadoc)
     * @see javax.cache.annotation.CacheResolver#resolveCache(javax.cache.annotation.CacheInvocationContext)
     */
    @Override
    @SuppressWarnings("unchecked")
    public <K, V> Cache<K, V> resolveCache(CacheInvocationContext<? extends Annotation> cacheInvocationContext) {
        return (Cache<K, V>)this.cache;
    }
}
