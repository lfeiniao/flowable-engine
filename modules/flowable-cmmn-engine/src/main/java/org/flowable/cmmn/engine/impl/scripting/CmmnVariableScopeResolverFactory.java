/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.cmmn.engine.impl.scripting;

import org.flowable.cmmn.engine.CmmnEngineConfiguration;
import org.flowable.engine.common.impl.AbstractEngineConfiguration;
import org.flowable.engine.common.impl.scripting.Resolver;
import org.flowable.engine.common.impl.scripting.ResolverFactory;
import org.flowable.variable.api.delegate.VariableScope;

/**
 * @author Tom Baeyens
 * @author Joram Barrez
 */
public class CmmnVariableScopeResolverFactory implements ResolverFactory {

    @Override
    public Resolver createResolver(AbstractEngineConfiguration engineConfiguration, VariableScope variableScope) {
        if (variableScope != null) {
            return new CmmnVariableScopeResolver((CmmnEngineConfiguration) engineConfiguration, variableScope);
        }
        return null;
    }

}