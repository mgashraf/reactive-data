/* ============================================================================
*
* FILE: MethodDetail.java
*
The MIT License (MIT)

Copyright (c) 2016 Sutanu Dalui

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*
* ============================================================================
*/
package com.reactivetechnologies.platform.rest;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

public class MethodDetail
{
  
  public Method getM() {
    return m;
  }
  private URIDetail uri;
  private final Method m;
    
  public MethodDetail(Method m) {
    super();
    this.m = m;
  }
  private final Map<Integer, String> qParams = new TreeMap<>();
  private final Map<Integer, String> pParams = new TreeMap<>();
  public Map<Integer, String> getpParams() {
    return pParams;
  }
  public Map<Integer, String> getqParams() {
    return qParams;
  }
  public void setQueryParam(int i, String value) {
    qParams.put(i, value);
  }
  public URIDetail getUri() {
    return uri;
  }
  public void setUri(URIDetail uri) {
    this.uri = uri;
  }
  public void setPathParam(int i, String value) {
    pParams.put(i, value);
  }
}