package com.domain.schedule;

import java.io.Serializable;

/**
 * 配送排线表
 */
public class PdmsDriverSelfCollectRecord implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 仓库ID
     */
    private Long routeId;

    /**
     * 配送日期
     */
    private Integer deliveryDate;

    /**
     * 配送批次
     */
    private Long batchId;

    /**
     * skuid
     */
    private Long skuId;

    /**
     * ssuid
     */
    private Long ssuId;

    /**
     * 是否自领 0 不能自领，1 自领取
     */
    private Integer isSelfCol;

    /**
     * 自领品拣选区
     */
    private Long pickingAreaId;

    /**
     * 自领品拣选区编码
     */
    private String pickingAreaShowCode;

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

    private static final long serialVersionUID = 1L;

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

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
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

    public Integer getIsSelfCol() {
        return isSelfCol;
    }

    public void setIsSelfCol(Integer isSelfCol) {
        this.isSelfCol = isSelfCol;
    }

    public Long getPickingAreaId() {
        return pickingAreaId;
    }

    public void setPickingAreaId(Long pickingAreaId) {
        this.pickingAreaId = pickingAreaId;
    }

    public String getPickingAreaShowCode() {
        return pickingAreaShowCode;
    }

    public void setPickingAreaShowCode(String pickingAreaShowCode) {
        this.pickingAreaShowCode = pickingAreaShowCode;
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
        sb.append(", routeId=").append(routeId);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", batchId=").append(batchId);
        sb.append(", skuId=").append(skuId);
        sb.append(", ssuId=").append(ssuId);
        sb.append(", isSelfCol=").append(isSelfCol);
        sb.append(", pickingAreaId=").append(pickingAreaId);
        sb.append(", pickingAreaShowCode=").append(pickingAreaShowCode);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", ct=").append(ct);
        sb.append(", ut=").append(ut);
        sb.append(", creater=").append(creater);
        sb.append(", updater=").append(updater);
        sb.append(", updaterName=").append(updaterName);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PdmsDriverSelfCollectRecord other = (PdmsDriverSelfCollectRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
                && (this.getRouteId() == null ? other.getRouteId() == null : this.getRouteId().equals(other.getRouteId()))
                && (this.getDeliveryDate() == null ? other.getDeliveryDate() == null : this.getDeliveryDate().equals(other.getDeliveryDate()))
                && (this.getBatchId() == null ? other.getBatchId() == null : this.getBatchId().equals(other.getBatchId()))
                && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
                && (this.getSsuId() == null ? other.getSsuId() == null : this.getSsuId().equals(other.getSsuId()))
                && (this.getIsSelfCol() == null ? other.getIsSelfCol() == null : this.getIsSelfCol().equals(other.getIsSelfCol()))
                && (this.getPickingAreaId() == null ? other.getPickingAreaId() == null : this.getPickingAreaId().equals(other.getPickingAreaId()))
                && (this.getPickingAreaShowCode() == null ? other.getPickingAreaShowCode() == null : this.getPickingAreaShowCode().equals(other.getPickingAreaShowCode()))
                && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
                && (this.getCt() == null ? other.getCt() == null : this.getCt().equals(other.getCt()))
                && (this.getUt() == null ? other.getUt() == null : this.getUt().equals(other.getUt()))
                && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
                && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
                && (this.getUpdaterName() == null ? other.getUpdaterName() == null : this.getUpdaterName().equals(other.getUpdaterName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        result = prime * result + ((getDeliveryDate() == null) ? 0 : getDeliveryDate().hashCode());
        result = prime * result + ((getBatchId() == null) ? 0 : getBatchId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSsuId() == null) ? 0 : getSsuId().hashCode());
        result = prime * result + ((getIsSelfCol() == null) ? 0 : getIsSelfCol().hashCode());
        result = prime * result + ((getPickingAreaId() == null) ? 0 : getPickingAreaId().hashCode());
        result = prime * result + ((getPickingAreaShowCode() == null) ? 0 : getPickingAreaShowCode().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getCt() == null) ? 0 : getCt().hashCode());
        result = prime * result + ((getUt() == null) ? 0 : getUt().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdaterName() == null) ? 0 : getUpdaterName().hashCode());
        return result;
    }
}