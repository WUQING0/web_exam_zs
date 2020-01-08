package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class LianxiXuanzeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LianxiXuanzeExample() {
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

        public Criteria andLianxiIdIsNull() {
            addCriterion("lianxi_id is null");
            return (Criteria) this;
        }

        public Criteria andLianxiIdIsNotNull() {
            addCriterion("lianxi_id is not null");
            return (Criteria) this;
        }

        public Criteria andLianxiIdEqualTo(Integer value) {
            addCriterion("lianxi_id =", value, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdNotEqualTo(Integer value) {
            addCriterion("lianxi_id <>", value, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdGreaterThan(Integer value) {
            addCriterion("lianxi_id >", value, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lianxi_id >=", value, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdLessThan(Integer value) {
            addCriterion("lianxi_id <", value, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdLessThanOrEqualTo(Integer value) {
            addCriterion("lianxi_id <=", value, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdIn(List<Integer> values) {
            addCriterion("lianxi_id in", values, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdNotIn(List<Integer> values) {
            addCriterion("lianxi_id not in", values, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdBetween(Integer value1, Integer value2) {
            addCriterion("lianxi_id between", value1, value2, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lianxi_id not between", value1, value2, "lianxiId");
            return (Criteria) this;
        }

        public Criteria andLianxiNameIsNull() {
            addCriterion("lianxi_name is null");
            return (Criteria) this;
        }

        public Criteria andLianxiNameIsNotNull() {
            addCriterion("lianxi_name is not null");
            return (Criteria) this;
        }

        public Criteria andLianxiNameEqualTo(String value) {
            addCriterion("lianxi_name =", value, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameNotEqualTo(String value) {
            addCriterion("lianxi_name <>", value, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameGreaterThan(String value) {
            addCriterion("lianxi_name >", value, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameGreaterThanOrEqualTo(String value) {
            addCriterion("lianxi_name >=", value, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameLessThan(String value) {
            addCriterion("lianxi_name <", value, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameLessThanOrEqualTo(String value) {
            addCriterion("lianxi_name <=", value, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameLike(String value) {
            addCriterion("lianxi_name like", value, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameNotLike(String value) {
            addCriterion("lianxi_name not like", value, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameIn(List<String> values) {
            addCriterion("lianxi_name in", values, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameNotIn(List<String> values) {
            addCriterion("lianxi_name not in", values, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameBetween(String value1, String value2) {
            addCriterion("lianxi_name between", value1, value2, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andLianxiNameNotBetween(String value1, String value2) {
            addCriterion("lianxi_name not between", value1, value2, "lianxiName");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andAnswerAIsNull() {
            addCriterion("answer_A is null");
            return (Criteria) this;
        }

        public Criteria andAnswerAIsNotNull() {
            addCriterion("answer_A is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerAEqualTo(String value) {
            addCriterion("answer_A =", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotEqualTo(String value) {
            addCriterion("answer_A <>", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAGreaterThan(String value) {
            addCriterion("answer_A >", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAGreaterThanOrEqualTo(String value) {
            addCriterion("answer_A >=", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALessThan(String value) {
            addCriterion("answer_A <", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALessThanOrEqualTo(String value) {
            addCriterion("answer_A <=", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerALike(String value) {
            addCriterion("answer_A like", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotLike(String value) {
            addCriterion("answer_A not like", value, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerAIn(List<String> values) {
            addCriterion("answer_A in", values, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotIn(List<String> values) {
            addCriterion("answer_A not in", values, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerABetween(String value1, String value2) {
            addCriterion("answer_A between", value1, value2, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerANotBetween(String value1, String value2) {
            addCriterion("answer_A not between", value1, value2, "answerA");
            return (Criteria) this;
        }

        public Criteria andAnswerBIsNull() {
            addCriterion("answer_B is null");
            return (Criteria) this;
        }

        public Criteria andAnswerBIsNotNull() {
            addCriterion("answer_B is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerBEqualTo(String value) {
            addCriterion("answer_B =", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotEqualTo(String value) {
            addCriterion("answer_B <>", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBGreaterThan(String value) {
            addCriterion("answer_B >", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBGreaterThanOrEqualTo(String value) {
            addCriterion("answer_B >=", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLessThan(String value) {
            addCriterion("answer_B <", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLessThanOrEqualTo(String value) {
            addCriterion("answer_B <=", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBLike(String value) {
            addCriterion("answer_B like", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotLike(String value) {
            addCriterion("answer_B not like", value, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBIn(List<String> values) {
            addCriterion("answer_B in", values, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotIn(List<String> values) {
            addCriterion("answer_B not in", values, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBBetween(String value1, String value2) {
            addCriterion("answer_B between", value1, value2, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerBNotBetween(String value1, String value2) {
            addCriterion("answer_B not between", value1, value2, "answerB");
            return (Criteria) this;
        }

        public Criteria andAnswerCIsNull() {
            addCriterion("answer_C is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCIsNotNull() {
            addCriterion("answer_C is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCEqualTo(String value) {
            addCriterion("answer_C =", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotEqualTo(String value) {
            addCriterion("answer_C <>", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCGreaterThan(String value) {
            addCriterion("answer_C >", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCGreaterThanOrEqualTo(String value) {
            addCriterion("answer_C >=", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLessThan(String value) {
            addCriterion("answer_C <", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLessThanOrEqualTo(String value) {
            addCriterion("answer_C <=", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCLike(String value) {
            addCriterion("answer_C like", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotLike(String value) {
            addCriterion("answer_C not like", value, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCIn(List<String> values) {
            addCriterion("answer_C in", values, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotIn(List<String> values) {
            addCriterion("answer_C not in", values, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCBetween(String value1, String value2) {
            addCriterion("answer_C between", value1, value2, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerCNotBetween(String value1, String value2) {
            addCriterion("answer_C not between", value1, value2, "answerC");
            return (Criteria) this;
        }

        public Criteria andAnswerDIsNull() {
            addCriterion("answer_D is null");
            return (Criteria) this;
        }

        public Criteria andAnswerDIsNotNull() {
            addCriterion("answer_D is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerDEqualTo(String value) {
            addCriterion("answer_D =", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotEqualTo(String value) {
            addCriterion("answer_D <>", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDGreaterThan(String value) {
            addCriterion("answer_D >", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDGreaterThanOrEqualTo(String value) {
            addCriterion("answer_D >=", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLessThan(String value) {
            addCriterion("answer_D <", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLessThanOrEqualTo(String value) {
            addCriterion("answer_D <=", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDLike(String value) {
            addCriterion("answer_D like", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotLike(String value) {
            addCriterion("answer_D not like", value, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDIn(List<String> values) {
            addCriterion("answer_D in", values, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotIn(List<String> values) {
            addCriterion("answer_D not in", values, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDBetween(String value1, String value2) {
            addCriterion("answer_D between", value1, value2, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerDNotBetween(String value1, String value2) {
            addCriterion("answer_D not between", value1, value2, "answerD");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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