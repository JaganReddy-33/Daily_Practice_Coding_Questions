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
6b826868d9d78e5c6153adcb5087891e216ccf7be9791277b62dc90a8a7cb48e6c976559db15d5d711c683f120732920f5649fc43c7fb6465f1f887af67bc809d6728b15935d5df4bb2c57:81ca206a6fa1329c437017a13f86e1e9:548d8be1d0da20ee1aeaee357c30e6bc
```

**Output**
```text
26f3700809a0c383ca8143e34b168d32315aea5013eb34e05a9e232a9975a221ba4595f1a003ae72e2d6091344c9808decfdce8854e1e82e:f7fae3229dc32af7352bcf082fddde2a:7f53040a9151f1fb21b215ca947f205c
```


### Sample Case 4

**Input**
```text
a27406ca9f66eb3b2e1d2be68478d4d944fbd9215d54e3d40fe41f0cdf19543562afd31df35920c8cbf0d1d88f4748ff63131161f8450d6bf4f073c36beec4caf5b031c9d6:f8b0877ba9570f36cc126b174a9040f3:c30dfc170dad3f131d55084362e4fab9
```

**Output**
```text
0b32df372790b2a50697db5eb5052cb499b0a01a13a1ecdc0e1c78850ebce587e78d0afecc79a1632420711c348e8faa4cee01e951ffcf:0a679128a6d9673b2721e1aee1ad6396:e628119787085e44e3e01d585e5e5213
```


### Sample Case 5

**Input**
```text
16631609240cef974e31358a57313aa41217a1e6f2c8c421704ce0ba9ba9bdc35e019b368ecefc11641f845ae306f2acf739fa7bf259de493a168e869d4e0fab3c42ac36ff17386ea20715b18a2bff73aab71e:eceefadc2f433c7db1ab920f7676c3d0:f8aba3c6d74f9fc46235afc047f84aca
```

**Output**
```text
2fed95594fb9f371e69819930a50f6c997340154961490c248e69eb6b33443f9cf078d86947ac8acd93ad2a93d29af1ba624eb641a2e056f26a6513c62b7:ed6c4801258e7e547f101a1cad2e9e86:885a5d8dbb4ba50b634ef6f067536589
```


### Sample Case 6

**Input**
```text
177b7f777d560226cc486f29a1ac94acde089d2bcee231dd9e01427cb8f5421f15298de7f1cef43194a0bf8835414a22342ef931e56713a393623a016bbbaa9f7e0ee5444f3f93230f82e02ae2:8ce24271333bbb71cabb9474141c6f45:e3a6c2c03e342213489a0087973d4532
```

**Output**
```text
623eb1c9c220c5ab43cdc04605ddafeae98a0eee3b72e37a8ccbb5dbad73dbbfa2a580dbf16b3234d7b30313559500bbf72b7a1676b3c5e7af82:d142fa738b7796c8761f10fa20ae224b:679e81ce1116d0de884511612e5975e8
```


### Sample Case 7

**Input**
```text
964aea43d3d968ca8817a45d22dfb2a8adddb6f3d96df092b88b7b7fee476da98c13258dc813730a4255099144e502e0573c29e860be361f105da62929f096a5bb92b17e4bd444e20ba1f440be8d56d55b79620e387ef9e37b57a3f4d57240cba84d2aff70f214de:f4988d795e75228eaed77cd64c4231cd:fd3b1bbbd1df8202d6c856ae5d71baab
```

**Output**
```text
811bd7d58bb4aa5643d467493421e23c26b92d94b0c8e1500b6eb3e72d735fbafc5f58c0d99da66f8329d039eb7388ea594e4beb890bd65a65dd0504c3ecf723174e067ff3acefac9f86a3d0b3948b3d89e375b8e1:5287580fcb81fd0a9ab5e6890d97c236:4de3bc7d50a8a786958243cd1b1b2d57
```

