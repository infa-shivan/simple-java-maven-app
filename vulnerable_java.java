# Alerts due to a comparison of a narrow type with a wide type in loop condition (integer overflow).
# See https://github.com/github/codeql/blob/main/java/ql/src/Security/CWE/CWE-190/ComparisonWithWiderType.ql

package com.vulnerable;

public class Overflow {

    void foo(long l) {

             for(int i=0; i<l; i++) {
                      // do something
             }
     }

    public static void main(String[] args) throws Exception{
             // do something
    }
}