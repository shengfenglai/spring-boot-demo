package spring.boot.demo.controller;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.starter.time.utils.TimeUtils;

@RestController
public class TimeUtilsStarterController {

    @Autowired
    private TimeUtils timeUtils;

    @RequestMapping("/time/utils/gain-now-time.htm")
    public String gainNowTime() {
        return timeUtils.generateCreateTimeText(new DateTime("2017-02-22T15:30:30").toDate());
    }
}
