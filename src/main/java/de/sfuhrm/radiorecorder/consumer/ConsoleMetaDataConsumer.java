/*
 * Copyright 2017 Stephan Fuhrmann.
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
package de.sfuhrm.radiorecorder.consumer;

import de.sfuhrm.radiorecorder.metadata.MetaData;
import java.text.DateFormat;
import java.util.Date;
import java.util.function.Consumer;

/**
 * Consumer that prints the current title on the console.
 * @author Stephan Fuhrmann
 */
class ConsoleMetaDataConsumer implements Consumer<MetaData> {

    @Override
    public void accept(MetaData md) {
        StringBuilder builder = new StringBuilder();
        
        Date now = new Date();
        DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT);
        
        builder.append(dateFormat.format(now));
        builder.append(": ");
        
        md.getArtist().ifPresent(t -> builder.append(t));
        md.getTitle().ifPresent(t -> builder.append(" - ").append(t));
        md.getStationName().ifPresent(t -> builder.append(" - ").append(t));

        System.err.println(builder.toString());
    }
    
}
