package com.helpers.testData;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
// TODO: 15.05.2023 When Update to JDK 14 version,use record.
public class User {

    String userName;
    String password;
}
