package com.sensin.tcc.clientA.feign;


import com.sensin.api.pbms.fallback.UserFeignServiceFallback;
import com.sensin.model.general.ResultDTO;
import com.sensin.tcc.clientA.feign.fallback.ClientBFeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "service-clientB", fallback = ClientBFeignServiceFallBack.class)
public interface ClientBFeignService {
    @RequestMapping("/cb/add")
    ResultDTO add(@RequestParam(value = "appName") String appName);
}
