package com.bozdag.learning.jackson.java8.sample.controller;

import com.bozdag.learning.jackson.java8.sample.domain.Invoice;
import com.bozdag.learning.jackson.java8.sample.service.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

  private final InvoiceService invoiceService;

  public InvoiceController(InvoiceService invoiceService) {
    this.invoiceService = invoiceService;
  }

  @GetMapping("/invoice/dummy")
  public ResponseEntity<Invoice> getOneInvoice() {
    return ResponseEntity.ok(invoiceService.getOneInvoice());
  }
}
