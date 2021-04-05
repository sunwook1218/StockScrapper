# StockScrapper
StockScrapper는 Jsoup라이브러리를 이용하여 주식 가격정보를 실시간으로 불러올 수 있는 라이브러리입니다.  
Naver 증권탭에 있는 데이터를 가져오며 라이브러리의 잦은 사용시 Naver로부터 IP Block을 당할 수 있습니다.  

# Usage
```java
Scrapper scrapper = new VolumeScrapper();
scrapper.getList(); // 거래량 상위 30종목을 List에 담아 return 합니다.
```

...
