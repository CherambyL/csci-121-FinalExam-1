# 20 Points

# cstring

The class `FinalExam` contains a static method with the following signature,
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:#5959e2;font-weight:bold;">
public static char[] cstring(String aString)
</p>

A c-string is an array of characters ending in a '\0'. 

Implement the method `cstring()` so that it takes a Java string and returns c-string, where each character at index in the aString 
is located at the same index in the character array.  The method should return `null` if `aString` is a `null`

For example,

```java
char[] c = FinalExam.cstring("water");
```

The result is the array <span style="font-family: 'courier new', courier;">c</span> that looks as follows,
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
c <br>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
'w'
</span>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
'a'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
't'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'e'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'r'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'\0'
</span>
</p>

<p>Looking at another example, </p>

```java
char[] c = FinalExam.cstring("");
```

The returned array c looks like,
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
c <br>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
'\0'
</span>

looking at yet another example,

```java
char[] c = FinalExam.cstring("clearly");
```

The result is the array <span style="font-family: 'courier new', courier;">c</span> that looks as follows,
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
c <br>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
'c'
</span>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">
'l'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'e'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'a'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'r'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'l'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'y'
</span>
<span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">
'\0'
</span>
</p>

<p>
<span style="padding:3px 3px 3px 3px; border-bottom: red solid 1px; color:#ff0000;">Note:</span>
<span style="color:red;">
This should work for a string of length 0, 1, or *N*.
</span>
</p>
<p>
This coding problem is not templated.  You will need to clone the repo and code it in IntelliJ.  
A test is provided, as is done for all Recitations and Skill Builders.  Once you have completed 
the coding, please submit it on CodeGrade.
</p>