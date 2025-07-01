package com.payment.vat_payment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.payment.vat_payment.dto.PaymentDTO;
import com.payment.vat_payment.model.Payment;
import com.payment.vat_payment.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody PaymentDTO dto) {
        Payment created = service.createPayment(dto);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public ResponseEntity<List<Payment>> listPayments() {
        List<Payment> list = service.getAllPayments();
        return ResponseEntity.ok(list);
    }

}

