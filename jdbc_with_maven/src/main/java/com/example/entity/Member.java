package com.example.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Member {
	
	private int memberId;
	private String memberName;
	private String memberAddress;
	private double feesPaid;
	private int maxBookAllowed;
	private double penaltyAmount;
	private LocalDate accountOpenDate;
	private String memberShipType;

	public Member() {
		super();
	}

	public Member(int memberId, String memberName, String memberAddress, double feesPaid, int maxBookAllowed,
			double penaltyAmount, LocalDate accountOpenDate, String memberShipType) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
		this.accountOpenDate = accountOpenDate;
		this.memberShipType = memberShipType;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}

	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}

	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public String getMemberShipType() {
		return memberShipType;
	}

	public void setMemberShipType(String memberShipType) {
		this.memberShipType = memberShipType;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberAddress=" + memberAddress
				+ ", feesPaid=" + feesPaid + ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount
				+ ", accountOpenDate=" + accountOpenDate + ", memberShipType=" + memberShipType + "]";
	}
	
	
	
}
