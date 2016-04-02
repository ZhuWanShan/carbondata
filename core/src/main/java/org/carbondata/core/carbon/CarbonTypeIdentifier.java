/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.carbondata.core.carbon;

import org.carbondata.core.constants.CarbonCommonConstants;

/**
 * Identifier class which will hold the table qualified name
 */
public class CarbonTypeIdentifier {

    /**
     * database name
     */
    private String databaseName;

    /**
     * table name
     */
    private String tableName;

    /**
     * table qualified name which will include db name and table name
     */
    private String tableQualifiedName;

    /**
     * constructor
     */
    public CarbonTypeIdentifier(String databaseName, String tableName) {
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.tableQualifiedName =
                databaseName + databaseName + CarbonCommonConstants.UNDERSCORE + tableName;
    }

    /**
     * return database name
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * return table name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method will return the full qualified table name
     */
    public String getTableQualifiedName() {
        return tableQualifiedName;
    }
}
