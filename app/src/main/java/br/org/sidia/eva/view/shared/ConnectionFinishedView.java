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

package br.org.sidia.eva.view.shared;

import android.view.View;
import android.widget.TextView;

import br.org.sidia.eva.R;
import br.org.sidia.eva.view.BaseView;
import br.org.sidia.eva.view.IViewController;

public class ConnectionFinishedView extends BaseView implements IConnectionFinishedView {

    private TextView mStatusText;
    private View mOkButton;

    public ConnectionFinishedView(View view, IViewController controller) {
        super(view, controller);
        this.mStatusText = view.findViewById(R.id.text_status);
        this.mOkButton = view.findViewById(R.id.button_ok);
    }

    @Override
    public void setStatusText(CharSequence text) {
        runOnUiThread(() -> mStatusText.setText(text));
    }

    @Override
    public void setOkClickListener(View.OnClickListener listener) {
        mOkButton.setOnClickListener(listener);
    }
}