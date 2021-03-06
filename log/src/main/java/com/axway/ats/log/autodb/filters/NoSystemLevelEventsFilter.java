/*
 * Copyright 2017 Axway Software
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.axway.ats.log.autodb.filters;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

import com.axway.ats.log.model.SystemLogLevel;

public class NoSystemLevelEventsFilter extends Filter {

    @Override
    public int decide(
                       LoggingEvent loggingEvent ) {

        if( loggingEvent.getLevel().toInt() == SystemLogLevel.SYSTEM_INT ) {
            return DENY;
        }

        return NEUTRAL;
    }
}
