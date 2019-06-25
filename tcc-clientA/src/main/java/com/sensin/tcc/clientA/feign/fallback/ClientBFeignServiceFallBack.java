package com.sensin.tcc.clientA.feign.fallback;

import com.sensin.model.enums.ResultEnum;
import com.sensin.model.exception.BizException;
import com.sensin.model.general.ResultDTO;
import com.sensin.tcc.clientA.feign.ClientBFeignService;
import org.springframework.stereotype.Component;

@Component
public class ClientBFeignServiceFallBack implements ClientBFeignService {
    @Override
    public ResultDTO add(String appName) {
        throw BizException.build(ResultEnum.FEIGN_EXCEPTION);
    }
}
