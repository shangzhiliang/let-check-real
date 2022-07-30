package com.domain.base;

/**
 * 司机自领SKU配置
 */
public class PdmsDriverSelfCollectSkuConfig {
    private Long id;

    /**
     * 仓库id
     */
    private Long warehouseId;

    /**
     * 拣选区id
     */
    private Long pickAreaId;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * ssu_id,标品为0
     */
    private Long ssuId;

    /**
     * ssu_name
     */
    private String ssuName;

    /**
     * 最低领用数量
     */
    private Integer receiveAmount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态，0：禁用；1：启用
     */
    private Byte configStatus;

    /**
     * 是否删除0否，1是
     */
    private Byte isDeleted;

    /**
     * 创建时间
     */
    private Long ct;

    /**
     * 更新时间
     */
    private Long ut;

    /**
     * 创建人
     */
    private Long creater;

    /**
     * 更新人
     */
    private Long updater;

    /**
     * 更新人名称
     */
    private String updaterName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getPickAreaId() {
        return pickAreaId;
    }

    public void setPickAreaId(Long pickAreaId) {
        this.pickAreaId = pickAreaId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSsuId() {
        return ssuId;
    }

    public void setSsuId(Long ssuId) {
        this.ssuId = ssuId;
    }

    public String getSsuName() {
        return ssuName;
    }

    public void setSsuName(String ssuName) {
        this.ssuName = ssuName;
    }

    public Integer getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(Integer receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(Byte configStatus) {
        this.configStatus = configStatus;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
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

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Long getUpdater() {
        return updater;
    }

    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", pickAreaId=").append(pickAreaId);
        sb.append(", skuId=").append(skuId);
        sb.append(", ssuId=").append(ssuId);
        sb.append(", ssuName=").append(ssuName);
        sb.append(", receiveAmount=").append(receiveAmount);
        sb.append(", remark=").append(remark);
        sb.append(", configStatus=").append(configStatus);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", ct=").append(ct);
        sb.append(", ut=").append(ut);
        sb.append(", creater=").append(creater);
        sb.append(", updater=").append(updater);
        sb.append(", updaterName=").append(updaterName);
        sb.append("]");
        return sb.toString();
    }
}