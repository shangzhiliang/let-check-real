package com.pdms.base.model;

/**
 * 排线后预占发货排任务队列
 */
public class DistArrangeOccupyLineTask {
    /**
     * 主键自增字段
     */
    private Long id;

    /**
     * 城市ID
     */
    private Long cityId;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 云仓ID,主仓直送时此值0
     */
    private Long fdcId;

    /**
     * 站区id
     */
    private Long stationRegionId;

    /**
     * 配送批次ID
     */
    private Long batchId;

    /**
     * 生产顺序优先级
     */
    private Integer productSeq;

    /**
     * 配送日期
     */
    private Integer deliveryDate;

    /**
     * 0 待执行 1 执行中 2 执行成功 10 执行失败
     */
    private Byte taskStatus;

    /**
     * 1 批次 2 发货区，3线路
     */
    private Byte taskType;

    /**
     * 描述
     */
    private String remark;

    /**
     * 删除标记:0未删除1已删除
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private Long ct;

    /**
     * 更新时间
     */
    private Long ut;

    /**
     * 创建用户id
     */
    private Long createUser;

    /**
     * 修改用户id
     */
    private Long updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getFdcId() {
        return fdcId;
    }

    public void setFdcId(Long fdcId) {
        this.fdcId = fdcId;
    }

    public Long getStationRegionId() {
        return stationRegionId;
    }

    public void setStationRegionId(Long stationRegionId) {
        this.stationRegionId = stationRegionId;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Integer getProductSeq() {
        return productSeq;
    }

    public void setProductSeq(Integer productSeq) {
        this.productSeq = productSeq;
    }

    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Byte getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Byte getTaskType() {
        return taskType;
    }

    public void setTaskType(Byte taskType) {
        this.taskType = taskType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getCt() {
        return ct;
    }

    public void setCt(Long ct) {
        this.ct = ct;
    }

    public Long getUt() {
        return ut;
    }

    public void setUt(Long ut) {
        this.ut = ut;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cityId=").append(cityId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", fdcId=").append(fdcId);
        sb.append(", stationRegionId=").append(stationRegionId);
        sb.append(", batchId=").append(batchId);
        sb.append(", productSeq=").append(productSeq);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", taskType=").append(taskType);
        sb.append(", remark=").append(remark);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", ct=").append(ct);
        sb.append(", ut=").append(ut);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateUser=").append(updateUser);
        sb.append("]");
        return sb.toString();
    }
}