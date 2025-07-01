package com.payment.vat_payment.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.vat_payment.dto.PaymentDTO;
import com.payment.vat_payment.model.Payment;
import com.payment.vat_payment.repository.PaymentRepository;
import com.payment.vat_payment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository repository;

    public PaymentServiceImpl(PaymentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Payment createPayment(PaymentDTO dto) {
        Payment p = new Payment();
        p.setTin(dto.getTin());
        p.setSuspenseName(dto.getSuspenseName());
        p.setRegType(dto.getRegType());
        p.setPaymentWith(dto.getPaymentWith());
        p.setAckNo(dto.getAckNo());
        p.setAmountToBePaid(dto.getAmountToBePaid());
        p.setHeadOfAccount(dto.getHeadOfAccount());
        p.setPaidTowards(dto.getPaidTowards());
        p.setMode(dto.getMode());
        p.setCourtFeeNo(dto.getCourtFeeNo());
        p.setPaymentDate(dto.getPaymentDate());
        p.setMicrCode(dto.getMicrCode());
        p.setRemarks(dto.getRemarks());
        p.setAmount(dto.getAmount());
        p.setInterest(dto.getInterest());
        p.setPenalty(dto.getPenalty());
        p.setTimestamp(LocalDateTime.now());
        p.setCreatedAt(LocalDateTime.now());
        return repository.save(p);
    }

    @Override
    public List<Payment> getAllPayments() {
        return repository.findAll();
    }
}
