package model;

import utils.enums.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Membership {
    private String id;
    private String membershipType;
    private LocalDate paymentDate;
    private LocalDateTime validityDateTime;
    private Double price;
    //TODO : Kupac
    private MembershipStatus status;
    private String dailyTerms;
}