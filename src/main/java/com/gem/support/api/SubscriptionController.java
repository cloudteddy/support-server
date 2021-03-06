package com.gem.support.api;

import com.gem.support.service.SubscriptionService;
import com.gem.support.service.dto.SubscriptionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("billing/subscription")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public SubscriptionDTO findOne(@PathVariable(value = "id") String companyId) {
        return subscriptionService.findOne(companyId);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public Page<SubscriptionDTO> findAll(
            @RequestParam(name = "startDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam(name = "expirationDate", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date expirationDate,
            Pageable pageable) {
        return subscriptionService.find(startDate, expirationDate, pageable);
    }

}
