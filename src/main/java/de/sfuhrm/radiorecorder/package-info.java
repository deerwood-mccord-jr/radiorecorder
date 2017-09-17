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

/**
 * A Internet radio recorder program. 
 * Holds the classes for setting up the program.
 * {@link Main} is the main class that is started by the JVM.
 * It holds in {@link Params} the command line parameters.
 * For each station url given in the command line a
 * {@link RadioRunnable} is started to process the urls and streams.
 * @author Stephan Fuhrmann
 */
package de.sfuhrm.radiorecorder;
