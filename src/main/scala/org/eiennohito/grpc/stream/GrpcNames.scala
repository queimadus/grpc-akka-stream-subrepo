/*
 * Copyright 2016 eiennohito (Tolmachev Arseny)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eiennohito.grpc.stream

import com.trueaccord.scalapb.grpc.{AbstractService, ServiceCompanion}
import io.grpc.MethodDescriptor


/**
  * @author eiennohito
  * @since 2016/05/04
  */
object GrpcNames {
  def svcName(md: MethodDescriptor[_, _]): String = {
    MethodDescriptor.extractFullServiceName(md.getFullMethodName)
  }

  def svcName(svc: ServiceCompanion[_]): String = {
    svc.descriptor.getFullName
  }

  def svcName[T <: AbstractService](svc: T)(implicit sc: ServiceCompanion[T]): String = svcName(sc)
}
