package com.domain.base;

/**
 * @ClassName PdmsProdbatchLocationByCategory
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/5/27 18:57
 * @Version v1.0
 */
public class PdmsProdbatchLocationByCategory {
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
    * 一级大类ID
    */
    private Long class1Id;

    /**
    * 温层类型
    */
    private Byte temperatureType;

    /**
    * 分拣件型
    */
    private Byte sortingShapeType;

    /**
    * 售卖方式
    */
    private Byte saleModeType;

    /**
    * 加工方式
    */
    private Byte processType;

    /**
    * 是否越库
    */
    private Byte crossDocking;

    /**
    * 包装方式
    */
    private Byte wayOfPacking;

    /**
    * 订单来源
    */
    private Integer orderSource;

    /**
    * 商户类型0 普通类型，1 麻辣烫商户
    */
    private Integer coustomerType;

    /**
    * 所有指标复合索引
    */
    private String compositeIdx;

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

    public Long getClass1Id() {
        return class1Id;
    }

    public void setClass1Id(Long class1Id) {
        this.class1Id = class1Id;
    }

    public Byte getTemperatureType() {
        return temperatureType;
    }

    public void setTemperatureType(Byte temperatureType) {
        this.temperatureType = temperatureType;
    }

    public Byte getSortingShapeType() {
        return sortingShapeType;
    }

    public void setSortingShapeType(Byte sortingShapeType) {
        this.sortingShapeType = sortingShapeType;
    }

    public Byte getSaleModeType() {
        return saleModeType;
    }

    public void setSaleModeType(Byte saleModeType) {
        this.saleModeType = saleModeType;
    }

    public Byte getProcessType() {
        return processType;
    }

    public void setProcessType(Byte processType) {
        this.processType = processType;
    }

    public Byte getCrossDocking() {
        return crossDocking;
    }

    public void setCrossDocking(Byte crossDocking) {
        this.crossDocking = crossDocking;
    }

    public Byte getWayOfPacking() {
        return wayOfPacking;
    }

    public void setWayOfPacking(Byte wayOfPacking) {
        this.wayOfPacking = wayOfPacking;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getCoustomerType() {
        return coustomerType;
    }

    public void setCoustomerType(Integer coustomerType) {
        this.coustomerType = coustomerType;
    }

    public String getCompositeIdx() {
        return compositeIdx;
    }

    public void setCompositeIdx(String compositeIdx) {
        this.compositeIdx = compositeIdx;
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
        sb.append(", class1Id=").append(class1Id);
        sb.append(", temperatureType=").append(temperatureType);
        sb.append(", sortingShapeType=").append(sortingShapeType);
        sb.append(", saleModeType=").append(saleModeType);
        sb.append(", processType=").append(processType);
        sb.append(", crossDocking=").append(crossDocking);
        sb.append(", wayOfPacking=").append(wayOfPacking);
        sb.append(", orderSource=").append(orderSource);
        sb.append(", coustomerType=").append(coustomerType);
        sb.append(", compositeIdx=").append(compositeIdx);
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