package com.sensin.tcc.clientA.model;

import java.io.Serializable;
import java.util.*;

/**
*
*  @author author
*/
public class TDemo implements Serializable {

    private static final long serialVersionUID = 1561387859040L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:1
    */
    private String kid;

    /**
    * 
    * isNullAble:1
    */
    private String groupId;

    /**
    * 
    * isNullAble:1
    */
    private String demoField;

    /**
    * 
    * isNullAble:1
    */
    private String appName;

    /**
    * 
    * isNullAble:1
    */
    private Date createTime;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setKid(String kid){this.kid = kid;}

    public String getKid(){return this.kid;}

    public void setGroupId(String groupId){this.groupId = groupId;}

    public String getGroupId(){return this.groupId;}

    public void setDemoField(String demoField){this.demoField = demoField;}

    public String getDemoField(){return this.demoField;}

    public void setAppName(String appName){this.appName = appName;}

    public String getAppName(){return this.appName;}

    public void setCreateTime(Date createTime){this.createTime = createTime;}

    public Date getCreateTime(){return this.createTime;}
    @Override
    public String toString() {
        return "TDemo{" +
                "id='" + id + '\'' +
                "kid='" + kid + '\'' +
                "groupId='" + groupId + '\'' +
                "demoField='" + demoField + '\'' +
                "appName='" + appName + '\'' +
                "createTime='" + createTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private TDemo set;

        private ConditionBuilder where;

        public UpdateBuilder set(TDemo set){
            this.set = set;
            return this;
        }

        public TDemo getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends TDemo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> kidList;

        public List<String> getKidList(){return this.kidList;}


        private List<String> fuzzyKid;

        public List<String> getFuzzyKid(){return this.fuzzyKid;}

        private List<String> rightFuzzyKid;

        public List<String> getRightFuzzyKid(){return this.rightFuzzyKid;}
        private List<String> groupIdList;

        public List<String> getGroupIdList(){return this.groupIdList;}


        private List<String> fuzzyGroupId;

        public List<String> getFuzzyGroupId(){return this.fuzzyGroupId;}

        private List<String> rightFuzzyGroupId;

        public List<String> getRightFuzzyGroupId(){return this.rightFuzzyGroupId;}
        private List<String> demoFieldList;

        public List<String> getDemoFieldList(){return this.demoFieldList;}


        private List<String> fuzzyDemoField;

        public List<String> getFuzzyDemoField(){return this.fuzzyDemoField;}

        private List<String> rightFuzzyDemoField;

        public List<String> getRightFuzzyDemoField(){return this.rightFuzzyDemoField;}
        private List<String> appNameList;

        public List<String> getAppNameList(){return this.appNameList;}


        private List<String> fuzzyAppName;

        public List<String> getFuzzyAppName(){return this.fuzzyAppName;}

        private List<String> rightFuzzyAppName;

        public List<String> getRightFuzzyAppName(){return this.rightFuzzyAppName;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyKid (List<String> fuzzyKid){
            this.fuzzyKid = fuzzyKid;
            return this;
        }

        public QueryBuilder fuzzyKid (String ... fuzzyKid){
            this.fuzzyKid = solveNullList(fuzzyKid);
            return this;
        }

        public QueryBuilder rightFuzzyKid (List<String> rightFuzzyKid){
            this.rightFuzzyKid = rightFuzzyKid;
            return this;
        }

        public QueryBuilder rightFuzzyKid (String ... rightFuzzyKid){
            this.rightFuzzyKid = solveNullList(rightFuzzyKid);
            return this;
        }

        public QueryBuilder kid(String kid){
            setKid(kid);
            return this;
        }

        public QueryBuilder kidList(String ... kid){
            this.kidList = solveNullList(kid);
            return this;
        }

        public QueryBuilder kidList(List<String> kid){
            this.kidList = kid;
            return this;
        }

        public QueryBuilder fetchKid(){
            setFetchFields("fetchFields","kid");
            return this;
        }

        public QueryBuilder excludeKid(){
            setFetchFields("excludeFields","kid");
            return this;
        }

        public QueryBuilder fuzzyGroupId (List<String> fuzzyGroupId){
            this.fuzzyGroupId = fuzzyGroupId;
            return this;
        }

        public QueryBuilder fuzzyGroupId (String ... fuzzyGroupId){
            this.fuzzyGroupId = solveNullList(fuzzyGroupId);
            return this;
        }

        public QueryBuilder rightFuzzyGroupId (List<String> rightFuzzyGroupId){
            this.rightFuzzyGroupId = rightFuzzyGroupId;
            return this;
        }

        public QueryBuilder rightFuzzyGroupId (String ... rightFuzzyGroupId){
            this.rightFuzzyGroupId = solveNullList(rightFuzzyGroupId);
            return this;
        }

        public QueryBuilder groupId(String groupId){
            setGroupId(groupId);
            return this;
        }

        public QueryBuilder groupIdList(String ... groupId){
            this.groupIdList = solveNullList(groupId);
            return this;
        }

        public QueryBuilder groupIdList(List<String> groupId){
            this.groupIdList = groupId;
            return this;
        }

        public QueryBuilder fetchGroupId(){
            setFetchFields("fetchFields","groupId");
            return this;
        }

        public QueryBuilder excludeGroupId(){
            setFetchFields("excludeFields","groupId");
            return this;
        }

        public QueryBuilder fuzzyDemoField (List<String> fuzzyDemoField){
            this.fuzzyDemoField = fuzzyDemoField;
            return this;
        }

        public QueryBuilder fuzzyDemoField (String ... fuzzyDemoField){
            this.fuzzyDemoField = solveNullList(fuzzyDemoField);
            return this;
        }

        public QueryBuilder rightFuzzyDemoField (List<String> rightFuzzyDemoField){
            this.rightFuzzyDemoField = rightFuzzyDemoField;
            return this;
        }

        public QueryBuilder rightFuzzyDemoField (String ... rightFuzzyDemoField){
            this.rightFuzzyDemoField = solveNullList(rightFuzzyDemoField);
            return this;
        }

        public QueryBuilder demoField(String demoField){
            setDemoField(demoField);
            return this;
        }

        public QueryBuilder demoFieldList(String ... demoField){
            this.demoFieldList = solveNullList(demoField);
            return this;
        }

        public QueryBuilder demoFieldList(List<String> demoField){
            this.demoFieldList = demoField;
            return this;
        }

        public QueryBuilder fetchDemoField(){
            setFetchFields("fetchFields","demoField");
            return this;
        }

        public QueryBuilder excludeDemoField(){
            setFetchFields("excludeFields","demoField");
            return this;
        }

        public QueryBuilder fuzzyAppName (List<String> fuzzyAppName){
            this.fuzzyAppName = fuzzyAppName;
            return this;
        }

        public QueryBuilder fuzzyAppName (String ... fuzzyAppName){
            this.fuzzyAppName = solveNullList(fuzzyAppName);
            return this;
        }

        public QueryBuilder rightFuzzyAppName (List<String> rightFuzzyAppName){
            this.rightFuzzyAppName = rightFuzzyAppName;
            return this;
        }

        public QueryBuilder rightFuzzyAppName (String ... rightFuzzyAppName){
            this.rightFuzzyAppName = solveNullList(rightFuzzyAppName);
            return this;
        }

        public QueryBuilder appName(String appName){
            setAppName(appName);
            return this;
        }

        public QueryBuilder appNameList(String ... appName){
            this.appNameList = solveNullList(appName);
            return this;
        }

        public QueryBuilder appNameList(List<String> appName){
            this.appNameList = appName;
            return this;
        }

        public QueryBuilder fetchAppName(){
            setFetchFields("fetchFields","appName");
            return this;
        }

        public QueryBuilder excludeAppName(){
            setFetchFields("excludeFields","appName");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(Date createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public TDemo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> kidList;

        public List<String> getKidList(){return this.kidList;}


        private List<String> fuzzyKid;

        public List<String> getFuzzyKid(){return this.fuzzyKid;}

        private List<String> rightFuzzyKid;

        public List<String> getRightFuzzyKid(){return this.rightFuzzyKid;}
        private List<String> groupIdList;

        public List<String> getGroupIdList(){return this.groupIdList;}


        private List<String> fuzzyGroupId;

        public List<String> getFuzzyGroupId(){return this.fuzzyGroupId;}

        private List<String> rightFuzzyGroupId;

        public List<String> getRightFuzzyGroupId(){return this.rightFuzzyGroupId;}
        private List<String> demoFieldList;

        public List<String> getDemoFieldList(){return this.demoFieldList;}


        private List<String> fuzzyDemoField;

        public List<String> getFuzzyDemoField(){return this.fuzzyDemoField;}

        private List<String> rightFuzzyDemoField;

        public List<String> getRightFuzzyDemoField(){return this.rightFuzzyDemoField;}
        private List<String> appNameList;

        public List<String> getAppNameList(){return this.appNameList;}


        private List<String> fuzzyAppName;

        public List<String> getFuzzyAppName(){return this.fuzzyAppName;}

        private List<String> rightFuzzyAppName;

        public List<String> getRightFuzzyAppName(){return this.rightFuzzyAppName;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyKid (List<String> fuzzyKid){
            this.fuzzyKid = fuzzyKid;
            return this;
        }

        public ConditionBuilder fuzzyKid (String ... fuzzyKid){
            this.fuzzyKid = solveNullList(fuzzyKid);
            return this;
        }

        public ConditionBuilder rightFuzzyKid (List<String> rightFuzzyKid){
            this.rightFuzzyKid = rightFuzzyKid;
            return this;
        }

        public ConditionBuilder rightFuzzyKid (String ... rightFuzzyKid){
            this.rightFuzzyKid = solveNullList(rightFuzzyKid);
            return this;
        }

        public ConditionBuilder kidList(String ... kid){
            this.kidList = solveNullList(kid);
            return this;
        }

        public ConditionBuilder kidList(List<String> kid){
            this.kidList = kid;
            return this;
        }

        public ConditionBuilder fuzzyGroupId (List<String> fuzzyGroupId){
            this.fuzzyGroupId = fuzzyGroupId;
            return this;
        }

        public ConditionBuilder fuzzyGroupId (String ... fuzzyGroupId){
            this.fuzzyGroupId = solveNullList(fuzzyGroupId);
            return this;
        }

        public ConditionBuilder rightFuzzyGroupId (List<String> rightFuzzyGroupId){
            this.rightFuzzyGroupId = rightFuzzyGroupId;
            return this;
        }

        public ConditionBuilder rightFuzzyGroupId (String ... rightFuzzyGroupId){
            this.rightFuzzyGroupId = solveNullList(rightFuzzyGroupId);
            return this;
        }

        public ConditionBuilder groupIdList(String ... groupId){
            this.groupIdList = solveNullList(groupId);
            return this;
        }

        public ConditionBuilder groupIdList(List<String> groupId){
            this.groupIdList = groupId;
            return this;
        }

        public ConditionBuilder fuzzyDemoField (List<String> fuzzyDemoField){
            this.fuzzyDemoField = fuzzyDemoField;
            return this;
        }

        public ConditionBuilder fuzzyDemoField (String ... fuzzyDemoField){
            this.fuzzyDemoField = solveNullList(fuzzyDemoField);
            return this;
        }

        public ConditionBuilder rightFuzzyDemoField (List<String> rightFuzzyDemoField){
            this.rightFuzzyDemoField = rightFuzzyDemoField;
            return this;
        }

        public ConditionBuilder rightFuzzyDemoField (String ... rightFuzzyDemoField){
            this.rightFuzzyDemoField = solveNullList(rightFuzzyDemoField);
            return this;
        }

        public ConditionBuilder demoFieldList(String ... demoField){
            this.demoFieldList = solveNullList(demoField);
            return this;
        }

        public ConditionBuilder demoFieldList(List<String> demoField){
            this.demoFieldList = demoField;
            return this;
        }

        public ConditionBuilder fuzzyAppName (List<String> fuzzyAppName){
            this.fuzzyAppName = fuzzyAppName;
            return this;
        }

        public ConditionBuilder fuzzyAppName (String ... fuzzyAppName){
            this.fuzzyAppName = solveNullList(fuzzyAppName);
            return this;
        }

        public ConditionBuilder rightFuzzyAppName (List<String> rightFuzzyAppName){
            this.rightFuzzyAppName = rightFuzzyAppName;
            return this;
        }

        public ConditionBuilder rightFuzzyAppName (String ... rightFuzzyAppName){
            this.rightFuzzyAppName = solveNullList(rightFuzzyAppName);
            return this;
        }

        public ConditionBuilder appNameList(String ... appName){
            this.appNameList = solveNullList(appName);
            return this;
        }

        public ConditionBuilder appNameList(List<String> appName){
            this.appNameList = appName;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private TDemo obj;

        public Builder(){
            this.obj = new TDemo();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder kid(String kid){
            this.obj.setKid(kid);
            return this;
        }
        public Builder groupId(String groupId){
            this.obj.setGroupId(groupId);
            return this;
        }
        public Builder demoField(String demoField){
            this.obj.setDemoField(demoField);
            return this;
        }
        public Builder appName(String appName){
            this.obj.setAppName(appName);
            return this;
        }
        public Builder createTime(Date createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public TDemo build(){return obj;}
    }

}
