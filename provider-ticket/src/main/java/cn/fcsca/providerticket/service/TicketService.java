package cn.fcsca.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * TicketService
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 21:53 2018-08-26
 */
@Service
public class TicketService {

    public String getTicket() {
        System.out.println(8001);
        return "《Fcscanf》";
    }
}
