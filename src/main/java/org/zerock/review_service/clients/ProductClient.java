package org.zerock.review_service.clients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.review_service.dto.ProductDetailDTO;

//product-service의 url은 application.yml에 정의되어 있음
@FeignClient(
  name = "product-service", 
  url = "${service.product-service.url}",
  fallbackFactory = ProductClientFallbackFactory.class)
public interface ProductClient {

 @GetMapping("helloTime")
 String helloTime(@RequestParam("time") int time);

 //상품 조회는 나중에 구현
 @GetMapping("{pno}")
 ProductDetailDTO getProductDetail(@PathVariable("pno") Long productId);

}
