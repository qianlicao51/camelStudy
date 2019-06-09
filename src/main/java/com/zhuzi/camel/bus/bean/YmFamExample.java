package com.zhuzi.camel.bus.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YmFamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected java.util.List<Criteria> oredCriteria;

    public YmFamExample() {
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

    public java.util.List<Criteria> getOredCriteria() {
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

    protected abstract static class GeneratedCriteria {
        protected java.util.List<Criterion> criteria;

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

        public java.util.List<Criterion> getCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(java.util.List<java.lang.Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(java.util.List<java.lang.Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(java.util.List<java.lang.String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(java.util.List<java.lang.String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBirthnIsNull() {
            addCriterion("birthN is null");
            return (Criteria) this;
        }

        public Criteria andBirthnIsNotNull() {
            addCriterion("birthN is not null");
            return (Criteria) this;
        }

        public Criteria andBirthnEqualTo(Integer value) {
            addCriterion("birthN =", value, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnNotEqualTo(Integer value) {
            addCriterion("birthN <>", value, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnGreaterThan(Integer value) {
            addCriterion("birthN >", value, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnGreaterThanOrEqualTo(Integer value) {
            addCriterion("birthN >=", value, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnLessThan(Integer value) {
            addCriterion("birthN <", value, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnLessThanOrEqualTo(Integer value) {
            addCriterion("birthN <=", value, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnIn(java.util.List<java.lang.Integer> values) {
            addCriterion("birthN in", values, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnNotIn(java.util.List<java.lang.Integer> values) {
            addCriterion("birthN not in", values, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnBetween(Integer value1, Integer value2) {
            addCriterion("birthN between", value1, value2, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthnNotBetween(Integer value1, Integer value2) {
            addCriterion("birthN not between", value1, value2, "birthn");
            return (Criteria) this;
        }

        public Criteria andBirthgIsNull() {
            addCriterion("birthG is null");
            return (Criteria) this;
        }

        public Criteria andBirthgIsNotNull() {
            addCriterion("birthG is not null");
            return (Criteria) this;
        }

        public Criteria andBirthgEqualTo(Integer value) {
            addCriterion("birthG =", value, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgNotEqualTo(Integer value) {
            addCriterion("birthG <>", value, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgGreaterThan(Integer value) {
            addCriterion("birthG >", value, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgGreaterThanOrEqualTo(Integer value) {
            addCriterion("birthG >=", value, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgLessThan(Integer value) {
            addCriterion("birthG <", value, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgLessThanOrEqualTo(Integer value) {
            addCriterion("birthG <=", value, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgIn(java.util.List<java.lang.Integer> values) {
            addCriterion("birthG in", values, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgNotIn(java.util.List<java.lang.Integer> values) {
            addCriterion("birthG not in", values, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgBetween(Integer value1, Integer value2) {
            addCriterion("birthG between", value1, value2, "birthg");
            return (Criteria) this;
        }

        public Criteria andBirthgNotBetween(Integer value1, Integer value2) {
            addCriterion("birthG not between", value1, value2, "birthg");
            return (Criteria) this;
        }

        public Criteria andWishIsNull() {
            addCriterion("wish is null");
            return (Criteria) this;
        }

        public Criteria andWishIsNotNull() {
            addCriterion("wish is not null");
            return (Criteria) this;
        }

        public Criteria andWishEqualTo(String value) {
            addCriterion("wish =", value, "wish");
            return (Criteria) this;
        }

        public Criteria andWishNotEqualTo(String value) {
            addCriterion("wish <>", value, "wish");
            return (Criteria) this;
        }

        public Criteria andWishGreaterThan(String value) {
            addCriterion("wish >", value, "wish");
            return (Criteria) this;
        }

        public Criteria andWishGreaterThanOrEqualTo(String value) {
            addCriterion("wish >=", value, "wish");
            return (Criteria) this;
        }

        public Criteria andWishLessThan(String value) {
            addCriterion("wish <", value, "wish");
            return (Criteria) this;
        }

        public Criteria andWishLessThanOrEqualTo(String value) {
            addCriterion("wish <=", value, "wish");
            return (Criteria) this;
        }

        public Criteria andWishLike(String value) {
            addCriterion("wish like", value, "wish");
            return (Criteria) this;
        }

        public Criteria andWishNotLike(String value) {
            addCriterion("wish not like", value, "wish");
            return (Criteria) this;
        }

        public Criteria andWishIn(java.util.List<java.lang.String> values) {
            addCriterion("wish in", values, "wish");
            return (Criteria) this;
        }

        public Criteria andWishNotIn(java.util.List<java.lang.String> values) {
            addCriterion("wish not in", values, "wish");
            return (Criteria) this;
        }

        public Criteria andWishBetween(String value1, String value2) {
            addCriterion("wish between", value1, value2, "wish");
            return (Criteria) this;
        }

        public Criteria andWishNotBetween(String value1, String value2) {
            addCriterion("wish not between", value1, value2, "wish");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(java.util.List<java.util.Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andAddidIsNull() {
            addCriterion("addid is null");
            return (Criteria) this;
        }

        public Criteria andAddidIsNotNull() {
            addCriterion("addid is not null");
            return (Criteria) this;
        }

        public Criteria andAddidEqualTo(String value) {
            addCriterion("addid =", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidNotEqualTo(String value) {
            addCriterion("addid <>", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidGreaterThan(String value) {
            addCriterion("addid >", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidGreaterThanOrEqualTo(String value) {
            addCriterion("addid >=", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidLessThan(String value) {
            addCriterion("addid <", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidLessThanOrEqualTo(String value) {
            addCriterion("addid <=", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidLike(String value) {
            addCriterion("addid like", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidNotLike(String value) {
            addCriterion("addid not like", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidIn(java.util.List<java.lang.String> values) {
            addCriterion("addid in", values, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidNotIn(java.util.List<java.lang.String> values) {
            addCriterion("addid not in", values, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidBetween(String value1, String value2) {
            addCriterion("addid between", value1, value2, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidNotBetween(String value1, String value2) {
            addCriterion("addid not between", value1, value2, "addid");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("picpath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("picpath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("picpath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("picpath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("picpath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("picpath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("picpath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("picpath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("picpath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("picpath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(java.util.List<java.lang.String> values) {
            addCriterion("picpath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(java.util.List<java.lang.String> values) {
            addCriterion("picpath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("picpath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("picpath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isshow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isshow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(String value) {
            addCriterion("isshow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(String value) {
            addCriterion("isshow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(String value) {
            addCriterion("isshow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(String value) {
            addCriterion("isshow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(String value) {
            addCriterion("isshow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(String value) {
            addCriterion("isshow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLike(String value) {
            addCriterion("isshow like", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotLike(String value) {
            addCriterion("isshow not like", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(java.util.List<java.lang.String> values) {
            addCriterion("isshow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(java.util.List<java.lang.String> values) {
            addCriterion("isshow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(String value1, String value2) {
            addCriterion("isshow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(String value1, String value2) {
            addCriterion("isshow not between", value1, value2, "isshow");
            return (Criteria) this;
        }
    }

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