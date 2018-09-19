package com.lsg


public class GroovyTest22 {


}

def vesion = 1

//assert vesion == 2

//括号是可选的
println(vesion)

//字符串
def s1 = "imooc"
def s2 = "gradle version is ${vesion}"
def s3 = '''my
name is 
imooc'''
println(s1)
println(s2)
println(s3)

//集合api
//list
def buildTools = ['ant', 'maven']
buildTools << 'gradle'
assert buildTools.getClass() == ArrayList
assert buildTools.size() == 3
//map
def buildYears = ['ant': 2000, 'maven': 2004]
buildYears.gradle = 2009

println(buildYears.ant)
println buildYears['gradle']
println buildYears.getClass()

//闭包   一个代码块,相当于方法,又是一个mi函数

def c1 = {
    v ->
        println(v)
}
def c2 = {
    println('hello')
}

def method1(Closure closure) {
    closure('param')

}
def method2(Closure closure){
    closure()
}

method1 (c1)
method2 (c2)

