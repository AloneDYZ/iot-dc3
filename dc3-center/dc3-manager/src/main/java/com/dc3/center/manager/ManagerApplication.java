/*
 * Copyright 2016-2021 Pnoker. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dc3.center.manager;

import com.dc3.config.autoconfigure.Dc3Application;
import com.dc3.config.boot.SpringApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>设备管理服务入口
 *
 * @author pnoker
 */
@Dc3Application
@EnableTransactionManagement
@EnableCaching(mode = AdviceMode.ASPECTJ)
public class ManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class, args);
    }
}

