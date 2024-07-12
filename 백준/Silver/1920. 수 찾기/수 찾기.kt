package org.haeum

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()
    val str = mutableMapOf<String, Int>()
    var st = StringTokenizer(readLine())

    while (st.hasMoreTokens()) {
        str[st.nextToken()] = 1
    }

    val m = readLine()
    st = StringTokenizer(readLine())

    while (st.hasMoreTokens()) {
        if (str.containsKey(st.nextToken())) {
            bw.write("1\n")
        } else {
            bw.write("0\n")
        }
    }


    bw.flush()
    bw.close()
}