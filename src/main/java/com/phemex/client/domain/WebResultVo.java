package com.phemex.client.domain;

import java.util.List;
import lombok.Data;

@Data
public class WebResultVo {
    private List<OrderModelVo> rows;
}
