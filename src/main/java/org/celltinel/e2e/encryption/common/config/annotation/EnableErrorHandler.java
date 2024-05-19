package org.celltinel.e2e.encryption.common.config.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.celltinel.e2e.encryption.common.error.CommonErrorHandler;
import org.springframework.context.annotation.Import;

@Target(TYPE)
@Retention(RUNTIME)
@Import(CommonErrorHandler.class)
public @interface EnableErrorHandler {
}