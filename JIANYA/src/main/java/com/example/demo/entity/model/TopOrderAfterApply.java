package com.example.demo.entity.model;

import java.math.BigDecimal;
import java.util.Date;

public class TopOrderAfterApply {
    private Long id;

    private String orderNum;

    private String orderItemNum;

    private String orderAfterNum;

    private String userNum;

    private String storeNum;

    private Byte purchaseType;

    private String suppilerNum;

    private Byte wholeType;

    private Byte orderType;

    private Byte afterType;

    private Byte reasonType;

    private String reasonName;

    private String reasonDes;

    private String reasonRemark;

    private String provePicture;

    private String proveImage;

    private String refundRemark;

    private Byte reviewType;

    private Byte processNow;

    private BigDecimal allMarketPrice;

    private BigDecimal totalActuallyAmount;

    private BigDecimal actuallyAmount;

    private BigDecimal couponAmount;

    private BigDecimal incomeAmount;

    private BigDecimal feeAmount;

    private Byte backFeeType;

    private BigDecimal backPercent;

    private BigDecimal backActuallyAmount;

    private BigDecimal backCouponAmount;

    private BigDecimal backIncomeAmount;

    private BigDecimal backFeeIncomeAmount;

    private BigDecimal backFeeActuallyAmount;

    private BigDecimal compensateIncome;

    private BigDecimal compensateCoupon;

    private String compensateRemark;

    private Byte orderPayChannel;

    private String payChannelOrderNum;

    private String orderPayNum;

    private String backPayChannelOrderNum;

    private String backOrderPayNum;

    private Byte refundStatus;

    private Date refundTime;

    private Integer orderStatus;

    private String deliveryNum;

    private String deliveryCompany;

    private Byte goodsGetStatus;

    private BigDecimal rebatePrice;

    private String backAccountNum;

    private String backBankName;

    private Byte goodsSendStatus;

    private String sendDeliveryNum;

    private String stopReason;

    private Date expandDate;

    private String remark;

    private Byte showStatus;

    private Byte cztOrderStatus;

    private String currentProcessor;

    private String sendAddress;

    private String tagOne;

    private String tagTwo;

    private String tagThree;

    private String creator;

    private Date createTime;

    private String updator;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderItemNum() {
        return orderItemNum;
    }

    public void setOrderItemNum(String orderItemNum) {
        this.orderItemNum = orderItemNum;
    }

    public String getOrderAfterNum() {
        return orderAfterNum;
    }

