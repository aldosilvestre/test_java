package ar.com.java.test.transacction.infraestructure.implementation;

import ar.com.java.test.transacction.domain.ResultTransfer;
import ar.com.java.test.transacction.domain.TransferDTO;
import ar.com.java.test.transacction.domain.TransferMessage;
import ar.com.java.test.transacction.infraestructure.ITransferClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;


@Service
public class TransferClient implements ITransferClient {

    private static final Logger logger = LoggerFactory.getLogger(TransferClient.class);

    @Value("${service.queue_name}")
    private Queue queue;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private WebClient webClient;

    @Override
    public void sendTransfer(TransferMessage transfer) {
        logger.info(String.format(">>>> sendTransaction with id %s <<<<", transfer.getUuid()));
        rabbitTemplate.convertAndSend(queue.getName(), transfer);
    }


}
