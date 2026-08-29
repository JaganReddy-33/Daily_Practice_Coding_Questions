# URL Company Extractor

## Description

<p>Extract and sort unique company names from a given list of URLs.</p>

## Input Format

<p>A single line containing multiple URLs separated by commas. There are no spaces between the URLs and the commas.</p>

## Output Format

<p>Print the unique company names extracted from the URLs in alphabetical order, each on a new line.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
https://www.google.com,https://www.microsoft.com,https://www.apple.com,https://www.google.com
```

**Output**
```text
apple
google
microsoft
```


### Sample Case 2

**Input**
```text
http://www.facebook.com,https://www.twitter.com,http://www.instagram.com,http://www.facebook.com
```

**Output**
```text
facebook
instagram
twitter
```


### Sample Case 3

**Input**
```text
56841ae7dec0520888dcfe26badaee5cc310c8c27a60638d37e7105ade9fad67d3614c79e474742096ef265f67eba5556a8960b9d023125d27aeeecf8d8a57909524a165dfaa298f359654a29333fecb314e251a5bfe2a884ba1e4a94fcbbe8f52fa3cd3a03066bf5f634f11cdfdad2bcd4387a74c:d057f3700745d6ecfc82101350b4434e:8c5519cbf331d7011601c93543c632e4
```

**Output**
```text
bedb4399f249105d09641f149651ef698852aa4be731a6f4f200a14f37e9:b1f8f79644430bf6647f727bdb81b035:e16c67e9e489e06496f98bfd77946699
```


### Sample Case 4

**Input**
```text
14a7be5d3711e6d6c86dc58c33788f35c4b131ca02df4017e2b6255cd73a6dceec60dbb61630382f96b84c059eb7390c5f69a2e2fbbb69d17ba0027255633940574d9a07215fba7499d24b4f185f99d8afee10934cd0b9376b85:74935dfe23e40dd60c928236ebb33934:260728dbe6cb02640912df3ec7d73cfa
```

**Output**
```text
7f44ca9fd8978c81c177f35c127aa98b26e42ea8a14376afc725ef21f4:fc9841a24e2d9fe794088475067d6634:73ac4100a18671afddfeb3383d161b25
```


### Sample Case 5

**Input**
```text
61814b10ffc39a995aae6b9aab38258c61d071374f119a6b8626aea555840a5d16ebd1dd07ed67fe43ec57b0b596fb1e0ef19c522cdfbec075f618d16ddc84c652c0a56182d6e70f8185959dfce5892faa8c128fae4b62b3a62d723213:7b24500a69c73d4cff2aee4d43a5b15b:ab09390d3cf6523cada38a74592d30bc
```

**Output**
```text
6858d9a2e3e86170c62e1f895249cc497898770f96b1:942a8af123f946aa07a821bb7423d22c:383ffee4d529d9897c56cc2931446dce
```


### Sample Case 6

**Input**
```text
5df7b3133e36ef3887db76c3460fa2a10f0a555635c432a09f7e81895881d338846f030a97f6bc36d4076f1863dc46bd004ba7e4e4fbd37575669d4b149383ed93887424998f374526795dc585bcfce1194ee90492da6b12a29409fc180781ab15d478392c:750608950237d6152746a683df4fe18f:ebb8519fed4d7e34f16064a2ff9e9886
```

**Output**
```text
863c94f1e170b50ccb4b32a435ff7e588302d92ca5bbafab06a9160278f44032e4100aea15:ef4eacd079155de33a1790073aa2ad13:271b9695a976a44e87091e2ef9958f92
```


### Sample Case 7

**Input**
```text
7102a58c62394f77c0829d80b1d454cf952fa2a4c72a31514f29c96015e94c0123f7462e586ac18bae5b84a30369a43add501548208b37126fa43c5c12a8619f084f235e7aa511a943d77aa91e5bccda:09a9574661435556015af819483438d2:1db05af93dd03437b89439f1f81c8954
```

**Output**
```text
8255b81184a5cf4fc22078e2171ff85ca8ce6486154885d39d8f2d3c3ac1b0175e:c1332d63fe50b10afccf71e8cadc32e6:639069aaf423364723af64d4c768c464
```