    public void setOrderAfterNum(String orderAfterNum) {
        this.orderAfterNum = orderAfterNum;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(String storeNum) {
        this.storeNum = storeNum;
    }

    public Byte getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(Byte purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getSuppilerNum() {
        return suppilerNum;
    }

    public void setSuppilerNum(String suppilerNum) {
        this.suppilerNum = suppilerNum;
    }

    public Byte getWholeType() {
        return wholeType;
    }

    public void setWholeType(Byte wholeType) {
        this.wholeType = wholeType;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Byte getAfterType() {
        return afterType;
    }

    public void setAfterType(Byte afterType) {
        this.afterType = afterType;
    }

    public Byte getReasonType() {
        return reasonType;
    }

    public void setReasonType(Byte reasonType) {
        this.reasonType = reasonType;
    }

    public String getReasonName() {
        return reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }

    public String getReasonDes() {
        return reasonDes;
    }

    public void setReasonDes(String reasonDes) {
        this.reasonDes = reasonDes;
    }

    public String getReasonRemark() {
        return reasonRemark;
    }

    public void setReasonRemark(String reasonRemark) {
        this.reasonRemark = reasonRemark;
    }

    public String getProvePicture() {
        return provePicture;
    }

    public void setProvePicture(String provePicture) {
        this.provePicture = provePicture;
    }

    public String getProveImage() {
        return proveImage;
    }

    public void setProveImage(String proveImage) {
        this.proveImage = proveImage;
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
    }

    public Byte getReviewType() {
        return reviewType;
    }

    public void setReviewType(Byte reviewType) {
        this.reviewType = reviewType;
    }

    public Byte getProcessNow() {
        return processNow;
    }

    public void setProcessNow(Byte processNow) {
        this.processNow = processNow;
    }

    public BigDecimal getAllMarketPrice() {
        return allMarketPrice;
    }

    public void setAllMarketPrice(BigDecimal allMarketPrice) {
        this.allMarketPrice = allMarketPrice;
    }

    public BigDecimal getTotalActuallyAmount() {
        return totalActuallyAmount;
    }

    public void setTotalActuallyAmount(BigDecimal totalActuallyAmount) {
        this.totalActuallyAmount = totalActuallyAmount;
    }

    public BigDecimal getActuallyAmount() {
        return actuallyAmount;
    }

    public void setActuallyAmount(BigDecimal actuallyAmount) {
        this.actuallyAmount = actuallyAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(BigDecimal incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Byte getBackFeeType() {
        return backFeeType;
    }

    public void setBackFeeType(Byte backFeeType) {
        this.backFeeType = backFeeType;
    }

    public BigDecimal getBackPercent() {
        return backPercent;
    }

    public void setBackPercent(BigDecimal backPercent) {
        this.backPercent = backPercent;
    }

    public BigDecimal getBackActuallyAmount() {
        return backActuallyAmount;
    }

    public void setBackActuallyAmount(BigDecimal backActuallyAmount) {
        this.backActuallyAmount = backActuallyAmount;
    }

    public BigDecimal getBackCouponAmount() {
        return backCouponAmount;
    }

    public void setBackCouponAmount(BigDecimal backCouponAmount) {
        this.backCouponAmount = backCouponAmount;
    }

    public BigDecimal getBackIncomeAmount() {
        return backIncomeAmount;
    }

    public void setBackIncomeAmount(BigDecimal backIncomeAmount) {
        this.backIncomeAmount = backIncomeAmount;
    }

    public BigDecimal getBackFeeIncomeAmount() {
        return backFeeIncomeAmount;
    }

    public void setBackFeeIncomeAmount(BigDecimal backFeeIncomeAmount) {
        this.backFeeIncomeAmount = backFeeIncomeAmount;
    }

    public BigDecimal getBackFeeActuallyAmount() {
        return backFeeActuallyAmount;
    }

    public void setBackFeeActuallyAmount(BigDecimal backFeeActuallyAmount) {
        this.backFeeActuallyAmount = backFeeActuallyAmount;
    }

    public BigDecimal getCompensateIncome() {
        return compensateIncome;
    }

    public void setCompensateIncome(BigDecimal compensateIncome) {
        this.compensateIncome = compensateIncome;
    }

    public BigDecimal getCompensateCoupon() {
        return compensateCoupon;
    }

    public void setCompensateCoupon(BigDecimal compensateCoupon) {
        this.compensateCoupon = compensateCoupon;
    }

    public String getCompensateRemark() {
        return compensateRemark;
    }

    public void setCompensateRemark(String compensateRemark) {
        this.compensateRemark = compensateRemark;
    }

    public Byte getOrderPayChannel() {
        return orderPayChannel;
    }

    public void setOrderPayChannel(Byte orderPayChannel) {
        this.orderPayChannel = orderPayChannel;
    }

    public String getPayChannelOrderNum() {
        return payChannelOrderNum;
    }

    public void setPayChannelOrderNum(String payChannelOrderNum) {
        this.payChannelOrderNum = payChannelOrderNum;
    }

    public String getOrderPayNum() {
        return orderPayNum;
    }

    public void setOrderPayNum(String orderPayNum) {
        this.orderPayNum = orderPayNum;
    }

    public String getBackPayChannelOrderNum() {
        return backPayChannelOrderNum;
    }

    public void setBackPayChannelOrderNum(String backPayChannelOrderNum) {
        this.backPayChannelOrderNum = backPayChannelOrderNum;
    }

    public String getBackOrderPayNum() {
        return backOrderPayNum;
    }

    public void setBackOrderPayNum(String backOrderPayNum) {
        this.backOrderPayNum = backOrderPayNum;
    }

    public Byte getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Byte refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(String deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public Byte getGoodsGetStatus() {
        return goodsGetStatus;
    }

    public void setGoodsGetStatus(Byte goodsGetStatus) {
        this.goodsGetStatus = goodsGetStatus;
    }

    public BigDecimal getRebatePrice() {
        return rebatePrice;
    }

    public void setRebatePrice(BigDecimal rebatePrice) {
        this.rebatePrice = rebatePrice;
    }

    public String getBackAccountNum() {
        return backAccountNum;
    }

    public void setBackAccountNum(String backAccountNum) {
        this.backAccountNum = backAccountNum;
    }

    public String getBackBankName() {
        return backBankName;
    }

    public void setBackBankName(String backBankName) {
        this.backBankName = backBankName;
    }

    public Byte getGoodsSendStatus() {
        return goodsSendStatus;
    }

    public void setGoodsSendStatus(Byte goodsSendStatus) {
        this.goodsSendStatus = goodsSendStatus;
    }

    public String getSendDeliveryNum() {
        return sendDeliveryNum;
    }

    public void setSendDeliveryNum(String sendDeliveryNum) {
        this.sendDeliveryNum = sendDeliveryNum;
    }

    public String getStopReason() {
        return stopReason;
    }

    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }

    public Date getExpandDate() {
        return expandDate;
    }

    public void setExpandDate(Date expandDate) {
        this.expandDate = expandDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Byte showStatus) {
        this.showStatus = showStatus;
    }

    public Byte getCztOrderStatus() {
        return cztOrderStatus;
    }

    public void setCztOrderStatus(Byte cztOrderStatus) {
        this.cztOrderStatus = cztOrderStatus;
    }

    public String getCurrentProcessor() {
        return currentProcessor;
    }

    public void setCurrentProcessor(String currentProcessor) {
        this.currentProcessor = currentProcessor;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public String getTagOne() {
        return tagOne;
    }

    public void setTagOne(String tagOne) {
        this.tagOne = tagOne;
    }

    public String getTagTwo() {
        return tagTwo;
    }

    public void setTagTwo(String tagTwo) {
        this.tagTwo = tagTwo;
    }

    public String getTagThree() {
        return tagThree;
    }

    public void setTagThree(String tagThree) {
        this.tagThree = tagThree;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}