package org.zerock.review_service.clients;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import org.zerock.review_service.dto.ProductDetailDTO;
import org.zerock.review_service.exception.ReviewProductNotFoundException;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class ProductClientFallbackFactory implements FallbackFactory<ProductClient> {

  @Override
  public ProductClient create(Throwable cause) {
    return new ProductClient() {
      @Override
      public String helloTime(int time) {
        return "Product Service is not available. Please try again later.";
      }
      @Override
      public ProductDetailDTO getProductDetail(Long productId) {

        log.error("ProductClientFallbackFactory: getProductDetail 호출 실패 - productId: {}, cause: {}", productId, cause.getMessage());
        throw new ReviewProductNotFoundException("Product not found");
      }
    };
  }
}
