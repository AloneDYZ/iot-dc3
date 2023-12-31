/*
 * Copyright 2022 Pnoker All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.pnoker.driver.mqtt.service.impl;

import io.github.pnoker.common.bean.point.PointValue;
import io.github.pnoker.common.sdk.bean.mqtt.MqttMessage;
import io.github.pnoker.common.sdk.service.DriverService;
import io.github.pnoker.common.utils.JsonUtil;
import io.github.pnoker.driver.mqtt.service.MqttReceiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pnoker
 */
@Slf4j
@Service
public class MqttReceiveServiceImpl implements MqttReceiveService {

    @Resource
    private DriverService driverService;

    @Override
    public void receiveValue(MqttMessage mqttMessage) {
        log.info(JsonUtil.toPrettyJsonString(mqttMessage));
        PointValue pointValue = JsonUtil.parseObject(mqttMessage.getMessagePayload().getPayload(), PointValue.class);
        driverService.pointValueSender(pointValue);
    }

    @Override
    public void receiveValues(List<MqttMessage> mqttMessageList) {
        log.info(JsonUtil.toPrettyJsonString(mqttMessageList));
        List<PointValue> pointValues = mqttMessageList.stream()
                .map(mqttMessage -> JsonUtil.parseObject(mqttMessage.getMessagePayload().getPayload(), PointValue.class)).collect(Collectors.toList());
        driverService.pointValueSender(pointValues);
    }
}
