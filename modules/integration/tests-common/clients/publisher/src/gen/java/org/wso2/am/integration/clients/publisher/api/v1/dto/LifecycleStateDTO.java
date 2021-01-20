/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.publisher.api.v1.dto.LifecycleStateAvailableTransitionsDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.LifecycleStateCheckItemsDTO;

/**
 * LifecycleStateDTO
 */

public class LifecycleStateDTO {
  @SerializedName("state")
  private String state = null;

  @SerializedName("checkItems")
  private List<LifecycleStateCheckItemsDTO> checkItems = null;

  @SerializedName("availableTransitions")
  private List<LifecycleStateAvailableTransitionsDTO> availableTransitions = null;

  public LifecycleStateDTO state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "Created", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LifecycleStateDTO checkItems(List<LifecycleStateCheckItemsDTO> checkItems) {
    this.checkItems = checkItems;
    return this;
  }

  public LifecycleStateDTO addCheckItemsItem(LifecycleStateCheckItemsDTO checkItemsItem) {
    if (this.checkItems == null) {
      this.checkItems = new ArrayList<>();
    }
    this.checkItems.add(checkItemsItem);
    return this;
  }

   /**
   * Get checkItems
   * @return checkItems
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStateCheckItemsDTO> getCheckItems() {
    return checkItems;
  }

  public void setCheckItems(List<LifecycleStateCheckItemsDTO> checkItems) {
    this.checkItems = checkItems;
  }

  public LifecycleStateDTO availableTransitions(List<LifecycleStateAvailableTransitionsDTO> availableTransitions) {
    this.availableTransitions = availableTransitions;
    return this;
  }

  public LifecycleStateDTO addAvailableTransitionsItem(LifecycleStateAvailableTransitionsDTO availableTransitionsItem) {
    if (this.availableTransitions == null) {
      this.availableTransitions = new ArrayList<>();
    }
    this.availableTransitions.add(availableTransitionsItem);
    return this;
  }

   /**
   * Get availableTransitions
   * @return availableTransitions
  **/
  @ApiModelProperty(value = "")
  public List<LifecycleStateAvailableTransitionsDTO> getAvailableTransitions() {
    return availableTransitions;
  }

  public void setAvailableTransitions(List<LifecycleStateAvailableTransitionsDTO> availableTransitions) {
    this.availableTransitions = availableTransitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleStateDTO lifecycleState = (LifecycleStateDTO) o;
    return Objects.equals(this.state, lifecycleState.state) &&
        Objects.equals(this.checkItems, lifecycleState.checkItems) &&
        Objects.equals(this.availableTransitions, lifecycleState.availableTransitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, checkItems, availableTransitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleStateDTO {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    checkItems: ").append(toIndentedString(checkItems)).append("\n");
    sb.append("    availableTransitions: ").append(toIndentedString(availableTransitions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

