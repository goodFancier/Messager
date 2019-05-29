package com.messager.Controller;

import com.messager.Entity.Data;
import com.messager.Service.DataService;
import com.messager.Service.UserDataService;
import com.messager.Utils.Ajax;
import com.messager.Utils.RestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Controller
@RequestMapping("/")
public class DataController extends ExceptionHandlerController {

    private static final Logger LOG = LoggerFactory.getLogger(DataController.class);

    @Autowired
    @Qualifier("dataService")
    private DataService dataService;

    @Autowired
    UserDataService userDataService;

    private List<Data> dataList = new ArrayList<>();

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> persist(@RequestParam("data") String data) throws RestException
    {
        try {
            if (data == null || data.equals("")) {
                return Ajax.emptyResponse();
            }
            dataService.persist(data);
            return Ajax.emptyResponse();
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> getRandomData() throws RestException {
        try {
            Set<String> result = dataService.getRandomData();
            return Ajax.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = "/getDataTable", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> getDataTable() throws RestException {
        dataList.add(new Data("1","Вася","221","231231"));
        dataList.add(new Data("2","Алексей","225","231"));
        dataList.add(new Data("3","Дмитрий","224","231232131"));
        dataList.add(new Data("4","Петрович","22123","221331"));
        try {
            return Ajax.successResponse(dataList);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }


}
