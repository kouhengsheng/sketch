/*
 * Copyright (C) 2017 Peng fei Pan <sky@xiaopan.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.sketch.uri;

import me.xiaopan.sketch.request.UriScheme;

public class ContentUriModel implements UriModel {
    private static final String SCHEME = "content://";

    @Override
    public boolean match(String uri) {
        return uri != null && uri.startsWith(SCHEME);
    }

    @Override
    public UriScheme getUriScheme() {
        return UriScheme.CONTENT;
    }

    @Override
    public String getUriContent(String uri) {
        return uri;
    }

    @Override
    public String getDiskCacheKey(String uri) {
        return uri;
    }
}
