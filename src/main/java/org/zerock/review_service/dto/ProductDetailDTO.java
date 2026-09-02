package org.zerock.review_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductDetailDTO {

 @JsonProperty("pno")
 private Long productId;

 @JsonProperty("pname")
 private String productName;

 @JsonProperty("price")
 private Integer price;
  @JsonProperty("regDate")
 private java.time.LocalDateTime regDate;

}
