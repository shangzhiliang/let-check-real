package com.domain.schedule;

/**
 * 生产单行与单据绑定关系表
 */
public class NaviaOrderItemBindRelationship {
    /**
     * 自增id
     */
    private Long id;

    /**
     * 生产订单id
     */
    private Long apsOrderId;

    /**
     * 生产订单明细id
     */
    private Long apsOrderItemId;

    /**
     * 跟踪id:仓_日期_生产波次_sku_ssu_货主_supplier_processflag_集货维度_集货对象
     */
    private String traceId;

    /**
     * 仓id
     */
    private Long warehouseId;

    /**
     * 云仓ID
     */
    private Long lastSortingCenterId;

    /**
     * 城市Id
     */
    private Long cityId;

    /**
     * 配送日期
     */
    private Integer deliveryDate;

    /**
     * 生产波次
     */
    private Long prodBatchId;

    /**
     * 商品sku
     */
    private Long skuId;

    /**
     * ssu
     */
    private Long ssuId;

    /**
     * 货主id
     */
    private Long ownerId;

    /**
     * 供应商id
     */
    private Long supplierId;

    /**
     * 1 预加工，2 订单加工，0 不包装
     */
    private Byte processFlag;

    /**
     * 分拣区id
     */
    private Long sortingAreaId;

    /**
     * 拣选区id，D区 或 C区
     */
    private Long pickingAreaId;

    /**
     * 二次分拣区
     */
    private Long rebinAreaId;

    /**
     * 分拣工具ID
     */
    private Long sortingToolId;

    /**
     * 是否打包 0 否 1 是
     */
    private Byte isPackage;

    /**
     * 分拣集量维度：10 按仓，20 按站区，30 按路区，40 按末端线，50 按商户，60 按生产单
     */
    private Byte accumulateType;

    /**
     * 集货维度对象id,仓，站区，路区，末端线，商户，生产订单
     */
    private Long accumulateDestId;

    /**
     * 复合主键： 仓_日期_生产波次_sku_ssu_货主_supplier_processflag_集货维度_集货对象
     */
    private String compositeKeys;

    /**
     * 创建人
     */
    private Long cu;

    /**
     * 创建时间
     */
    private Long ct;

    /**
     * 最后更新人
     */
    private Long uu;

    /**
     * 最后更新时间
     */
    private Long ut;

    /**
     * 更新人名
     */
    private String updaterName;

    /**
     * 是否逻辑删除 0 不是 1 是
     */
    private Byte isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApsOrderId() {
        return apsOrderId;
    }

    public void setApsOrderId(Long apsOrderId) {
        this.apsOrderId = apsOrderId;
    }

    public Long getApsOrderItemId() {
        return apsOrderItemId;
    }

    public void setApsOrderItemId(Long apsOrderItemId) {
        this.apsOrderItemId = apsOrderItemId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Long getLastSortingCenterId() {
        return lastSortingCenterId;
    }

    public void setLastSortingCenterId(Long lastSortingCenterId) {
        this.lastSortingCenterId = lastSortingCenterId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getProdBatchId() {
        return prodBatchId;
    }

    public void setProdBatchId(Long prodBatchId) {
        this.prodBatchId = prodBatchId;
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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Byte getProcessFlag() {
        return processFlag;
    }

    public void setProcessFlag(Byte processFlag) {
        this.processFlag = processFlag;
    }

    public Long getSortingAreaId() {
        return sortingAreaId;
    }

    public void setSortingAreaId(Long sortingAreaId) {
        this.sortingAreaId = sortingAreaId;
    }

    public Long getPickingAreaId() {
        return pickingAreaId;
    }

    public void setPickingAreaId(Long pickingAreaId) {
        this.pickingAreaId = pickingAreaId;
    }

    public Long getRebinAreaId() {
        return rebinAreaId;
    }

    public void setRebinAreaId(Long rebinAreaId) {
        this.rebinAreaId = rebinAreaId;
    }

    public Long getSortingToolId() {
        return sortingToolId;
    }

    public void setSortingToolId(Long sortingToolId) {
        this.sortingToolId = sortingToolId;
    }

    public Byte getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Byte isPackage) {
        this.isPackage = isPackage;
    }

    public Byte getAccumulateType() {
        return accumulateType;
    }

    public void setAccumulateType(Byte accumulateType) {
        this.accumulateType = accumulateType;
    }

    public Long getAccumulateDestId() {
        return accumulateDestId;
    }

    public void setAccumulateDestId(Long accumulateDestId) {
        this.accumulateDestId = accumulateDestId;
    }

    public String getCompositeKeys() {
        return compositeKeys;
    }

    public void setCompositeKeys(String compositeKeys) {
        this.compositeKeys = compositeKeys;
    }

    public Long getCu() {
        return cu;
    }

    public void setCu(Long cu) {
        this.cu = cu;
    }

    public Long getCt() {
        return ct;
    }

    public void setCt(Long ct) {
        this.ct = ct;
    }

    public Long getUu() {
        return uu;
    }

    public void setUu(Long uu) {
        this.uu = uu;
    }

    public Long getUt() {
        return ut;
    }

    public void setUt(Long ut) {
        this.ut = ut;
    }

    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", apsOrderId=").append(apsOrderId);
        sb.append(", apsOrderItemId=").append(apsOrderItemId);
        sb.append(", traceId=").append(traceId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", lastSortingCenterId=").append(lastSortingCenterId);
        sb.append(", cityId=").append(cityId);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", prodBatchId=").append(prodBatchId);
        sb.append(", skuId=").append(skuId);
        sb.append(", ssuId=").append(ssuId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", processFlag=").append(processFlag);
        sb.append(", sortingAreaId=").append(sortingAreaId);
        sb.append(", pickingAreaId=").append(pickingAreaId);
        sb.append(", rebinAreaId=").append(rebinAreaId);
        sb.append(", sortingToolId=").append(sortingToolId);
        sb.append(", isPackage=").append(isPackage);
        sb.append(", accumulateType=").append(accumulateType);
        sb.append(", accumulateDestId=").append(accumulateDestId);
        sb.append(", compositeKeys=").append(compositeKeys);
        sb.append(", cu=").append(cu);
        sb.append(", ct=").append(ct);
        sb.append(", uu=").append(uu);
        sb.append(", ut=").append(ut);
        sb.append(", updaterName=").append(updaterName);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}