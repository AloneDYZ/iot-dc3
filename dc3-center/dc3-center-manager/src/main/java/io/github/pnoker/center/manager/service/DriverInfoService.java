/*
 * Copyright 2016-present Pnoker All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      https://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.pnoker.center.manager.service;

import io.github.pnoker.center.manager.entity.query.DriverInfoPageQuery;
import io.github.pnoker.common.base.Service;
import io.github.pnoker.common.model.DriverInfo;

import java.util.List;

/**
 * DriverInfo Interface
 *
 * @author pnoker
 * @since 2022.1.0
 */
public interface DriverInfoService extends Service<DriverInfo, DriverInfoPageQuery> {

    /**
     * 根据驱动属性配置 ID 和 设备 ID 查询
     *
     * @param deviceId          设备ID
     * @param driverAttributeId Driver Attribute ID
     * @return DriverInfo
     */
    DriverInfo selectByDeviceIdAndAttributeId(String deviceId, String driverAttributeId);

    /**
     * 根据驱动属性配置 ID 查询
     *
     * @param driverAttributeId Driver Attribute ID
     * @return DriverInfo Array
     */
    List<DriverInfo> selectByAttributeId(String driverAttributeId);

    /**
     * 根据设备 ID 查询
     *
     * @param deviceId 设备ID
     * @return DriverInfo Array
     */
    List<DriverInfo> selectByDeviceId(String deviceId);
}