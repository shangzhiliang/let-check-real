package com.domain.base;

/**
    * 司机自领SKU与生产波次关联
    */
public class PdmsDriverSelfCollectSkuProdbatch {
    private Long id;

    /**
    * 仓库id
    */
    private Long warehouseId;

    /**
    * 生产波次id
    */
    private Long productBatchId;

    /**
    * sku_id
    */
    private Long skuId;

    /**
    * ssu_id,标品为0
    */
    private Long ssuId;

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

    public Long getProductBatchId() {
        return productBatchId;
    }

    public void setProductBatchId(Long productBatchId) {
        this.productBatchId = productBatchId;
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
        sb.append(", productBatchId=").append(productBatchId);
        sb.append(", skuId=").append(skuId);
        sb.append(", ssuId=").append(ssuId);
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