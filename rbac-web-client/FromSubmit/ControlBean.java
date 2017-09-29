package org.lanqiao.rbac.api;

import com.alibaba.fastjson.JSON;
import org.lanqiao.rbac.FromSubmit.Point;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
@Controller
@ResponseBody
public class ControlBean {
    @RequestMapping("/getPonit")
    public ModelAndView getPoint(Point point){
        ModelAndView modelAndView=new ModelAndView();
        Map<String,Object> pointMap=new HashMap<>();
        pointMap.put("param",point.getPoint_x());
        pointMap.put("param1",point.getPoint_y());
        modelAndView.addObject("pointMap", JSON.toJSONString(pointMap));
        modelAndView.setViewName("http://localhost:63342/web2017/rbac-web-client/Test0921/GetValue.html");
        return modelAndView;
    }
}
