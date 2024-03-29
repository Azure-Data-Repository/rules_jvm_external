// Copyright 2019 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package rules.jvm.external;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import rules.jvm.external.AddressBookProtos.Person;

public class Main {
  public static void main(String[] args) throws InvalidProtocolBufferException {
    System.out.println(JsonFormat.printer().print(makePerson(123, "John Doe")));
  }

  public static Person makePerson(Integer id, String name) {
    Person.Builder person = Person.newBuilder();
    person.setId(id);
    person.setName(name);
    return person.build();
  }
}
