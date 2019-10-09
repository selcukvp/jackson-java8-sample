package com.bozdag.learning.jackson.java8.sample.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.Instant;
import java.time.LocalDateTime;

public class Invoice {

  private String itemSerialCode;
  private double totalAmount;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime orderedAt;

  private Instant paymentIssuedAt;

  public String getItemSerialCode() {
    return itemSerialCode;
  }

  public void setItemSerialCode(String itemSerialCode) {
    this.itemSerialCode = itemSerialCode;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public LocalDateTime getOrderedAt() {
    return orderedAt;
  }

  public void setOrderedAt(LocalDateTime orderedAt) {
    this.orderedAt = orderedAt;
  }

  public Instant getPaymentIssuedAt() {
    return paymentIssuedAt;
  }

  public void setPaymentIssuedAt(Instant paymentIssuedAt) {
    this.paymentIssuedAt = paymentIssuedAt;
  }
}
