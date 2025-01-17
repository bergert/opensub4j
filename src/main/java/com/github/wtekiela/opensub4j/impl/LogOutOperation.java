/**
 * Copyright (c) 2017 Wojciech Tekiela
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.github.wtekiela.opensub4j.impl;

@SuppressWarnings("rawtypes")
class LogOutOperation extends AbstractOperation {

    private final String loginToken;

    public LogOutOperation(String loginToken) {
        this.loginToken = loginToken;
    }

    @Override
    String getMethodName() {
        return "LogOut";
    }

    @Override
    Object[] getParams() {
        return new Object[]{loginToken};
    }

    @Override
    Object getResponseObject() {
        return null;
    }

}
