/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.ipojo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * This annotation is used to configure a handler through XML (as in {@literal metadata.xml}).
 * <pre>
 *     {@linkplain org.apache.felix.ipojo.annotations.Component @Component}
 *     {@code @HandlerDeclaration("<ns:my-handler attribute='value' xmlns:ns='http://www.acme.com/ipojo/ns'/>")}
 *     public class MyComponent {
 *         // ...
 *     }
 * </pre>
 * @author <a href="mailto:dev@felix.apache.org">Felix Project Team</a>
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
public @interface HandlerDeclaration {

    /**
     * The content of this attribute represents the XML 
     * that would be used in the metadata.xml.
     * It must be a root XML Element, namespaces are allowed and so for child elements.
     */
    String value();
}
