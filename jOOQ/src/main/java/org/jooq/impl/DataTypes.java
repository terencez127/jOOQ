/**
 * Copyright (c) 2009-2016, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.jooq.DataType;

/**
 * A central {@link DataType} registry
 *
 * @author Lukas Eder
 */
final class DataTypes {

    private static final Map<String, Class<?>>          UDT_RECORDS = new HashMap<String, Class<?>>();

    // ------------------------------------------------------------------------
    // XXX: Public API used for initialisation from generated artefacts
    // (this may be rendered public in the future)
    // ------------------------------------------------------------------------

    /**
     * Register a type mapping for a UDT
     * <p>
     * This registers a Java type for a given UDT as expected in various JDBC
     * methods, such as {@link Connection#setTypeMap(Map)},
     * {@link ResultSet#getObject(int, Map)}, {@link Array#getArray(Map)},
     * {@link CallableStatement#getObject(int, Map)}, etc.
     */
    static final synchronized void registerUDTRecord(String name, Class<?> type) {

        // A mapping can be registered only once
        if (!UDT_RECORDS.containsKey(name)) {
            UDT_RECORDS.put(name, type);
        }
    }


    // ------------------------------------------------------------------------
    // XXX: Internal API
    // ------------------------------------------------------------------------

    static final Map<String, Class<?>> udtRecords() {
        return Collections.unmodifiableMap(UDT_RECORDS);
    }

    /**
     * No instances
     */
    private DataTypes() {}
}
