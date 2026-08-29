# Unique Domain Extractor

## Description

<p>Develop a program that reads a single line of input containing multiple URLs in CSV (Comma Separated Values) format, extracts the domain names from these URLs, and prints each domain name once, removing duplicates.</p>

## Input Format

<p>A single line containing multiple URLs separated by commas. There are no spaces between the URLs and the commas.</p>

## Output Format

<p>Print the unique domain names extracted from the URLs, each on a new line.</p>

## Sample Cases

### Sample Case 1

**Input**
```text
https://www.google.com,https://www.google.com,http://www.example.com,https://www.google.com
```

**Output**
```text
www.google.com
www.example.com
```


### Sample Case 2

**Input**
```text
http://www.facebook.com,https://www.twitter.com,http://www.instagram.com,http://www.facebook.com
```

**Output**
```text
www.facebook.com
www.twitter.com
www.instagram.com
```


### Sample Case 3

**Input**
```text
3a7ef93df376ae4f11c0259066427dd8e96066829c11e69d61fc16e91d4ae26e984bdec4194373ca4ecfecfe17c280b3dd762c42423060571da94520bb89a25e514e3481b653b62fa9ad90e0e6f35874cf4baf6cd238b65968c7da363e33bffa61464d3c:a3845e1569ab985daea85e804a869e88:ef1194cfb841066a683279b563c1877b
```

**Output**
```text
2eb06e986a8dc555a56534c337eba037946dcc22d3498295f23c72dc160d36b1ca95f40656b966e4dc6254ed83e494019d00412e7d:11c4fca57afd627a93825f9ec216c64d:356e6618584736f8afb349e644b2c9e8
```


### Sample Case 4

**Input**
```text
51f07d3a6d2c656a938a9f515b2200f6287b260b633b222986a1dfbfa2e0cd0268c600debaf3950d9e9d2381e1b3562bd55d1cba6c848f54956650af31e8e233f1e5ffdcb24c52211816b395b979e0549d3ede9fa71798d5d461:001d0000c9f10e7b0dc2d5fafa572925:aaa5dd00d3193ca0e2a9fbbd1381f7ec
```

**Output**
```text
99fe875ddd6f87e211f68be33ada727836688c76cee1574c5eac1ad586e6295aa62ee6cbac2214b638d3ccefddcd7f5b65f79560bc136e111821a58eda:51377cc4139de5d94089958b1124b524:6fd3b0154a02220ae2caf58ba8064f83
```


### Sample Case 5

**Input**
```text
f64258ea077ddf78fda38fd1dcf111aeb57752e19d7496ed5af6f9e0ba455fda3ff9c6136dc3af8c173fe167066196ede57dd3c0a05074bfea7c63bd02aa70a2f784df26b1af4c2d7689a07aad4fef329d36eaf4367ec71559e6830331:6f09483126f0e340f573130f99c806d5:9317a8521d52ded9509bc4b4bc7c5ce7
```

**Output**
```text
10cf4fa690e219416bf30b1e5465c893a844fc09a0c7338eae97d342269b777b06cb479f5d97f1340d24a521ca48:a512af668bacfbdf274f810dac6ea3ba:3bc39e862bdfaf82fb021dc859c56272
```


### Sample Case 6

**Input**
```text
6ec87dac2c1c29d868c24a1c85c4cd279fa4aa4a52fa66a75ae865437b291c3b89839c60186de9f14b1574503da1e43926bc8077bc73846a73e61ab836a5a62b357b2ecc8127e95a122a0de09a3e2eedaf1c5cbcb68252e2c0e79705fda4c7d5de2c1a21194cc42b0e:dda74854baeb60578750841fef371f20:e3d523e3ad8759d9c8eab5169e433719
```

**Output**
```text
cd3b39e85c1e7e61ce21eccb375badf838ce20dcef458cd5fab4e6aeee4af2d55e0391ebdc9ea2cf63dc8871e6765e72e3d947:251c46a7af07b8662ed1e18bb585690a:e60b44e23e743132853bfae02c0ffe7b
```


### Sample Case 7

**Input**
```text
580eac743aa2abe6a97de8b286da5c2c6bd9f5abb8233cd22986c31552026db63d6257918306aa8e0d82678edf07532871981cdee18520e5e45c614edd0ff0e79630773eee19acbbe6da:e386546aab776d6c5d030cf4b41322f0:a89d1b3d73682607709f612ed67aeb99
```

**Output**
```text
07fe47643b3cc957877d4cc6e2b5497b780d81e42462879913949ff15b6bb9af2b7ab255:4339f785c39a086a6df47380c10208c5:3ba58d755cbea43d3fb2fffe852fe147
```

