package com.pdms.base.model;

/**
 * 4.5生产波次定位规则配置
 */
public class PdmsProdbatchLocationRuleCfg {
    private Long id;

    /**
     * 仓ID
     */
    private Long warehouseId;

    /**
     * 生产波次id
     */
    private Long prodBatchId;

    /**
     * 分拣集货方式 10 按云仓 20 按站区 30 按路区 40 按线路 50 按商户,60 按生产单
     */
    private Integer sortingCollectType;

    /**
     * 分拣方式 45-二次分拣,55-边拣边分
     */
    private Integer sortingType;

    /**
     * 发货区
     */
    private Long sortingCenterAreaId;

    /**
     * 发货区编码
     */
    private String sortingCenterAreaShowCode;

    /**
     * 是否打包 0 不打， 1 打包
     */
    private Byte isPackage;

    /**
     * 阀值最小值
     */
    private Integer minNum;

    /**
     * 阀值最大值
     */
    private Integer maxNum;

    /**
     * 是否删除
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

    public Long getProdBatchId() {
        return prodBatchId;
    }

    public void setProdBatchId(Long prodBatchId) {
        this.prodBatchId = prodBatchId;
    }

    public Integer getSortingCollectType() {
        return sortingCollectType;
    }

    public void setSortingCollectType(Integer sortingCollectType) {
        this.sortingCollectType = sortingCollectType;
    }

    public Integer getSortingType() {
        return sortingType;
    }

    public void setSortingType(Integer sortingType) {
        this.sortingType = sortingType;
    }

    public Long getSortingCenterAreaId() {
        return sortingCenterAreaId;
    }

    public void setSortingCenterAreaId(Long sortingCenterAreaId) {
        this.sortingCenterAreaId = sortingCenterAreaId;
    }

    public String getSortingCenterAreaShowCode() {
        return sortingCenterAreaShowCode;
    }

    public void setSortingCenterAreaShowCode(String sortingCenterAreaShowCode) {
        this.sortingCenterAreaShowCode = sortingCenterAreaShowCode;
    }

    public Byte getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Byte isPackage) {
        this.isPackage = isPackage;
    }

    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
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
        sb.append(", prodBatchId=").append(prodBatchId);
        sb.append(", sortingCollectType=").append(sortingCollectType);
        sb.append(", sortingType=").append(sortingType);
        sb.append(", sortingCenterAreaId=").append(sortingCenterAreaId);
        sb.append(", sortingCenterAreaShowCode=").append(sortingCenterAreaShowCode);
        sb.append(", isPackage=").append(isPackage);
        sb.append(", minNum=").append(minNum);
        sb.append(", maxNum=").append(maxNum);
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