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

import javax.cache.spi.AnnotationProvider;

/**
 * Implements the annotations SPI
 * 
 * @author Eric Dalquist
 * @version $Revision$
 */
public class AnnotationProviderImpl implements AnnotationProvider {
    private static volatile boolean annotationsInitialized;
    
    /**
     * Used by {@link AbstractCacheLookupUtil} to signal that it has been created;
     */
    protected static void setAnnotationsInitialized() {
        annotationsInitialized = true;
    }

    @Override
    public boolean isSupported() {
        return annotationsInitialized;
    }

}
