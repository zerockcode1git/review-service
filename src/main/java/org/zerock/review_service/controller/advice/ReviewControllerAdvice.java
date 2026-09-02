package org.zerock.review_service.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.zerock.review_service.exception.ReviewProductNotFoundException;

@RestControllerAdvice
public class ReviewControllerAdvice {
  
  @ExceptionHandler(ReviewProductNotFoundException.class)
  public ResponseEntity<String> handleReviewProductNotFoundException(ReviewProductNotFoundException ex) {
    //return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    return ResponseEntity.status(HttpStatus.OK).body("Product not found");
  }
}
