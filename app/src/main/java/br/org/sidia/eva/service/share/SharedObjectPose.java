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

package br.org.sidia.eva.service.share;

import android.support.annotation.NonNull;

import br.org.sidia.eva.constant.EvaObjectType;

import java.io.Serializable;
import java.util.Arrays;

public class SharedObjectPose implements Serializable {

    @EvaObjectType
    private String objectType;
    private float[] modelMatrix;

    public SharedObjectPose(
            @NonNull @EvaObjectType String objectType,
            @NonNull float[] modelMatrix) {

        this.objectType = objectType;
        this.modelMatrix = modelMatrix;
    }

    public float[] getModelMatrix() {
        return modelMatrix;
    }

    @EvaObjectType
    public String getObjectType() {
        return objectType;
    }

    @Override
    public String toString() {
        return "SharedObjectPose{" +
                "objectType='" + objectType + '\'' +
                ", modelMatrix=" + Arrays.toString(modelMatrix) +
                '}';
    }
}
