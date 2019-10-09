package com.bozdag.learning.jackson.java8;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.bozdag.learning.jackson.java8.sample.JacksonSampleMainApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JacksonSampleMainApplication.class)
@AutoConfigureMockMvc
public class TestInvoiceController {

  @Autowired private MockMvc mvc;

  @Test
  public void givenNoneWhenGetAllInvoicesThenReturnAllInvoices() throws Exception {
    this.mvc
        .perform(get("/invoice/dummy"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.itemSerialCode").value("S-123-ABC"))
        .andExpect(jsonPath("$.totalAmount").value(100.0))
        .andExpect(jsonPath("$.orderedAt").value("2019-10-10 19:30:45"))
        .andExpect(jsonPath("$.paymentIssuedAt").value(1570724445L));
  }
}
