package com.payment.vat_payment.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class PaymentDTO {
    private String tin;
    private String suspenseName;
    private String regType;
    private String paymentWith;
    private String ackNo;
    private BigDecimal amountToBePaid;
    private String headOfAccount;
    private String paidTowards;
    private String mode;
    private String courtFeeNo;
    private LocalDate paymentDate;
    private String micrCode;
    private String remarks;
    private BigDecimal amount;
    private BigDecimal interest;
    private BigDecimal penalty;

    // getters and setters
}
