# URL Lexicographical Sorter

## Description

<p>Sort and print unique URLs in lexicographical order.</p>

## Input Format

<p>A single line containing multiple URLs separated by commas.</p>

## Output Format

<p>Print the unique URLs in lexicographical order, each on a new line.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
https://openai.com,https://google.com,https://openai.com,https://github.com
```

**Output**
```text
https://github.com
https://google.com
https://openai.com
```


### Sample Case 2

**Input**
```text
http://www.apple.com,http://www.microsoft.com,http://www.apple.com,http://www.google.com
```

**Output**
```text
http://www.apple.com
http://www.google.com
http://www.microsoft.com
```


### Sample Case 3

**Input**
```text
85e4e6c5831308d4c9cc16ddcd8785c86a5c5908fe92f0693c039aba0fb2127b1cdd805b5827de23047c0483d7ca50a6fcb18e445d701b41de1aea7cbb3cf96def1c503e154f2c78e151ad:501d2f23df438945129a1d9609116214:03529acff45dc7978278f0ffc2b0162e
```

**Output**
```text
3c179a1d64bb0873929a7ab9eeac7ad5680b9196e29f6c0e2897fff225c77e93a253b5b95a2739218d223bae976a6cfb06240ad8426ad9d7:e1833f2d8b14b059a2a5cd0ae697e280:40d2c74ac447f31d2a066975062068a0
```


### Sample Case 4

**Input**
```text
1b3759d0014753c37a130b23986e524dbc52b5f1581165a7921d5ec15a60c729edf7e8750ecb1bb887045723e9e5a6f0bc44bf61a3f42db111e42288bad1140c76f5f9cdff:1bd01b282d5aa69d7056e183f215d230:666e537c67a0d7bb1a8a1c80d5f45219
```

**Output**
```text
31c811e2a42c5e823b97ce890a16da7c4ed4c8fc591546fc874dff8e837c3798ef270524105f2f3fcfc7692a050876c93029d30f804c53:a38c210b03cd75515dc2abe77cd28f10:fc90eaedf5606adaddd428f8c32f5a23
```


### Sample Case 5

**Input**
```text
79036e3441defb5aa6ad25443ab147a6bda23cdbd7afda062b7b829a65444961c9e836ff6eb7bcec5c9b31ab0f1d548c83767d3bd03b99415a55e32c9673ae4044ef080fee9803861ffe49af859aa9069f0ea6:47ef68034609800ccad5d3fdca46b665:23cd15dc948931f5653f96d87ab0f7fb
```

**Output**
```text
29cdf26316a57ac13d9575ef26d4f989a1ef6eadacdc262dc3c7f8f3a76d32f5afb28b1ed4a0c62f1df7608ac3e200f40c2a89f95135c1c1d5ddc3eb26f0:20170ae3eb82f19d7e6e45d83676d1e2:9d63ad2397b9a31b7a142b73c2ab7690
```


### Sample Case 6

**Input**
```text
8ffe2398c08146757a1b2da2c940bd911eaf60079b9f65d6003058f0fe3b1bfa16a3357abf23808b79dc934d02c71d4571ab309e0cf950c928cee51996d798f81cdce5b7165055612c943da8a9:602c58d921e2b2cb2c301b8e501c612e:4dc4abf4e9a530f9fd1e28d0cd9d2ab5
```

**Output**
```text
72a5a2fe02ae6f3bd1957340df0b9166f135f967efbad3cd08d4fcb71db85b8910d547d560928ea271ff2c03f3fb809b009a513cab460b3c2da0:aed2e2fb4eb960a00403ce0298bc90de:7aa973c27a41c05d49b2d0ba808f0662
```


### Sample Case 7

**Input**
```text
fd2275bb7f3404f73f139eccf2352017010224586b8452d124c160b91a587d8512aa3be87f3243ffa926d204ebf538c575373500aa0df4ad59adc2d86c24c07f5e83e47c181c3571306d385fc4f8b65d5cbe8116116bce9703320e4ae9fb7e0b5865d341ca6ba3bc:68a5a243b26aefdfb93570cd81958140:a55b72d48bf5ec902e324fd510bb2503
```

**Output**
```text
c0c1eac57e7711458b236f90d6b59c56a447296599e84a0da56fb64dcaf5f03187afe126c76d150b1e3b84122947911c2b15fa3bb8c1635b234d2e0f91b43d37471f6b72d8ea4a1e63aa839469c6c678dfb4934e24:21917a990f77834ba07cabae70f7d101:08ed22ff01d17fac697c1bd69cd668ed
```

