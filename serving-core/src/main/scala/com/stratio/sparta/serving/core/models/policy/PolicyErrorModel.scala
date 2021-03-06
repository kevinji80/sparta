/*
 * Copyright (C) 2015 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.sparta.serving.core.models.policy

import java.util.Date

object PhaseEnum extends Enumeration {
  val Input = Value("Input")
  val InputStream = Value("InputStream")
  val Parser = Value("Parser")
  val Operator = Value("Operator")
  val Cube = Value("Cube")
  val CubeStream = Value("CubeStream")
  val Output = Value("Output")
  val Trigger = Value("Trigger")
  val TriggerStream = Value("TriggerStream")
  val Execution = Value("Execution")
  val RawData = Value("RawData")
}

case class PolicyErrorModel(
                             message: String,
                             phase: PhaseEnum.Value,
                             originalMsg: String,
                             date: Date = new Date
                           )
