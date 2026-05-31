/*
 *  Copyright 2015 Martin Hristov.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.jso.impl;

/*
 * Allows custom JS generation of $rt_callWithReceiver(...) in JSAliasRenderer.java
 * from jso-impl.
 */
public abstract class JSAliasRendererCustomWrapper {
    private static JSAliasRendererCustomWrapper val;

    public static JSAliasRendererCustomWrapper get() {
        return val;
    }

    public static void set(JSAliasRendererCustomWrapper val) {
        JSAliasRendererCustomWrapper.val = val;
    }

    public abstract String generate(String classAndMethodName);
}
