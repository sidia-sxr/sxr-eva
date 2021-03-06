/*
 * Copyright 2015 Samsung Electronics Co., LTD
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
 *
 */

package br.org.sidia.eva.mode.sharinganchor.view.impl;

import android.view.View;

import br.org.sidia.eva.R;
import br.org.sidia.eva.mode.sharinganchor.view.ISharingErrorView;
import br.org.sidia.eva.view.BaseView;
import br.org.sidia.eva.view.IViewController;

public class SharingErrorView extends BaseView implements ISharingErrorView {

    private View mCancelButton;
    private View mRetryButton;

    public SharingErrorView(View view, IViewController controller) {
        super(view, controller);
        this.mCancelButton = view.findViewById(R.id.button_cancel);
        this.mRetryButton = view.findViewById(R.id.button_retry);
    }

    @Override
    public void setCancelClickListener(View.OnClickListener listener) {
        mCancelButton.setOnClickListener(listener);
    }

    @Override
    public void setRetryClickListener(View.OnClickListener listener) {
        mRetryButton.setOnClickListener(listener);
    }
}
