package com.bozdag.learning.jackson.java8.sample.service.impl;

import com.bozdag.learning.jackson.java8.sample.domain.Invoice;
import com.bozdag.learning.jackson.java8.sample.service.InvoiceService;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

  @Override
  public Invoice getOneInvoice() {
    return createInvoice("S-123-ABC", 100.0);
  }

  private Invoice createInvoice(String serial, double totalAmount) {
    Invoice invoice = new Invoice();
    invoice.setItemSerialCode(serial);
    invoice.setTotalAmount(totalAmount);
    invoice.setOrderedAt(LocalDateTime.of(2019, Month.OCTOBER, 10, 19, 30, 45));
    invoice.setPaymentIssuedAt(Instant.ofEpochSecond(1570724445));
    return invoice;
  }
}
