package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by yangjingkang on 2020/8/19.
 */
@RestController
public class Api {

    private static final Logger logger = LoggerFactory.getLogger(Api.class);


    @GetMapping(value="/api")
    public String execute(@RequestParam Map<String,String> map) {
        logger.info("开始调用>>>>>>>>>>");
        logger.info(map.toString());

        return map.toString();
    }
}
