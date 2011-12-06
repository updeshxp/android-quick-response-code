/*
 * Copyright (C) 2008 ZXing authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jwetherell.quick_response_code.result;

import com.jwetherell.quick_response_code.R;
import com.jwetherell.quick_response_code.core.result.ParsedResult;

import android.app.Activity;


/**
 * Handles geographic coordinates (typically encoded as geo: URLs).
 * 
 * @author dswitkin@google.com (Daniel Switkin)
 */
public final class GeoResultHandler extends ResultHandler {
    
    public GeoResultHandler(Activity activity, ParsedResult result) {
        super(activity, result);
    }

    @Override
    public int getDisplayTitle() {
        return R.string.result_geo;
    }
}
