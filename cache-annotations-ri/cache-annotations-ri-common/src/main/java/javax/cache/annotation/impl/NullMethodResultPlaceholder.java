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


import java.io.Serializable;

/**
 * This object is used as a placeholder when using an annotation around
 * a method that returns a null result.
 *
 * @author Ryan Gardner
 */
public final class NullMethodResultPlaceholder implements Serializable {

    /**
     * Singleton instance that is used as a null placeholder.
     * <p/>
     * JSR107 does not allow null values to be cached. Methods in java can return
     * null results. This placeholder allows methods wrapped with @CacheResult to
     * store the null return value of the method in a deliberate way.
     */
    public static final NullMethodResultPlaceholder NULL = new NullMethodResultPlaceholder();

    private static final long serialVersionUID = 1L;

    /**
     * Ensure singleton.
     *
     * @return the singleton value
     */
    private Object readResolve() {
        return NullMethodResultPlaceholder.NULL;
    }
}
