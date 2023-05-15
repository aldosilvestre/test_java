package ar.com.java.test.transacction.infraestructure.Handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestController
public class AppExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);

//    @ExceptionHandler({WebClientResponseException.BadRequest.class})
//    public String handleBadRequestException(WebClientResponseException exception){
//        logger.error("<< BAD REQUEST >>");
//        logger.error(exception.getLocalizedMessage(), exception);
//        return exception.getMessage();
//    }

    @ExceptionHandler({ Exception.class})
    public String handleUncontrollerException(Exception exception){
        logger.error(exception.getLocalizedMessage(), exception);
        return "Hubo un error.";
    }


}
