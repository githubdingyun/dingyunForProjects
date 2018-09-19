package com.lsg.model;
 import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
 public class LesseeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public LesseeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Integer value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Integer value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Integer value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Integer value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Integer value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Integer> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Integer> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Integer value1, Integer value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Integer value1, Integer value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLNameIsNull() {
            addCriterion("l_name is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("l_name is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("l_name =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("l_name <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("l_name >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("l_name >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("l_name <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("l_name <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("l_name like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("l_name not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("l_name in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("l_name not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("l_name between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("l_name not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLTelIsNull() {
            addCriterion("l_tel is null");
            return (Criteria) this;
        }

        public Criteria andLTelIsNotNull() {
            addCriterion("l_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLTelEqualTo(String value) {
            addCriterion("l_tel =", value, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelNotEqualTo(String value) {
            addCriterion("l_tel <>", value, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelGreaterThan(String value) {
            addCriterion("l_tel >", value, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelGreaterThanOrEqualTo(String value) {
            addCriterion("l_tel >=", value, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelLessThan(String value) {
            addCriterion("l_tel <", value, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelLessThanOrEqualTo(String value) {
            addCriterion("l_tel <=", value, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelLike(String value) {
            addCriterion("l_tel like", value, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelNotLike(String value) {
            addCriterion("l_tel not like", value, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelIn(List<String> values) {
            addCriterion("l_tel in", values, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelNotIn(List<String> values) {
            addCriterion("l_tel not in", values, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelBetween(String value1, String value2) {
            addCriterion("l_tel between", value1, value2, "lTel");
            return (Criteria) this;
        }

        public Criteria andLTelNotBetween(String value1, String value2) {
            addCriterion("l_tel not between", value1, value2, "lTel");
            return (Criteria) this;
        }

        public Criteria andLSexIsNull() {
            addCriterion("l_sex is null");
            return (Criteria) this;
        }

        public Criteria andLSexIsNotNull() {
            addCriterion("l_sex is not null");
            return (Criteria) this;
        }

        public Criteria andLSexEqualTo(String value) {
            addCriterion("l_sex =", value, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexNotEqualTo(String value) {
            addCriterion("l_sex <>", value, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexGreaterThan(String value) {
            addCriterion("l_sex >", value, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexGreaterThanOrEqualTo(String value) {
            addCriterion("l_sex >=", value, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexLessThan(String value) {
            addCriterion("l_sex <", value, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexLessThanOrEqualTo(String value) {
            addCriterion("l_sex <=", value, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexLike(String value) {
            addCriterion("l_sex like", value, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexNotLike(String value) {
            addCriterion("l_sex not like", value, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexIn(List<String> values) {
            addCriterion("l_sex in", values, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexNotIn(List<String> values) {
            addCriterion("l_sex not in", values, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexBetween(String value1, String value2) {
            addCriterion("l_sex between", value1, value2, "lSex");
            return (Criteria) this;
        }

        public Criteria andLSexNotBetween(String value1, String value2) {
            addCriterion("l_sex not between", value1, value2, "lSex");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceIsNull() {
            addCriterion("l_nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceIsNotNull() {
            addCriterion("l_nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceEqualTo(String value) {
            addCriterion("l_nativeplace =", value, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceNotEqualTo(String value) {
            addCriterion("l_nativeplace <>", value, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceGreaterThan(String value) {
            addCriterion("l_nativeplace >", value, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("l_nativeplace >=", value, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceLessThan(String value) {
            addCriterion("l_nativeplace <", value, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("l_nativeplace <=", value, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceLike(String value) {
            addCriterion("l_nativeplace like", value, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceNotLike(String value) {
            addCriterion("l_nativeplace not like", value, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceIn(List<String> values) {
            addCriterion("l_nativeplace in", values, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceNotIn(List<String> values) {
            addCriterion("l_nativeplace not in", values, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceBetween(String value1, String value2) {
            addCriterion("l_nativeplace between", value1, value2, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLNativeplaceNotBetween(String value1, String value2) {
            addCriterion("l_nativeplace not between", value1, value2, "lNativeplace");
            return (Criteria) this;
        }

        public Criteria andLIdcardIsNull() {
            addCriterion("l_idcard is null");
            return (Criteria) this;
        }

        public Criteria andLIdcardIsNotNull() {
            addCriterion("l_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andLIdcardEqualTo(String value) {
            addCriterion("l_idcard =", value, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardNotEqualTo(String value) {
            addCriterion("l_idcard <>", value, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardGreaterThan(String value) {
            addCriterion("l_idcard >", value, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("l_idcard >=", value, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardLessThan(String value) {
            addCriterion("l_idcard <", value, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardLessThanOrEqualTo(String value) {
            addCriterion("l_idcard <=", value, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardLike(String value) {
            addCriterion("l_idcard like", value, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardNotLike(String value) {
            addCriterion("l_idcard not like", value, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardIn(List<String> values) {
            addCriterion("l_idcard in", values, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardNotIn(List<String> values) {
            addCriterion("l_idcard not in", values, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardBetween(String value1, String value2) {
            addCriterion("l_idcard between", value1, value2, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLIdcardNotBetween(String value1, String value2) {
            addCriterion("l_idcard not between", value1, value2, "lIdcard");
            return (Criteria) this;
        }

        public Criteria andLAddtimeIsNull() {
            addCriterion("l_addtime is null");
            return (Criteria) this;
        }

        public Criteria andLAddtimeIsNotNull() {
            addCriterion("l_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andLAddtimeEqualTo(Date value) {
            addCriterion("l_addtime =", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeNotEqualTo(Date value) {
            addCriterion("l_addtime <>", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeGreaterThan(Date value) {
            addCriterion("l_addtime >", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("l_addtime >=", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeLessThan(Date value) {
            addCriterion("l_addtime <", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("l_addtime <=", value, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeIn(List<Date> values) {
            addCriterion("l_addtime in", values, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeNotIn(List<Date> values) {
            addCriterion("l_addtime not in", values, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeBetween(Date value1, Date value2) {
            addCriterion("l_addtime between", value1, value2, "lAddtime");
            return (Criteria) this;
        }

        public Criteria andLAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("l_addtime not between", value1, value2, "lAddtime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}