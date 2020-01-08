package com.system.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherPwdIsNull() {
            addCriterion("teacher_pwd is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdIsNotNull() {
            addCriterion("teacher_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdEqualTo(String value) {
            addCriterion("teacher_pwd =", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotEqualTo(String value) {
            addCriterion("teacher_pwd <>", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdGreaterThan(String value) {
            addCriterion("teacher_pwd >", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_pwd >=", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLessThan(String value) {
            addCriterion("teacher_pwd <", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLessThanOrEqualTo(String value) {
            addCriterion("teacher_pwd <=", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdLike(String value) {
            addCriterion("teacher_pwd like", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotLike(String value) {
            addCriterion("teacher_pwd not like", value, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdIn(List<String> values) {
            addCriterion("teacher_pwd in", values, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotIn(List<String> values) {
            addCriterion("teacher_pwd not in", values, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdBetween(String value1, String value2) {
            addCriterion("teacher_pwd between", value1, value2, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andTeacherPwdNotBetween(String value1, String value2) {
            addCriterion("teacher_pwd not between", value1, value2, "teacherPwd");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andTeachCourseIsNull() {
            addCriterion("teach_course is null");
            return (Criteria) this;
        }

        public Criteria andTeachCourseIsNotNull() {
            addCriterion("teach_course is not null");
            return (Criteria) this;
        }

        public Criteria andTeachCourseEqualTo(String value) {
            addCriterion("teach_course =", value, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseNotEqualTo(String value) {
            addCriterion("teach_course <>", value, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseGreaterThan(String value) {
            addCriterion("teach_course >", value, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseGreaterThanOrEqualTo(String value) {
            addCriterion("teach_course >=", value, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseLessThan(String value) {
            addCriterion("teach_course <", value, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseLessThanOrEqualTo(String value) {
            addCriterion("teach_course <=", value, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseLike(String value) {
            addCriterion("teach_course like", value, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseNotLike(String value) {
            addCriterion("teach_course not like", value, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseIn(List<String> values) {
            addCriterion("teach_course in", values, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseNotIn(List<String> values) {
            addCriterion("teach_course not in", values, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseBetween(String value1, String value2) {
            addCriterion("teach_course between", value1, value2, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachCourseNotBetween(String value1, String value2) {
            addCriterion("teach_course not between", value1, value2, "teachCourse");
            return (Criteria) this;
        }

        public Criteria andTeachIdIsNull() {
            addCriterion("teach_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachIdIsNotNull() {
            addCriterion("teach_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachIdEqualTo(String value) {
            addCriterion("teach_id =", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdNotEqualTo(String value) {
            addCriterion("teach_id <>", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdGreaterThan(String value) {
            addCriterion("teach_id >", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdGreaterThanOrEqualTo(String value) {
            addCriterion("teach_id >=", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdLessThan(String value) {
            addCriterion("teach_id <", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdLessThanOrEqualTo(String value) {
            addCriterion("teach_id <=", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdLike(String value) {
            addCriterion("teach_id like", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdNotLike(String value) {
            addCriterion("teach_id not like", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdIn(List<String> values) {
            addCriterion("teach_id in", values, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdNotIn(List<String> values) {
            addCriterion("teach_id not in", values, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdBetween(String value1, String value2) {
            addCriterion("teach_id between", value1, value2, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdNotBetween(String value1, String value2) {
            addCriterion("teach_id not between", value1, value2, "teachId");
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