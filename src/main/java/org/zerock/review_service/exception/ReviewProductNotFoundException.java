package org.zerock.review_service.exception;

public class ReviewProductNotFoundException extends RuntimeException {

  public ReviewProductNotFoundException(String message) {
    super(message);
  }
  
}
