package com.payment.vat_payment.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @Column(nullable = false, length = 20)
    private String tin;

    @Column(length = 100)
    private String suspenseName;

    @Column(length = 20)
    private String regType;

    @Column(length = 50)
    private String paymentWith;

    @Column(length = 20)
    private String ackNo; // refers to acknowledgements(ack_no)

    @Column(precision = 12, scale = 2)
    private BigDecimal amountToBePaid;

    @Column(length = 50)
    private String headOfAccount;

    @Column(length = 50)
    private String paidTowards;

    @Column(length = 30)
    private String mode;

    @Column(length = 50)
    private String courtFeeNo;

    private LocalDate paymentDate;

    @Column(length = 20)
    private String micrCode;

    @Column(columnDefinition = "TEXT")
    private String remarks;

    @Column(precision = 12, scale = 2)
    private BigDecimal amount;

    @Column(precision = 12, scale = 2)
    private BigDecimal interest;

    @Column(precision = 12, scale = 2)
    private BigDecimal penalty;

    @UpdateTimestamp
    private LocalDateTime timestamp;

    @CreationTimestamp
    private LocalDateTime createdAt;

    
}
