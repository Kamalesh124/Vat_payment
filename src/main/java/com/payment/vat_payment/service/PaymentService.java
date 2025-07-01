package com.payment.vat_payment.service;

import java.util.List;

import com.payment.vat_payment.dto.PaymentDTO;
import com.payment.vat_payment.model.Payment;

public interface PaymentService {
    Payment createPayment(PaymentDTO dto);
    List<Payment> getAllPayments();
}

