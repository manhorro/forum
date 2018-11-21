package org.fasttrackit.forum.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forum")
public class ShopController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopController.class);

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = {"/{blueprintId}"}, method = RequestMethod.GET)
    public Shop findShop(@PathVariable("shopId") Long shopId) {
        LOGGER.info("shopId >> {}", shopId);

        return shopService.findOne(shopId);
    }

}
