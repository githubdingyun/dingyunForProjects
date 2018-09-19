package com.lsg.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HouseExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Integer value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Integer value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Integer value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Integer value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Integer> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Integer> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Integer value1, Integer value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHAreaIsNull() {
            addCriterion("h_area is null");
            return (Criteria) this;
        }

        public Criteria andHAreaIsNotNull() {
            addCriterion("h_area is not null");
            return (Criteria) this;
        }

        public Criteria andHAreaEqualTo(String value) {
            addCriterion("h_area =", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotEqualTo(String value) {
            addCriterion("h_area <>", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaGreaterThan(String value) {
            addCriterion("h_area >", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaGreaterThanOrEqualTo(String value) {
            addCriterion("h_area >=", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaLessThan(String value) {
            addCriterion("h_area <", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaLessThanOrEqualTo(String value) {
            addCriterion("h_area <=", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaLike(String value) {
            addCriterion("h_area like", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotLike(String value) {
            addCriterion("h_area not like", value, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaIn(List<String> values) {
            addCriterion("h_area in", values, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotIn(List<String> values) {
            addCriterion("h_area not in", values, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaBetween(String value1, String value2) {
            addCriterion("h_area between", value1, value2, "hArea");
            return (Criteria) this;
        }

        public Criteria andHAreaNotBetween(String value1, String value2) {
            addCriterion("h_area not between", value1, value2, "hArea");
            return (Criteria) this;
        }

        public Criteria andHEstateIsNull() {
            addCriterion("h_estate is null");
            return (Criteria) this;
        }

        public Criteria andHEstateIsNotNull() {
            addCriterion("h_estate is not null");
            return (Criteria) this;
        }

        public Criteria andHEstateEqualTo(String value) {
            addCriterion("h_estate =", value, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateNotEqualTo(String value) {
            addCriterion("h_estate <>", value, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateGreaterThan(String value) {
            addCriterion("h_estate >", value, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateGreaterThanOrEqualTo(String value) {
            addCriterion("h_estate >=", value, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateLessThan(String value) {
            addCriterion("h_estate <", value, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateLessThanOrEqualTo(String value) {
            addCriterion("h_estate <=", value, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateLike(String value) {
            addCriterion("h_estate like", value, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateNotLike(String value) {
            addCriterion("h_estate not like", value, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateIn(List<String> values) {
            addCriterion("h_estate in", values, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateNotIn(List<String> values) {
            addCriterion("h_estate not in", values, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateBetween(String value1, String value2) {
            addCriterion("h_estate between", value1, value2, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHEstateNotBetween(String value1, String value2) {
            addCriterion("h_estate not between", value1, value2, "hEstate");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberIsNull() {
            addCriterion("h_unitNumber is null");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberIsNotNull() {
            addCriterion("h_unitNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberEqualTo(String value) {
            addCriterion("h_unitNumber =", value, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberNotEqualTo(String value) {
            addCriterion("h_unitNumber <>", value, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberGreaterThan(String value) {
            addCriterion("h_unitNumber >", value, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberGreaterThanOrEqualTo(String value) {
            addCriterion("h_unitNumber >=", value, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberLessThan(String value) {
            addCriterion("h_unitNumber <", value, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberLessThanOrEqualTo(String value) {
            addCriterion("h_unitNumber <=", value, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberLike(String value) {
            addCriterion("h_unitNumber like", value, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberNotLike(String value) {
            addCriterion("h_unitNumber not like", value, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberIn(List<String> values) {
            addCriterion("h_unitNumber in", values, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberNotIn(List<String> values) {
            addCriterion("h_unitNumber not in", values, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberBetween(String value1, String value2) {
            addCriterion("h_unitNumber between", value1, value2, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHUnitnumberNotBetween(String value1, String value2) {
            addCriterion("h_unitNumber not between", value1, value2, "hUnitnumber");
            return (Criteria) this;
        }

        public Criteria andHFloorIsNull() {
            addCriterion("h_floor is null");
            return (Criteria) this;
        }

        public Criteria andHFloorIsNotNull() {
            addCriterion("h_floor is not null");
            return (Criteria) this;
        }

        public Criteria andHFloorEqualTo(Integer value) {
            addCriterion("h_floor =", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorNotEqualTo(Integer value) {
            addCriterion("h_floor <>", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorGreaterThan(Integer value) {
            addCriterion("h_floor >", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_floor >=", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorLessThan(Integer value) {
            addCriterion("h_floor <", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorLessThanOrEqualTo(Integer value) {
            addCriterion("h_floor <=", value, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorIn(List<Integer> values) {
            addCriterion("h_floor in", values, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorNotIn(List<Integer> values) {
            addCriterion("h_floor not in", values, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorBetween(Integer value1, Integer value2) {
            addCriterion("h_floor between", value1, value2, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("h_floor not between", value1, value2, "hFloor");
            return (Criteria) this;
        }

        public Criteria andHRoomnoIsNull() {
            addCriterion("h_roomNo is null");
            return (Criteria) this;
        }

        public Criteria andHRoomnoIsNotNull() {
            addCriterion("h_roomNo is not null");
            return (Criteria) this;
        }

        public Criteria andHRoomnoEqualTo(String value) {
            addCriterion("h_roomNo =", value, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoNotEqualTo(String value) {
            addCriterion("h_roomNo <>", value, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoGreaterThan(String value) {
            addCriterion("h_roomNo >", value, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoGreaterThanOrEqualTo(String value) {
            addCriterion("h_roomNo >=", value, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoLessThan(String value) {
            addCriterion("h_roomNo <", value, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoLessThanOrEqualTo(String value) {
            addCriterion("h_roomNo <=", value, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoLike(String value) {
            addCriterion("h_roomNo like", value, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoNotLike(String value) {
            addCriterion("h_roomNo not like", value, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoIn(List<String> values) {
            addCriterion("h_roomNo in", values, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoNotIn(List<String> values) {
            addCriterion("h_roomNo not in", values, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoBetween(String value1, String value2) {
            addCriterion("h_roomNo between", value1, value2, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHRoomnoNotBetween(String value1, String value2) {
            addCriterion("h_roomNo not between", value1, value2, "hRoomno");
            return (Criteria) this;
        }

        public Criteria andHAcreageIsNull() {
            addCriterion("h_acreage is null");
            return (Criteria) this;
        }

        public Criteria andHAcreageIsNotNull() {
            addCriterion("h_acreage is not null");
            return (Criteria) this;
        }

        public Criteria andHAcreageEqualTo(String value) {
            addCriterion("h_acreage =", value, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageNotEqualTo(String value) {
            addCriterion("h_acreage <>", value, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageGreaterThan(String value) {
            addCriterion("h_acreage >", value, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageGreaterThanOrEqualTo(String value) {
            addCriterion("h_acreage >=", value, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageLessThan(String value) {
            addCriterion("h_acreage <", value, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageLessThanOrEqualTo(String value) {
            addCriterion("h_acreage <=", value, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageLike(String value) {
            addCriterion("h_acreage like", value, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageNotLike(String value) {
            addCriterion("h_acreage not like", value, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageIn(List<String> values) {
            addCriterion("h_acreage in", values, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageNotIn(List<String> values) {
            addCriterion("h_acreage not in", values, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageBetween(String value1, String value2) {
            addCriterion("h_acreage between", value1, value2, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHAcreageNotBetween(String value1, String value2) {
            addCriterion("h_acreage not between", value1, value2, "hAcreage");
            return (Criteria) this;
        }

        public Criteria andHDirectionIsNull() {
            addCriterion("h_direction is null");
            return (Criteria) this;
        }

        public Criteria andHDirectionIsNotNull() {
            addCriterion("h_direction is not null");
            return (Criteria) this;
        }

        public Criteria andHDirectionEqualTo(String value) {
            addCriterion("h_direction =", value, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionNotEqualTo(String value) {
            addCriterion("h_direction <>", value, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionGreaterThan(String value) {
            addCriterion("h_direction >", value, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("h_direction >=", value, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionLessThan(String value) {
            addCriterion("h_direction <", value, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionLessThanOrEqualTo(String value) {
            addCriterion("h_direction <=", value, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionLike(String value) {
            addCriterion("h_direction like", value, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionNotLike(String value) {
            addCriterion("h_direction not like", value, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionIn(List<String> values) {
            addCriterion("h_direction in", values, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionNotIn(List<String> values) {
            addCriterion("h_direction not in", values, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionBetween(String value1, String value2) {
            addCriterion("h_direction between", value1, value2, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHDirectionNotBetween(String value1, String value2) {
            addCriterion("h_direction not between", value1, value2, "hDirection");
            return (Criteria) this;
        }

        public Criteria andHFitmentIsNull() {
            addCriterion("h_fitment is null");
            return (Criteria) this;
        }

        public Criteria andHFitmentIsNotNull() {
            addCriterion("h_fitment is not null");
            return (Criteria) this;
        }

        public Criteria andHFitmentEqualTo(String value) {
            addCriterion("h_fitment =", value, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentNotEqualTo(String value) {
            addCriterion("h_fitment <>", value, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentGreaterThan(String value) {
            addCriterion("h_fitment >", value, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentGreaterThanOrEqualTo(String value) {
            addCriterion("h_fitment >=", value, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentLessThan(String value) {
            addCriterion("h_fitment <", value, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentLessThanOrEqualTo(String value) {
            addCriterion("h_fitment <=", value, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentLike(String value) {
            addCriterion("h_fitment like", value, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentNotLike(String value) {
            addCriterion("h_fitment not like", value, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentIn(List<String> values) {
            addCriterion("h_fitment in", values, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentNotIn(List<String> values) {
            addCriterion("h_fitment not in", values, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentBetween(String value1, String value2) {
            addCriterion("h_fitment between", value1, value2, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHFitmentNotBetween(String value1, String value2) {
            addCriterion("h_fitment not between", value1, value2, "hFitment");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairIsNull() {
            addCriterion("h_isDoubleAir is null");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairIsNotNull() {
            addCriterion("h_isDoubleAir is not null");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairEqualTo(Boolean value) {
            addCriterion("h_isDoubleAir =", value, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairNotEqualTo(Boolean value) {
            addCriterion("h_isDoubleAir <>", value, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairGreaterThan(Boolean value) {
            addCriterion("h_isDoubleAir >", value, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairGreaterThanOrEqualTo(Boolean value) {
            addCriterion("h_isDoubleAir >=", value, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairLessThan(Boolean value) {
            addCriterion("h_isDoubleAir <", value, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairLessThanOrEqualTo(Boolean value) {
            addCriterion("h_isDoubleAir <=", value, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairIn(List<Boolean> values) {
            addCriterion("h_isDoubleAir in", values, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairNotIn(List<Boolean> values) {
            addCriterion("h_isDoubleAir not in", values, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairBetween(Boolean value1, Boolean value2) {
            addCriterion("h_isDoubleAir between", value1, value2, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHIsdoubleairNotBetween(Boolean value1, Boolean value2) {
            addCriterion("h_isDoubleAir not between", value1, value2, "hIsdoubleair");
            return (Criteria) this;
        }

        public Criteria andHLimitIsNull() {
            addCriterion("h_limit is null");
            return (Criteria) this;
        }

        public Criteria andHLimitIsNotNull() {
            addCriterion("h_limit is not null");
            return (Criteria) this;
        }

        public Criteria andHLimitEqualTo(Integer value) {
            addCriterion("h_limit =", value, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitNotEqualTo(Integer value) {
            addCriterion("h_limit <>", value, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitGreaterThan(Integer value) {
            addCriterion("h_limit >", value, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_limit >=", value, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitLessThan(Integer value) {
            addCriterion("h_limit <", value, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitLessThanOrEqualTo(Integer value) {
            addCriterion("h_limit <=", value, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitIn(List<Integer> values) {
            addCriterion("h_limit in", values, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitNotIn(List<Integer> values) {
            addCriterion("h_limit not in", values, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitBetween(Integer value1, Integer value2) {
            addCriterion("h_limit between", value1, value2, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("h_limit not between", value1, value2, "hLimit");
            return (Criteria) this;
        }

        public Criteria andHFacilityIsNull() {
            addCriterion("h_facility is null");
            return (Criteria) this;
        }

        public Criteria andHFacilityIsNotNull() {
            addCriterion("h_facility is not null");
            return (Criteria) this;
        }

        public Criteria andHFacilityEqualTo(String value) {
            addCriterion("h_facility =", value, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityNotEqualTo(String value) {
            addCriterion("h_facility <>", value, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityGreaterThan(String value) {
            addCriterion("h_facility >", value, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityGreaterThanOrEqualTo(String value) {
            addCriterion("h_facility >=", value, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityLessThan(String value) {
            addCriterion("h_facility <", value, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityLessThanOrEqualTo(String value) {
            addCriterion("h_facility <=", value, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityLike(String value) {
            addCriterion("h_facility like", value, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityNotLike(String value) {
            addCriterion("h_facility not like", value, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityIn(List<String> values) {
            addCriterion("h_facility in", values, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityNotIn(List<String> values) {
            addCriterion("h_facility not in", values, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityBetween(String value1, String value2) {
            addCriterion("h_facility between", value1, value2, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHFacilityNotBetween(String value1, String value2) {
            addCriterion("h_facility not between", value1, value2, "hFacility");
            return (Criteria) this;
        }

        public Criteria andHPriceIsNull() {
            addCriterion("h_price is null");
            return (Criteria) this;
        }

        public Criteria andHPriceIsNotNull() {
            addCriterion("h_price is not null");
            return (Criteria) this;
        }

        public Criteria andHPriceEqualTo(Double value) {
            addCriterion("h_price =", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotEqualTo(Double value) {
            addCriterion("h_price <>", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceGreaterThan(Double value) {
            addCriterion("h_price >", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("h_price >=", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLessThan(Double value) {
            addCriterion("h_price <", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceLessThanOrEqualTo(Double value) {
            addCriterion("h_price <=", value, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceIn(List<Double> values) {
            addCriterion("h_price in", values, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotIn(List<Double> values) {
            addCriterion("h_price not in", values, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceBetween(Double value1, Double value2) {
            addCriterion("h_price between", value1, value2, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHPriceNotBetween(Double value1, Double value2) {
            addCriterion("h_price not between", value1, value2, "hPrice");
            return (Criteria) this;
        }

        public Criteria andHStatusIsNull() {
            addCriterion("h_status is null");
            return (Criteria) this;
        }

        public Criteria andHStatusIsNotNull() {
            addCriterion("h_status is not null");
            return (Criteria) this;
        }

        public Criteria andHStatusEqualTo(Integer value) {
            addCriterion("h_status =", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotEqualTo(Integer value) {
            addCriterion("h_status <>", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusGreaterThan(Integer value) {
            addCriterion("h_status >", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_status >=", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusLessThan(Integer value) {
            addCriterion("h_status <", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusLessThanOrEqualTo(Integer value) {
            addCriterion("h_status <=", value, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusIn(List<Integer> values) {
            addCriterion("h_status in", values, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotIn(List<Integer> values) {
            addCriterion("h_status not in", values, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusBetween(Integer value1, Integer value2) {
            addCriterion("h_status between", value1, value2, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("h_status not between", value1, value2, "hStatus");
            return (Criteria) this;
        }

        public Criteria andHImgIsNull() {
            addCriterion("h_img is null");
            return (Criteria) this;
        }

        public Criteria andHImgIsNotNull() {
            addCriterion("h_img is not null");
            return (Criteria) this;
        }

        public Criteria andHImgEqualTo(String value) {
            addCriterion("h_img =", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotEqualTo(String value) {
            addCriterion("h_img <>", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgGreaterThan(String value) {
            addCriterion("h_img >", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgGreaterThanOrEqualTo(String value) {
            addCriterion("h_img >=", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLessThan(String value) {
            addCriterion("h_img <", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLessThanOrEqualTo(String value) {
            addCriterion("h_img <=", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgLike(String value) {
            addCriterion("h_img like", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotLike(String value) {
            addCriterion("h_img not like", value, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgIn(List<String> values) {
            addCriterion("h_img in", values, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotIn(List<String> values) {
            addCriterion("h_img not in", values, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgBetween(String value1, String value2) {
            addCriterion("h_img between", value1, value2, "hImg");
            return (Criteria) this;
        }

        public Criteria andHImgNotBetween(String value1, String value2) {
            addCriterion("h_img not between", value1, value2, "hImg");
            return (Criteria) this;
        }

        public Criteria andHAddressIsNull() {
            addCriterion("h_address is null");
            return (Criteria) this;
        }

        public Criteria andHAddressIsNotNull() {
            addCriterion("h_address is not null");
            return (Criteria) this;
        }

        public Criteria andHAddressEqualTo(String value) {
            addCriterion("h_address =", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressNotEqualTo(String value) {
            addCriterion("h_address <>", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressGreaterThan(String value) {
            addCriterion("h_address >", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressGreaterThanOrEqualTo(String value) {
            addCriterion("h_address >=", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressLessThan(String value) {
            addCriterion("h_address <", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressLessThanOrEqualTo(String value) {
            addCriterion("h_address <=", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressLike(String value) {
            addCriterion("h_address like", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressNotLike(String value) {
            addCriterion("h_address not like", value, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressIn(List<String> values) {
            addCriterion("h_address in", values, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressNotIn(List<String> values) {
            addCriterion("h_address not in", values, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressBetween(String value1, String value2) {
            addCriterion("h_address between", value1, value2, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddressNotBetween(String value1, String value2) {
            addCriterion("h_address not between", value1, value2, "hAddress");
            return (Criteria) this;
        }

        public Criteria andHAddtimeIsNull() {
            addCriterion("h_addtime is null");
            return (Criteria) this;
        }

        public Criteria andHAddtimeIsNotNull() {
            addCriterion("h_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andHAddtimeEqualTo(Date value) {
            addCriterion("h_addtime =", value, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeNotEqualTo(Date value) {
            addCriterion("h_addtime <>", value, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeGreaterThan(Date value) {
            addCriterion("h_addtime >", value, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("h_addtime >=", value, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeLessThan(Date value) {
            addCriterion("h_addtime <", value, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("h_addtime <=", value, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeIn(List<Date> values) {
            addCriterion("h_addtime in", values, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeNotIn(List<Date> values) {
            addCriterion("h_addtime not in", values, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeBetween(Date value1, Date value2) {
            addCriterion("h_addtime between", value1, value2, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("h_addtime not between", value1, value2, "hAddtime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeIsNull() {
            addCriterion("h_updateTime is null");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeIsNotNull() {
            addCriterion("h_updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeEqualTo(Date value) {
            addCriterion("h_updateTime =", value, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeNotEqualTo(Date value) {
            addCriterion("h_updateTime <>", value, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeGreaterThan(Date value) {
            addCriterion("h_updateTime >", value, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("h_updateTime >=", value, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeLessThan(Date value) {
            addCriterion("h_updateTime <", value, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("h_updateTime <=", value, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeIn(List<Date> values) {
            addCriterion("h_updateTime in", values, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeNotIn(List<Date> values) {
            addCriterion("h_updateTime not in", values, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("h_updateTime between", value1, value2, "hUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("h_updateTime not between", value1, value2, "hUpdatetime");
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