package com.domain.base;

/**
 * @ClassName PdmsProdbatchLocationBySku
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:59
 * @Version v1.0
 */
/**
    * 波次定位策略按sku配置
    */
public class PdmsProdbatchLocationBySku {
    /**
    * 主键
    */
    private Long id;

    /**
    * 作业模式id
    */
    private Long taskModeId;

    /**
    * 生产波次id
    */
    private Long prodBatchId;

    /**
    * SKU
    */
    private Long skuId;

    /**
    * 一级大类
    */
    private Long class1Id;

    /**
    * 分拣工具
    */
    private Long sortingToolId;

    /**
    * 集单方式 1 按云仓 2按站区 3按路区 4 按线路 5按商户订单
    */
    private Byte collectionOrderType;

    /**
    * 分拣方式 1-投线 2-摘果,25-投箱,35-商户摘果 45-二次分拣,55-边拣边分
    */
    private Byte sortingType;

    /**
    * 发货区id
    */
    private Long sortingAreaId;

    /**
    * 发货区显示编码
    */
    private String sortingAreaShowCode;

    /**
    * 拣选区id
    */
    private Long pickingAreaId;

    /**
    * 拣选区显示编码
    */
    private String pickingAreaShowCode;

    /**
    * 复核上架区id
    */
    private Long putawayAreaId;

    /**
    * 复核上架区编码
    */
    private String putawayAreaShowCode;

    /**
    * 1 拣选区,2-存储区，3分拣区
    */
    private Byte pickAreaType;

    /**
    * 是否生效:1-已生效 0-已生效 2-未生效
    */
    private Boolean isEffective;

    /**
    * 创建时间
    */
    private Long ct;

    /**
    * 最后更新时间
    */
    private Long uT;

    /**
    * 创建人
    */
    private Long creater;

    /**
    * 最后更新人
    */
    private Long updater;

    /**
    * 最后更新人姓名
    */
    private String updaterName;

    /**
    * 是否逻辑删除0 否 1是
    */
    private Byte isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskModeId() {
        return taskModeId;
    }

    public void setTaskModeId(Long taskModeId) {
        this.taskModeId = taskModeId;
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

    public Long getClass1Id() {
        return class1Id;
    }

    public void setClass1Id(Long class1Id) {
        this.class1Id = class1Id;
    }

    public Long getSortingToolId() {
        return sortingToolId;
    }

    public void setSortingToolId(Long sortingToolId) {
        this.sortingToolId = sortingToolId;
    }

    public Byte getCollectionOrderType() {
        return collectionOrderType;
    }

    public void setCollectionOrderType(Byte collectionOrderType) {
        this.collectionOrderType = collectionOrderType;
    }

    public Byte getSortingType() {
        return sortingType;
    }

    public void setSortingType(Byte sortingType) {
        this.sortingType = sortingType;
    }

    public Long getSortingAreaId() {
        return sortingAreaId;
    }

    public void setSortingAreaId(Long sortingAreaId) {
        this.sortingAreaId = sortingAreaId;
    }

    public String getSortingAreaShowCode() {
        return sortingAreaShowCode;
    }

    public void setSortingAreaShowCode(String sortingAreaShowCode) {
        this.sortingAreaShowCode = sortingAreaShowCode;
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

    public Long getPutawayAreaId() {
        return putawayAreaId;
    }

    public void setPutawayAreaId(Long putawayAreaId) {
        this.putawayAreaId = putawayAreaId;
    }

    public String getPutawayAreaShowCode() {
        return putawayAreaShowCode;
    }

    public void setPutawayAreaShowCode(String putawayAreaShowCode) {
        this.putawayAreaShowCode = putawayAreaShowCode;
    }

    public Byte getPickAreaType() {
        return pickAreaType;
    }

    public void setPickAreaType(Byte pickAreaType) {
        this.pickAreaType = pickAreaType;
    }

    public Boolean getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Boolean isEffective) {
        this.isEffective = isEffective;
    }

    public Long getCt() {
        return ct;
    }

    public void setCt(Long ct) {
        this.ct = ct;
    }

    public Long getuT() {
        return uT;
    }

    public void setuT(Long uT) {
        this.uT = uT;
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
        sb.append(", taskModeId=").append(taskModeId);
        sb.append(", prodBatchId=").append(prodBatchId);
        sb.append(", skuId=").append(skuId);
        sb.append(", class1Id=").append(class1Id);
        sb.append(", sortingToolId=").append(sortingToolId);
        sb.append(", collectionOrderType=").append(collectionOrderType);
        sb.append(", sortingType=").append(sortingType);
        sb.append(", sortingAreaId=").append(sortingAreaId);
        sb.append(", sortingAreaShowCode=").append(sortingAreaShowCode);
        sb.append(", pickingAreaId=").append(pickingAreaId);
        sb.append(", pickingAreaShowCode=").append(pickingAreaShowCode);
        sb.append(", putawayAreaId=").append(putawayAreaId);
        sb.append(", putawayAreaShowCode=").append(putawayAreaShowCode);
        sb.append(", pickAreaType=").append(pickAreaType);
        sb.append(", isEffective=").append(isEffective);
        sb.append(", ct=").append(ct);
        sb.append(", uT=").append(uT);
        sb.append(", creater=").append(creater);
        sb.append(", updater=").append(updater);
        sb.append(", updaterName=").append(updaterName);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}