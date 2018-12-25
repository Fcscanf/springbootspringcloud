package cn.fcsca.providerticket.controller;

import cn.fcsca.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TicketController
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 21:55 2018-08-26
 */
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket() {
        return ticketService.getTicket();
    }
}
