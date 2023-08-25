package com.singh.base.CustomeAnnotations;
/*
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.singh.base.constants.GlobalEmployeeFieldsConstants;
import com.singh.base.constants.GlobalRegex;

@NotNull
@Pattern.List({
    @Pattern(regexp= GlobalRegex.dateFormat1),
    @Pattern(regexp=GlobalRegex.dateFormat2)
})
@Constraint(validatedBy = {})
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented

//@ReportAsSingleViolation // Used This annotation If i want to print only default message not regexp specific message 
//{use This Document for reference : https://docs.jboss.org/hibernate/validator/5.0/reference/en-US/html_single/#validator-customconstraints-compound}
// Stackoverflow solution {https://stackoverflow.com/questions/16225015/multiple-regex-patterns-for-1-field}
public @interface validateDateFormat {

    String message() default GlobalEmployeeFieldsConstants.employeeJoiningDateInvalid;

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
*/