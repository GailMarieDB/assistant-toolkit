/*
 Copyright 2024 IBM Corporation

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.ibm.watson.conversationalskills.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SessionHistoryMessage
 */
@JsonPropertyOrder({
  SessionHistoryMessage.JSON_PROPERTY_A,
  SessionHistoryMessage.JSON_PROPERTY_U,
  SessionHistoryMessage.JSON_PROPERTY_N
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class SessionHistoryMessage {
  public static final String JSON_PROPERTY_A = "a";
  private String a;

  public static final String JSON_PROPERTY_U = "u";
  private String u;

  public static final String JSON_PROPERTY_N = "n";
  private Boolean n;

  public SessionHistoryMessage() {
  }

  public SessionHistoryMessage a(String a) {
    
    this.a = a;
    return this;
  }

  /**
   * Assistant message
   * @return a
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getA() {
    return a;
  }


  @JsonProperty(JSON_PROPERTY_A)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setA(String a) {
    this.a = a;
  }

  public SessionHistoryMessage u(String u) {
    
    this.u = u;
    return this;
  }

  /**
   * User message
   * @return u
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getU() {
    return u;
  }


  @JsonProperty(JSON_PROPERTY_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setU(String u) {
    this.u = u;
  }

  public SessionHistoryMessage n(Boolean n) {
    
    this.n = n;
    return this;
  }

  /**
   * true value indicates if it is a new conversation
   * @return n
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getN() {
    return n;
  }


  @JsonProperty(JSON_PROPERTY_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setN(Boolean n) {
    this.n = n;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionHistoryMessage sessionHistoryMessage = (SessionHistoryMessage) o;
    return Objects.equals(this.a, sessionHistoryMessage.a) &&
        Objects.equals(this.u, sessionHistoryMessage.u) &&
        Objects.equals(this.n, sessionHistoryMessage.n);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, u, n);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionHistoryMessage {\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    u: ").append(toIndentedString(u)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

