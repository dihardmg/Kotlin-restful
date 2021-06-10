package comdihardmg.kotlinresrfulapi.controller

import comdihardmg.kotlinresrfulapi.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHendler(constrainViolationException: ConstraintViolationException): WebResponse<String>{

        return WebResponse(
            code = 400,
            status = "BAD REQUEST",
            data = constrainViolationException.message!!
        )
    }
}