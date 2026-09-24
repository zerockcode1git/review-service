package org.zerock.review_service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.zerock.review_service.clients.ProductClient;
//import org.zerock.review_service.dto.ProductDetailDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ReviewController {

  private final ProductClient productClient;

  @GetMapping("hello")
  public String[] hello() {
    return new String[] { "Hello", "Review", "Service" };
  }

  @GetMapping("helloFeign")
  public String helloFeign(@RequestParam("delay") int delay) {

    log.info("product client helloTime 호출");

    return "Hello from Feign Client" + productClient.helloTime(delay);
  }

  // @GetMapping("productDetail/{pno}")
  // public ProductDetailDTO productDetail(@PathVariable("pno") Long productId) {

  // log.info("product client getProductDetail 호출");

  // return productClient.getProductDetail(productId);
  // }

}
